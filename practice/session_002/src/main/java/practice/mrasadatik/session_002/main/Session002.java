package practice.mrasadatik.session_002.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import practice.mrasadatik.session_002.beans.Vehicle;
import practice.mrasadatik.session_002.config.ProjectConfig;

public class Session002 {
    public static void main(String[] args) {
        var vehicle1 = new Vehicle();
        vehicle1.setName("Car");
        System.out.println("vehicle1 = " + vehicle1.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var vehicle2 = context.getBean("vehicle", Vehicle.class);
        System.out.println("vehicle2 = " + vehicle2.getName());

        var hello = context.getBean("hello", String.class);
        System.out.println("hello = " + hello);

        var number = context.getBean("number", Integer.class);
        System.out.println("number = " + number);
    }
}
