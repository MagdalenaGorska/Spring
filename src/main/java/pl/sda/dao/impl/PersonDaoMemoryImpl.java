package pl.sda.dao.impl;

import pl.sda.dao.PersonDao;
import pl.sda.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoMemoryImpl implements PersonDao {

    private List<Person> personList = new ArrayList<>();

    @Override
    public void add(Person person) {
        personList.add(person);
    }

    @Override
    public Person getById(Integer id) {
        //lepsze bo nie użwamy pętli, zapamiętaj!
        return personList.stream()
                .filter(person -> person.getId().equals(id))
                .findFirst() //co najwyżej jeden obiekt
                .orElseThrow(); //rzuci wyjątek, jak go nie znajdzie
    }
}
