package com.cars.Repository;

import com.cars.Domain.Person;
import com.cars.Mapper.PersonMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest
public class PersonRepositoryTest {
    @Autowired
    PersonRepository personRepository;
    Person person;

    @Before
    public void setUp(){
        person = new Person();
        person.setGuid("1");
        person.setAge(2);
        person.setName("张三");
    }

    @Test
    public void findById(){
        personRepository.save(person);
        assertTrue(personRepository.findOne(person.getGuid()).getGuid().equals("1"));
    }

}