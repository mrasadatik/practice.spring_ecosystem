package practice.mrasadatik.session_016.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    private String name;
    private final Vehicle vehicle;

    @Autowired(required = true) // default is true
    public Person(@Qualifier("MBG63") Vehicle vehicle) {
        System.out.println("Person is created");
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    @PostConstruct
    public void init() {
        this.name = "Mr AsadAtik";
    }
}
