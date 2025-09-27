package practice.mrasadatik.session_011.config;

import org.springframework.context.annotation.*;
import practice.mrasadatik.session_011.beans.Person;
import practice.mrasadatik.session_011.beans.Vehicle;

@Configuration
public class ProjectConfig {
    @Bean("vehicleBean")
    public Vehicle vehicle() {
        var vehicle = new Vehicle();
        vehicle.setName("Mercedes-Benz G63");
        return vehicle;
    }

    @Bean("personBean")
    public Person person() {
        var person = new Person();
        person.setName("Mr AsadAtik");
        person.setVehicle(vehicle());
        return person;
    }
}
