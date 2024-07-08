package com.example.theleague.Country.infrastructure.inbound;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.theleague.Country.application.useCases.CreateCountryUseCase;
import com.example.theleague.Country.application.useCases.FindCountryUseCase;
import com.example.theleague.Country.domain.model.Country;
import com.example.theleague.Country.domain.repository.CountryRepository;

@RestController
@RequestMapping("/country")
public class CountryController {
    
    private final CreateCountryUseCase createCountryUseCase;
    private final FindCountryUseCase findCountryUseCase;

    @Autowired
    public CountryController(CreateCountryUseCase createCountryUseCase, FindCountryUseCase findCountryUseCase) {
        this.createCountryUseCase = createCountryUseCase;
        this.findCountryUseCase = findCountryUseCase;
    }

    // obtener todos los paises
    @GetMapping("/countries")
    public List<Country> getAllCountries(){
        return this.findCountryUseCase.findAllCountries();
    }

    // obtener un pais por id
    @GetMapping("/countries/{id}")
    public List<Country> getContryById(@PathVariable long id){
        return this.findCountryUseCase.findAllCountries();
    }


    // crear pais
    @PostMapping("/countries")
    public void createCountry(@RequestBody Country country){
        this.createCountryUseCase.saveCountry(country);
    }


    // actualizar pais
    @PutMapping("/countries/{id}")
    public void  createCountry(@PathVariable long id, @RequestBody Country country){
        this.createCountryUseCase.saveCountry(country);
    }


    // eliminar pais
    @DeleteMapping("/countries/{id}")
    public void  createCountry(@PathVariable long id){
        this.createCountryUseCase.deleteCountry(id);
    }

}
