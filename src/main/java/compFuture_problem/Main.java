package compFuture_problem;

import javax.swing.*;

/**
 * Created by Evegeny on 08/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        SerialService serialService = new SerialService();
        ScoreService scoreService = new ScoreService();
        while (true) {
            String name = JOptionPane.showInputDialog("Please input serial name");
            Serial serial = serialService.getSerial(name);
            double score = Double.parseDouble(JOptionPane.showInputDialog("what is your score?"));
            Serial updateSerial = scoreService.updateScore(serial, score);
            serialService.updateSerial(updateSerial);
        }
    }
}
