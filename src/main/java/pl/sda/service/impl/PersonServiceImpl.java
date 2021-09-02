package pl.sda.service.impl;

import pl.sda.dao.PersonDao;
import pl.sda.model.Person;
import pl.sda.service.PersonService;

public class PersonServiceImpl implements PersonService {

    private final PersonDao personDao;

    public PersonServiceImpl(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public void add(Person person) {

    }

    @Override
    public Person getById(Integer id) {
        return null;
    }

}
