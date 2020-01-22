package com.crud.bootdemo.service;

import java.util.List;

import com.crud.bootdemo.model.Person;

public interface PersonService {

    Person createPerson(Person person);

    Person getPerson(Long id);

    Person editPerson(Person person);

    void deletePerson(Person person);

    void deletePerson(Long id);

    List<Person> getAllPersons(int pageNumber, int pageSiz);

    List<Person> getAllPersons();
}
