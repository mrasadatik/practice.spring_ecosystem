package practice.mrasadatik.session_015.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component("vehicleBean")
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

    @PostConstruct
    public void init() {
        this.name = "Mercedes-Benz G63";
    }

    @Override
    public String toString() {
        return "Vehicle is " + name;
    }
}
