package com.websystique.springboot.repositories;

import com.websystique.springboot.model.Adress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressRepository extends JpaRepository<Adress, Long> {

    Adress findById(long id);
}
