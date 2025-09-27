package practice.mrasadatik.session_017.implementations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import practice.mrasadatik.session_017.interfaces.Tyres;

@Component("michelinTyresBean")
@Primary
public class MichelinTyres implements Tyres {
    public MichelinTyres() {
        System.out.println("MichelinTyres is created");
    }

    @Override
    public String rotate() {
        return "MichelinTyres is rotating";
    }
}
