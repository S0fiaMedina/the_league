package com.example.theleague.Country.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.theleague.Country.domain.model.Country;

public interface CountryRepositoryMySQL extends JpaRepository<Country, Long> {
        
}
