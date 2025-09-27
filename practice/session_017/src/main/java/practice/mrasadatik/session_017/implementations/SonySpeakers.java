package practice.mrasadatik.session_017.implementations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import practice.mrasadatik.session_017.interfaces.Speakers;

@Component("sonySpeakersBean")
@Primary
public class SonySpeakers implements Speakers {
    public SonySpeakers() {
        System.out.println("SonySpeakers is created");
    }

    @Override
    public String makeSound() {
        return "SonySpeakers is making sound";
    }
}
