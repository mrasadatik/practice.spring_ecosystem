package practice.mrasadatik.session_017.implementations;

import org.springframework.stereotype.Component;
import practice.mrasadatik.session_017.interfaces.Tyres;

@Component("continentalTyresBean")
public class ContinentalTyres implements Tyres {
    public ContinentalTyres() {
        System.out.println("ContinentalTyres is created");
    }

    @Override
    public String rotate() {
        return "ContinentalTyres is rotating";
    }
}
