package com.hastycode.SpringCrud.service;

import com.hastycode.SpringCrud.model.Country;
import com.hastycode.SpringCrud.repo.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private CountryRepo repo;

    @Autowired
    public CountryService(CountryRepo repo) {
        this.repo = repo;
    }

    public List<Country> getAllCountries() {
        return repo.findAll();
    }


    public Country getCountryById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Country addCountry(Country country) {
        return repo.save(country);
    }

    public Country updateCountry(int id, Country country) {
        return repo.save(country);
    }

    public void deleteCountryById(int id) {
        repo.deleteById(id);
    }
}
