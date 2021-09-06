package compFuture_solution;

import java.util.concurrent.CompletableFuture;

/**
 * Created by Evegeny on 08/02/2017.
 */
public class ScoreService {
    public CompletableFuture<Serial> updateScore(CompletableFuture<Serial> serialCompletableFuture, double score) {
        return serialCompletableFuture.handleAsync((serial, throwable) -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return new Serial(serial.getName(), serial.getScore() + score);
        });
    }



}
