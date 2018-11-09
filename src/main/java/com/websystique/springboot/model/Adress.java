package com.websystique.springboot.model;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="adress")
public class Adress implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;//а в таблице у меня инт ничего?

//<-------!Нужен ли геттер сеттер? все ли корректно?!-------->
//    @ManyToOne
//    @JoinColumn(name="adress_id")
//    private User user;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
@JoinColumn(name ="adress_id")
private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Adress adress = (Adress) o;

        if (id != null ? !id.equals(adress.id) : adress.id != null) return false;
        if (region != null ? !region.equals(adress.region) : adress.region != null) return false;
        if (city != null ? !city.equals(adress.city) : adress.city != null) return false;
        if (street != null ? !street.equals(adress.street) : adress.street != null) return false;
        if (!adress.num_house.equals(num_house)) return false;
        return appartment != null ? appartment.equals(adress.appartment) : adress.appartment == null;
    }
}
