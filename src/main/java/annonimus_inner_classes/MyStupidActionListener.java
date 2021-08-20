package annonimus_inner_classes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

/**
 * @author Evgeny Borisov
 */
public class MyStupidActionListener implements ActionListener {

    private ColorFrame colorFrame;

    public MyStupidActionListener(ColorFrame colorFrame) {
        this.colorFrame = colorFrame;
    }


    public void a() throws FileNotFoundException {

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Im stupid!");
        colorFrame.getContentPane().setBackground(Color.RED);


    }
}
