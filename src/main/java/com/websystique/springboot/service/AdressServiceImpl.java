package com.websystique.springboot.service;


import com.websystique.springboot.model.Adress;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("adressService")
@Transactional
public class AdressServiceImpl implements AdressService {


    @Override
    public Adress findById(Long id) {
        return null;
    }

    @Override
    public Adress findByName(String name) {
        return null;
    }

    @Override
    public void saveAdress(Adress adress) {

    }

    @Override
    public void updateAdress(Adress adress) {

    }

    @Override
    public void deleteAdressById(Long id) {

    }

    @Override
    public void deleteAllAdresses() {

    }

    @Override
    public List<Adress> findAllAdresses() {
        return null;
    }

    @Override
    public boolean isAdressExist(Adress adress) {
        return false;
    }
}
