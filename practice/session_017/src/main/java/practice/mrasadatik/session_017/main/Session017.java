package practice.mrasadatik.session_017.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import practice.mrasadatik.session_017.beans.Person;
import practice.mrasadatik.session_017.beans.Vehicle;
import practice.mrasadatik.session_017.configs.ProjectConfig;

public class Session017 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean("vehicleBean", Vehicle.class);
        Person person = context.getBean("personBean", Person.class);

        System.out.println("vehicle = " + vehicle);
        System.out.println("person name = " + person.getName());
        System.out.println("person vehicle = " + person.getVehicle());

        vehicle.getVehicleServices().playMusic();
        vehicle.getVehicleServices().moveVehicle();

        person.getVehicle().getVehicleServices().playMusic();
        person.getVehicle().getVehicleServices().moveVehicle();
    }
}
