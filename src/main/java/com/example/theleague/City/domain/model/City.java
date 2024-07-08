package com.example.theleague.City.domain.model;

import com.example.theleague.Country.domain.model.Country;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table (name = "city")
public class City {

    // id de la ciudad
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // nombre de la ciudad
    @Column(name = "name", nullable = false)
    private String name;

    // foreign key que hace referencia a pais
    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private Country country;

    // constructor

    public City() {
    }

    // getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }


    

    
}
