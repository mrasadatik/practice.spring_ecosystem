package practice.mrasadatik.session_010.main;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import practice.mrasadatik.session_010.beans.Vehicle;
import practice.mrasadatik.session_010.config.ProjectConfig;

import java.util.Random;
import java.util.function.Supplier;

public class Session010 {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("./config/beans.xml");
        Vehicle vehicle = context.getBean("mb", Vehicle.class);

        System.out.println("vehicle = " + vehicle.getName());
    }
}
