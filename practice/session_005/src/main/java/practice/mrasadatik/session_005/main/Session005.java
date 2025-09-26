package practice.mrasadatik.session_005.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import practice.mrasadatik.session_005.beans.Vehicle;
import practice.mrasadatik.session_005.config.ProjectConfig;

public class Session005 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var vehicle1 = context.getBean(Vehicle.class);
        System.out.println("vehicle1 = " + vehicle1.getName());

        var vehicle2 = context.getBean("MT", Vehicle.class);
        System.out.println("vehicle2 = " + vehicle2.getName());

        var vehicle3 = context.getBean("RR", Vehicle.class);
        System.out.println("vehicle3 = " + vehicle3.getName());

        var vehicle4 = context.getBean("LandCruiser", Vehicle.class);
        System.out.println("vehicle4 = " + vehicle4.getName());

        var vehicle5 = context.getBean("JW", Vehicle.class);
        System.out.println("vehicle5 = " + vehicle5.getName());

        var vehicle6 = context.getBean("Mustang", Vehicle.class);
        System.out.println("vehicle6 = " + vehicle6.getName());
    }
}
