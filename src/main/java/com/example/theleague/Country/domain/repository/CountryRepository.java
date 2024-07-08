package com.example.theleague.Country.domain.repository;

import java.util.List;
import java.util.Optional;

import com.example.theleague.Country.domain.model.Country;

public interface CountryRepository {
    
    public Optional<Country> findCountryById(Long id);

    public List<Country> findAllCountries();

    public void updateCountry(Country country);

    public void saveCountry(Country country);

    public void deleteCountry(Long id);

}
