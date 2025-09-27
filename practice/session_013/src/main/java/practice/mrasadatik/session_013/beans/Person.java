package practice.mrasadatik.session_013.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    public Person() {
        System.out.println("Person is created");
    }

    private String name;

    @Autowired(required = true) // default is true
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @PostConstruct
    public void init() {
        this.name = "Mr AsadAtik";
    }
}
