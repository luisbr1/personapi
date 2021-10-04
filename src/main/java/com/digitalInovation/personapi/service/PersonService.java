package com.digitalInovation.personapi.service;

import com.digitalInovation.personapi.dto.request.PersonDTO;
import com.digitalInovation.personapi.entity.Person;
import com.digitalInovation.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PersonService {
    private static PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public static List<Person> listAll() {
        List<Person>allPeople = personRepository.findAll();
        return null;
    }

    public String createPerson(@RequestBody Person person){
        Person savedPerson = personRepository.save(person);
        return "API Test!";
    }



}
