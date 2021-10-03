package com.example.mysql.Services;

import com.example.mysql.Entities.Persons;

import java.util.List;

public interface PersonsService {
    List<Persons> getAllPersons();
}
