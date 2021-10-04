package com.digitalInovation.personapi.controller;

import com.digitalInovation.personapi.dto.request.PersonDTO;
import com.digitalInovation.personapi.entity.Person;
import com.digitalInovation.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }

    public List<Person> listALL(){
        return PersonService.listAll();
    }
}
