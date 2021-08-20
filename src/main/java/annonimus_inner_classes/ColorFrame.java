package annonimus_inner_classes;

import com.db.model.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame extends JFrame {

    public ColorFrame(int[] counter) throws HeadlessException {



        setSize(500,500);
        JButton button = new JButton("click me to be red");


       /* List.of("","sd").sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                System.out.println(counter[0]++);
                //todo solve this problem without declaring any fields in ColorFrame

//                03#10#78+12*10 another lab - covert from string to date and visa versa
            }
        });

        getContentPane().add(button, BorderLayout.NORTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ColorFrame(new int[]{10});
    }
}
