package com.mobydigital.practica.crudpractica.controller;
import com.mobydigital.practica.crudpractica.model.entity.Person;
import com.mobydigital.practica.crudpractica.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/")
    public List<Person> getAll()
    {
        return personService.getAll();
    }

    @GetMapping("/{id}")
    public Person get(@PathVariable long id)
    {
        return personService.getById(id);
    }

    @PostMapping("/")
    public void add(@RequestBody Person person)
    {
        personService.add(person);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id)
    {
        personService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Person person,@PathVariable long id)
    {
        personService.update(person,id);
    }

}
