package practice.mrasadatik.session_004.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import practice.mrasadatik.session_004.beans.Vehicle;

@Configuration
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

    @Bean(name = {"TLCR", "LandCruiser"})
    Vehicle vehicle4() {
        var vehicle = new Vehicle();
        vehicle.setName("Toyota Land Cruiser");
        return  vehicle;
    }

    @Bean(value = {"JW", "Wrangler"})
    Vehicle vehicle5() {
        var vehicle = new Vehicle();
        vehicle.setName("Jeep Wrangler");
        return  vehicle;
    }

    @Bean({"FM", "Mustang"})
    Vehicle vehicle6() {
        var vehicle = new Vehicle();
        vehicle.setName("Ford Mustang");
        return  vehicle;
    }
}
