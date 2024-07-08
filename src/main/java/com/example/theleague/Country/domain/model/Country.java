package com.example.theleague.Country.domain.model;



import java.util.List;

import com.example.theleague.City.domain.model.City;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "country")
public class Country {

    // id autoincremental 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    // nombre del pais
    @Column(name = "name", nullable =  false , length = 200)
    private String name;


    // relacion 1:n con ciudad
    @OneToMany(mappedBy = "country") 
    private List<City> cities;

    // constructor
    public Country() {
    }


    // getters y setters
    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public List<City> getCities() {
        return cities;
    }


    public void setCities(List<City> cities) {
        this.cities = cities;
    }


   

    


}
