package screen_saver;

import lombok.SneakyThrows;
import org.springframework.context.annotation.*;

import java.awt.*;

import static homework.lab3.utils.RandomUtil.between;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
public class ScreenSaverConf {


    @Bean
    @Scope(value = "twoSeconds", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Color color() {
        return new Color(between(0, 255), between(0, 255), between(0, 255));
    }


    @SneakyThrows
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScreenSaverConf.class);


        while (true) {
            context.getBean(ColorFrame.class).moveToRandomLocation();
            Thread.sleep(100);
        }


    }
}
