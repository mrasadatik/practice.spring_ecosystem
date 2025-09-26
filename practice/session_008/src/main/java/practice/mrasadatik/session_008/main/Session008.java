package practice.mrasadatik.session_008.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import practice.mrasadatik.session_008.beans.Vehicle;
import practice.mrasadatik.session_008.config.ProjectConfig;

public class Session008 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var vehicle = context.getBean(Vehicle.class);
        System.out.println("vehicle = " + vehicle.getName());

        vehicle.printHello();

        context.close();
    }
}
