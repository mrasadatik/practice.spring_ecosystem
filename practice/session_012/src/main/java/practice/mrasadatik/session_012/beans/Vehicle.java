package practice.mrasadatik.session_012.beans;

import org.springframework.stereotype.Component;

public class Vehicle {

    public Vehicle() {
        System.out.println("Vehicle is created");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle is " + name;
    }
}
