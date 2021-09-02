package pl.sda.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sda.model.HelloWorld;
import pl.sda.model.Person;
import pl.sda.service.PersonService;
import pl.sda.service.impl.PersonServiceImpl;

public class XmlConfigurationMain {

    public static void main(String[] args) {

        //tworzymy obiekt kontenera
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld hw = ac.getBean("helloWorld", HelloWorld.class);
        hw.hello();
        PersonService ps = ac.getBean("personService", PersonServiceImpl.class);
        ps.add(new Person(1,"Jan", "Kowalski"));

        System.out.println(ps.getById(1));
    }
}
