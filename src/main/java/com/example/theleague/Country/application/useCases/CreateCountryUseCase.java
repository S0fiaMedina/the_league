package com.example.theleague.Country.application.useCases;

import org.springframework.stereotype.Service;

import com.example.theleague.Country.domain.model.Country;
import com.example.theleague.Country.domain.repository.CountryRepository;

@Service
public class CreateCountryUseCase {
    
    private final CountryRepository countryRepository;

    public CreateCountryUseCase(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public void saveCountry(Country country){
        this.countryRepository.saveCountry(country);
    }

    public void updateCountry(Country country){
        this.countryRepository.updateCountry(country);
    }

    public void deleteCountry(long id){
        this.countryRepository.deleteCountry(id);
    }
}
