package practice.mrasadatik.session_009.main;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import practice.mrasadatik.session_009.beans.Vehicle;
import practice.mrasadatik.session_009.config.ProjectConfig;

import java.util.Random;
import java.util.function.Supplier;

public class Session009 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Supplier<Vehicle> mbSupplier = () -> {
            var vehicle = new Vehicle();
            vehicle.setName("Mercedes-Benz G63");
            return vehicle;
        };

        Vehicle mahindra = new Vehicle();
        mahindra.setName("Mahindra Thar");
        Supplier<Vehicle> mahindraSupplier = () -> mahindra;

        Random random = new Random();
        if (random.nextBoolean()) {
            context.registerBean("mb", Vehicle.class, mbSupplier);
        } else {
            context.registerBean("mahindra", Vehicle.class, mahindraSupplier);
        }

        Vehicle mbVehicle = null;
        Vehicle mahindraVehicle = null;

        try {
            mbVehicle = context.getBean("mb", Vehicle.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Mercedes-Benz is not available in the context.");
        }

        try {
            mahindraVehicle = context.getBean("mahindra", Vehicle.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Mahindra is not available in the context.");
        }

        if (null != mbVehicle) {
            System.out.println("vehicle = " + mbVehicle.getName());
        } else {
            System.out.println("vehicle = " + mahindraVehicle.getName());
        }

    }
}
