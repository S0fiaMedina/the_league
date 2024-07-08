package com.example.theleague.Country.infrastructure.outbound;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.theleague.Country.domain.model.Country;
import com.example.theleague.Country.domain.repository.CountryRepository;
import com.example.theleague.Country.infrastructure.CountryRepositoryMySQL;

@Repository
public class CountryRepositoryImpl implements CountryRepository {

    private final CountryRepositoryMySQL countryRepositoryMySQL;

    public CountryRepositoryImpl(CountryRepositoryMySQL countryRepositoryMySQL) {
        this.countryRepositoryMySQL = countryRepositoryMySQL;
    }

    @Override
    public void deleteCountry(Long id) {
        this.countryRepositoryMySQL.deleteById(id);
        
    }

    @Override
    public List<Country> findAllCountries() {
        return this.countryRepositoryMySQL.findAll();
    }

    @Override
    public Optional<Country> findCountryById(Long id) {
        return this.countryRepositoryMySQL.findById(id);
    }

    @Override
    public void saveCountry(Country country) {
        this.countryRepositoryMySQL.save(country);
        
    }

    @Override
    public void updateCountry(Country country) {
        this.countryRepositoryMySQL.save(country);
        
    }
    
}
