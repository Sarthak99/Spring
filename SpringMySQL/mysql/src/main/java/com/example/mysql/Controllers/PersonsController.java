package com.example.mysql.Controllers;

import com.example.mysql.Entities.Persons;
import com.example.mysql.Services.PersonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class PersonsController {

    @Autowired
    private PersonsService personsService;

    @GetMapping("/allPersons")
    public ResponseEntity<List<Persons>> getAllPersons(){
        ResponseEntity<List<Persons>> responseEntity = null;
        List<Persons> personsList = personsService.getAllPersons();
        responseEntity = new ResponseEntity(personsList, HttpStatus.OK);
        return responseEntity;
    }
}
