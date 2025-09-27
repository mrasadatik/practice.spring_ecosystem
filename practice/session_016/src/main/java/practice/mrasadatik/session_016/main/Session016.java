package practice.mrasadatik.session_016.main;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import practice.mrasadatik.session_016.beans.Person;
import practice.mrasadatik.session_016.beans.Vehicle;
import practice.mrasadatik.session_016.config.ProjectConfig;

public class Session016 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean("MBG63", Vehicle.class);
        Person person = context.getBean("personBean", Person.class);

        System.out.println("vehicle = " + vehicle.getName());
        System.out.println("person name = " + person.getName());
        System.out.println("person vehicle = " + person.getVehicle());
    }
}
