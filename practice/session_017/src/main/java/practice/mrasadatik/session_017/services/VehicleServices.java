package practice.mrasadatik.session_017.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import practice.mrasadatik.session_017.interfaces.Speakers;
import practice.mrasadatik.session_017.interfaces.Tyres;

@Component("vehicleServiceBean")
public class VehicleServices {
    private Speakers speakers;
    private Tyres tyres;

    public void playMusic() {
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void moveVehicle() {
        String movement = tyres.rotate();
        System.out.println(movement);
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    @Autowired
    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
