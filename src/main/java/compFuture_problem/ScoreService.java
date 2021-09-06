package compFuture_problem;

import lombok.SneakyThrows;

/**
 * Created by Evegeny on 08/02/2017.
 */
public class ScoreService {
    @SneakyThrows
    public Serial updateScore(Serial serial, double score) {
        Thread.sleep(2000);
        return new Serial(serial.getName(), serial.getScore() + score);
    }
}
