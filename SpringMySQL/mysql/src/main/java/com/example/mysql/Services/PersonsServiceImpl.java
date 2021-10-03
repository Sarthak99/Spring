package com.example.mysql.Services;

import com.example.mysql.Entities.Persons;
import com.example.mysql.Repositories.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonsServiceImpl implements PersonsService {

    @Autowired
    private PersonsRepository personsRepository;

    @Override
    public List<Persons> getAllPersons(){
        List<Persons> personsList = personsRepository.findAll();
        return personsList;
    }
}
