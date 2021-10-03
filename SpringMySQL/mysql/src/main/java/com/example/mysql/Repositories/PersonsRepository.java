package com.example.mysql.Repositories;

import com.example.mysql.Entities.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonsRepository extends JpaRepository<Persons, Integer> {



}
