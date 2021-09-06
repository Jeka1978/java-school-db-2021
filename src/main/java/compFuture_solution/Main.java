package compFuture_solution;

import org.springframework.context.annotation.Bean;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.Async;

import javax.swing.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Evegeny on 08/02/2017.
 */
public class Main {

    @Bean(name = "ex666")
    public Executor taskExecutor(){
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        return executorService;
    }

    @Async("ex666")
    public void fastMethod() {

    }


    //with spring @Async (@EnableAsync)

    public static void main(String[] args) {
        SerialService serialService = new SerialService();
        ScoreService scoreService = new ScoreService();
        while (true) {
            String name = JOptionPane.showInputDialog("Please input serial name");
            CompletableFuture<Serial> serialCompletableFuture = serialService.getSerial(name);
            double score = Double.parseDouble(JOptionPane.showInputDialog("what is your score?"));
            CompletableFuture<Serial> updatedSerialCompletableFuture =
                    scoreService.updateScore(serialCompletableFuture, score);
            serialService.updateSerial(updatedSerialCompletableFuture);
        }
    }
}
