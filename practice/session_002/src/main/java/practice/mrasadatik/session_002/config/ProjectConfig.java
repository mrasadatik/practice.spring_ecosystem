package practice.mrasadatik.session_002.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import practice.mrasadatik.session_002.beans.Vehicle;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle vehicle() {
        var vehicle = new Vehicle();
        vehicle.setName("Mercedes-Benz G63");
        return  vehicle;
    }

    @Bean
    String hello() {
        return "Hello, World!";
    }

    @Bean
    Integer number() {
        return 42;
    }
}
