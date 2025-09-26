package practice.mrasadatik.session_006.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import practice.mrasadatik.session_006.beans.Vehicle;
import practice.mrasadatik.session_006.config.ProjectConfig;

public class Session006 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var vehicle = context.getBean(Vehicle.class);
        System.out.println("vehicle = " + vehicle.getName());

        vehicle.printHello();
    }
}
