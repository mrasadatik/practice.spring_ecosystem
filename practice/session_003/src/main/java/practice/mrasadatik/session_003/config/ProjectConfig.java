package practice.mrasadatik.session_003.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import practice.mrasadatik.session_003.beans.Vehicle;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle vehicle1() {
        var vehicle = new Vehicle();
        vehicle.setName("Mercedes-Benz G63");
        return  vehicle;
    }

    @Bean
    Vehicle vehicle2() {
        var vehicle = new Vehicle();
        vehicle.setName("Mahindra Thar");
        return  vehicle;
    }

    @Bean
    Vehicle vehicle3() {
        var vehicle = new Vehicle();
        vehicle.setName("Range Rover");
        return  vehicle;
    }
}
