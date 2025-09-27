package practice.mrasadatik.session_016.config;

import org.springframework.context.annotation.*;
import practice.mrasadatik.session_016.beans.Vehicle;

@Configuration
@ComponentScan("practice.mrasadatik.session_016.beans")
public class ProjectConfig {
    @Bean("MBG63")
    Vehicle vehicle1() {
        var vehicle = new Vehicle();
        vehicle.setName("Mercedes-Benz G63");
        return  vehicle;
    }

    @Bean(value = "MT")
    Vehicle vehicle2() {
        var vehicle = new Vehicle();
        vehicle.setName("Mahindra Thar");
        return  vehicle;
    }

    @Bean(name = "RR")
    Vehicle vehicle3() {
        var vehicle = new Vehicle();
        vehicle.setName("Range Rover");
        return  vehicle;
    }
}
