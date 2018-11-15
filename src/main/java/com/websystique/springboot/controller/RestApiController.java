package com.websystique.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import com.websystique.springboot.model.Adress;
import com.websystique.springboot.service.AdressService;
import com.websystique.springboot.service.AdressUserViewModel;
import org.apache.tomcat.util.digester.ArrayStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.websystique.springboot.model.User;
import com.websystique.springboot.service.UserService;
import com.websystique.springboot.util.CustomErrorType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@RestController
@RequestMapping("/api")
public class RestApiController {

	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

	@Autowired
	UserService userService; //Service which will do all data retrieval/manipulation work

    @Autowired
    AdressService adressService;

    @PersistenceContext
    EntityManager entityManager;

	// -------------------Retrieve All Users---------------------------------------------

	@RequestMapping(value = "/user/", method = RequestMethod.GET)
	public ResponseEntity<List<User>> listAllUsers() {
		List<User> users = userService.findAllUsers();
		if (users.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}

	// -------------------Retrieve Single User------------------------------------------

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getUser(@PathVariable("id") long id) {
		logger.info("Fetching User with id {}", id);
		User user = userService.findById(id);
		if (user == null) {
			logger.error("User with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("User with id " + id 
					+ " not found"), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	// -------------------Create a User-------------------------------------------

	@RequestMapping(value = "/user/", method = RequestMethod.POST)
    @Transactional
	public ResponseEntity<?> createUser(@RequestBody AdressUserViewModel adressAndUser, UriComponentsBuilder ucBuilder) {
		logger.info("Creating User : {}", adressAndUser);

		User user = convertToUser(adressAndUser);

		Adress adress = convertToAdress(adressAndUser);
		if (userService.isUserExist(user)) {
			logger.error("Unable to create. A User with name {} already exist", user.getFirst_name());
			return new ResponseEntity(new CustomErrorType("Unable to create. A User with name " + 
			user.getFirst_name() + " already exist."),HttpStatus.CONFLICT);
		}
        adress = adressService.saveAdress(adress);
        user.setAdress(adress);
		userService.saveUser(user);

        this.entityManager.flush();

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/user/{id}").buildAndExpand(user.getId()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}

	private User convertToUser(AdressUserViewModel adressAndUser) {
		User user = new User();
		user.setId(adressAndUser.getUserId());
		user.setFirst_name(adressAndUser.getFirst_name());
		user.setLast_name(adressAndUser.getLast_name());
		user.setMiddle_name(adressAndUser.getMiddle_name());
		user.setAdress((Adress) adressAndUser.getAdress());
		user.setBirth_date(adressAndUser.getBirth_date());
		user.setEmail(adressAndUser.getEmail());
		user.setPhone_num(adressAndUser.getPhone_num());
		return user;
	}

	private Adress convertToAdress(AdressUserViewModel adressAndUser){
		Adress adress = new Adress();
		adress.setId(adressAndUser.getAddressId());
		adress.setRegion(adressAndUser.getRegion());
		adress.setCity(adressAndUser.getCity());
		adress.setStreet(adressAndUser.getStreet());
		adress.setNum_house(adressAndUser.getNum_house());
		adress.setAppartment(adressAndUser.getAppartment());
		return adress;
	}



	// ------------------- Update a User ------------------------------------------------

	@RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateUser(@PathVariable("id") long id, @RequestBody User user) {
		logger.info("Updating User with id {}", id);

		User currentUser = userService.findById(id);

		if (currentUser == null) {
			logger.error("Unable to update. User with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("Unable to upate. User with id " + id + " not found."),
					HttpStatus.NOT_FOUND);
		}

		currentUser.setFirst_name(user.getFirst_name());
		currentUser.setMiddle_name(user.getMiddle_name());
		currentUser.setLast_name(user.getLast_name());
		currentUser.setPhone_num(user.getPhone_num());
		currentUser.setEmail(user.getEmail());
//		currentUser.setAdress(user.getAdress());
		currentUser.setBirth_date(user.getBirth_date());

		userService.updateUser(currentUser);
		return new ResponseEntity<User>(currentUser, HttpStatus.OK);
	}

	// ------------------- Delete a User-----------------------------------------

	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteUser(@PathVariable("id") long id) {
		logger.info("Fetching & Deleting User with id {}", id);

		User user = userService.findById(id);
		if (user == null) {
			logger.error("Unable to delete. User with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("Unable to delete. User with id " + id + " not found."),
					HttpStatus.NOT_FOUND);
		}
		userService.deleteUserById(id);
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}

	// ------------------- Delete All Users-----------------------------

	@RequestMapping(value = "/user/", method = RequestMethod.DELETE)
	public ResponseEntity<User> deleteAllUsers() {
		logger.info("Deleting All Users");

		userService.deleteAllUsers();
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}

}