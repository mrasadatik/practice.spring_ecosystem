package practice.mrasadatik.session_017.implementations;

import org.springframework.stereotype.Component;
import practice.mrasadatik.session_017.interfaces.Speakers;

@Component("boseSpeakersBean")
public class BoseSpeakers implements Speakers {
    public BoseSpeakers() {
        System.out.println("BoseSpeakers is created");
    }

    @Override
    public String makeSound() {
        return "BoseSpeakers is making sound";
    }
}
