package com.mobydigital.practica.crudpractica.service;

import com.mobydigital.practica.crudpractica.model.entity.Person;
import com.mobydigital.practica.crudpractica.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAll() {
        return personRepository.findAll();
    }

    public Person getById(long id) {
        return personRepository.findById(id).get();
    }

    public void add(Person person) {
        personRepository.save(person);
    }

    public void update(Person person)
    {
        personRepository.save(person);
    }

    public void delete(long id)
    {
        personRepository.deleteById(id);
    }





}
