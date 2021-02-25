package com.ujiuye.service;

import com.ujiuye.pojo.Person;

public interface PersonService {

    Person query(Person person);

    int savePerson(Person person);

    int deletePerson(Person person);

    int updatePerson(Person person);
}
