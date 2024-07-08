package com.example.theleague.Country.application.useCases;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.theleague.Country.domain.model.Country;
import com.example.theleague.Country.domain.repository.CountryRepository;

@Service
public class FindCountryUseCase {
    
    private final CountryRepository countryRepository;

    public FindCountryUseCase(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    // listar todos
    public List<Country> findAllCountries(){
        return this.countryRepository.findAllCountries();
    }

    // hallar por id
    public Optional<Country> findCountryById(Long id){
        return this.countryRepository.findCountryById(id);
    }
    
}
