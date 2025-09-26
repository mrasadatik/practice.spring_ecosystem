package practice.mrasadatik.session_007.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import practice.mrasadatik.session_007.beans.Vehicle;
import practice.mrasadatik.session_007.config.ProjectConfig;

public class Session007 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var vehicle = context.getBean(Vehicle.class);
        System.out.println("vehicle = " + vehicle.getName());

        vehicle.printHello();
    }
}
