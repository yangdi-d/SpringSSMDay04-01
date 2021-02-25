package com.ujiuye.service;

import com.ujiuye.mapper.PersonMapper;
import com.ujiuye.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    PersonMapper personMapper;

    @Override
    public Person query(Person person) {
        return personMapper.login(person);
    }

    @Override
    public int savePerson(Person person) {

            int regist   = personMapper.regist(person);
            return regist;


    }

    @Override
    public int deletePerson(Person person) {
        int delete = personMapper.delete(person);
        return delete;
    }

    @Override
    public int updatePerson(Person person) {
        int update = personMapper.update(person);

        return update;
    }
}
