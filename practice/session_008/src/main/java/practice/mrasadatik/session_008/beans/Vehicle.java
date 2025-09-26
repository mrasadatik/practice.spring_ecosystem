package practice.mrasadatik.session_008.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initialize() {
        this.name = "Mercedes-Benz G63";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Vehicle bean is being destroyed");
    }

    public void printHello() {
        System.out.println("Hello from Vehicle class");
    }
}
