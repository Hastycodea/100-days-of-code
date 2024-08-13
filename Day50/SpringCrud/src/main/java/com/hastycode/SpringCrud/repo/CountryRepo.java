package com.hastycode.SpringCrud.repo;

import com.hastycode.SpringCrud.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends JpaRepository<Country, Integer> {
}
