package my_spring;

import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
public class ConsoleSpeaker implements Speaker {
    private int volume;
    @Override
    public void speak(String message) {
        System.out.println(message);
    }
}
