package practice.mrasadatik.session_003.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import practice.mrasadatik.session_003.beans.Vehicle;
import practice.mrasadatik.session_003.config.ProjectConfig;

public class Session003 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var vehicle1 = context.getBean("vehicle1", Vehicle.class);
        System.out.println("vehicle1 = " + vehicle1.getName());

        var vehicle2 = context.getBean("vehicle2", Vehicle.class);
        System.out.println("vehicle2 = " + vehicle2.getName());

        var vehicle3 = context.getBean("vehicle3", Vehicle.class);
        System.out.println("vehicle3 = " + vehicle3.getName());
    }
}
