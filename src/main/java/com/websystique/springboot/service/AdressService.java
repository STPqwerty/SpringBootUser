package com.websystique.springboot.service;

import com.websystique.springboot.model.Adress;


import java.util.List;

public interface AdressService {

    Adress findById(Long id);

    Adress findByName(String name);

    void saveAdress(Adress adress);

    void updateAdress(Adress adress);

    void deleteAdressById(Long id);

    void deleteAllAdresses();

    List<Adress> findAllAdresses();

    boolean isAdressExist(Adress adress);
}
