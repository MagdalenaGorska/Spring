package pl.sda.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sda.model.HelloWorld;

public class XmlConfigurationMain {

    public static void main(String[] args) {

        //tworzymy obiekt kontenera
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld hw = ac.getBean("helloWorld", HelloWorld.class);
        hw.hello();
    }
}
