package practice.mrasadatik.session_017.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import practice.mrasadatik.session_017.services.VehicleServices;

@Component("vehicleBean")
public class Vehicle {

    private String name;
    private final VehicleServices vehicleServices;

    @Autowired
    public Vehicle(@Qualifier("vehicleServiceBean") VehicleServices vehicleServices) {
        System.out.println("Speakers is created");
        this.vehicleServices = vehicleServices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
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
