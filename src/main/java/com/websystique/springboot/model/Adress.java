package com.websystique.springboot.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="adress")
public class Adress implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;//а в таблице у меня инт ничего?

//<-------!Нужен ли геттер сеттер? все ли корректно?!-------->
    @ManyToOne
    @JoinColumn(name="adress_id")
    private User user;
//<-------!!-------->

    @Column(name="region")
    private String region;

    @Column(name="city")
    private String city;

    @Column(name="street")
    private String street;

    @Column(name="num_house")
    private Integer num_house;

    @Column(name="appartment")
    private Integer appartment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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


//НУЖНО ЛИ ПЕРЕОПРЕДЕЛЯТЬ ТУСТРИНГ ХЭШКОД И ИКВЭЛС
}
