package com.websystique.springboot.service;

import com.websystique.springboot.model.Adress;
import com.websystique.springboot.model.User;

import java.util.Date;
import java.util.List;

public class AdressUserViewModel {
    private Long addressId;
    private User user;
    private String region;
    private String city;
    private String street;
    private Integer num_house;
    private Integer appartment;

    private Long userId;
    private String first_name;
    private String last_name;
    private String middle_name;
    private String phone_num;
    private String email;
    private List<Adress> adress;
    private Date birth_date;

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNum_house() {
        return num_house;
    }

    public void setNum_house(Integer num_house) {
        this.num_house = num_house;
    }

    public Integer getAppartment() {
        return appartment;
    }

    public void setAppartment(Integer appartment) {
        this.appartment = appartment;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Adress> getAdress() {
        return adress;
    }

    public void setAdress(List<Adress> adress) {
        this.adress = adress;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
}
