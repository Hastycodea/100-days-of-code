package com.hastycode.SpringCrud.controller;

import com.hastycode.SpringCrud.model.Country;
import com.hastycode.SpringCrud.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    private CountryService service;

    @Autowired
    public CountryController(CountryService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String home() {
        return "Welcome home";
    }

    @GetMapping("/country")
    public ResponseEntity<List<Country>> getAllCountries() {
        return  new ResponseEntity<>(service.getAllCountries(), HttpStatus.OK);
    }

    @GetMapping("/country/{id}")
    public ResponseEntity<Country> getCountryById(@PathVariable int id){
        Country country = service.getCountryById(id);
        if(country != null) {
            return new ResponseEntity<>(country, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/country")
    public ResponseEntity<Country> addCountry(@RequestBody Country country) {
        Country country1 = service.addCountry(country);
        if(country1 != null) {
            return new ResponseEntity<>(country1, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/country/{id}")
    public ResponseEntity<Country> updateCountry(@PathVariable int id, @RequestBody Country country) {
        Country newCountry = null;
        newCountry = service.updateCountry(id, country);

        if(newCountry != null) {
            return new ResponseEntity<>(newCountry, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/country/{id}")
    public ResponseEntity<String> deleteCountry(@PathVariable int id) {
        Country country = service.getCountryById(id);

        if (country != null) {
            service.deleteCountryById(id);
            return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Country not found!", HttpStatus.NOT_FOUND);
        }
    }




}
