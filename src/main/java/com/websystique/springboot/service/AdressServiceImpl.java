package com.websystique.springboot.service;


import com.websystique.springboot.model.Adress;
import com.websystique.springboot.repositories.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("adressService")
@Transactional
public class AdressServiceImpl implements AdressService {

    @Autowired
    private AdressRepository adressRepository;


    @Override
    public Adress saveAdress(Adress adress) {
        return adressRepository.save(adress);
    }

}
