package screen_saver;

import homework.lab3.utils.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

/**
 * @author Evgeny Borisov
 */
@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ColorFrame extends JFrame {

    @Autowired
    private Color color;

    @PostConstruct
    public void init() {

        System.out.println(color.getBlue());
        System.out.println(color.getBlue());
        System.out.println(color.getBlue());

        setSize(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void moveToRandomLocation() {
        setLocation(RandomUtil.between(0, 1200), RandomUtil.between(0, 900));
        getContentPane().setBackground(color);
        repaint();
    }


}



