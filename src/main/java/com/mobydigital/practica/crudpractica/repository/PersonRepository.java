package com.mobydigital.practica.crudpractica.repository;

import com.mobydigital.practica.crudpractica.model.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

}
