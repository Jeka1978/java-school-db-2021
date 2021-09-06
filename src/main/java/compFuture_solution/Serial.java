package compFuture_solution;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Evegeny on 08/02/2017.
 */
@Data
@AllArgsConstructor
public class Serial {
    private String name;
    private double score;

    public Serial(String name) {
        this.name = name;
    }
}
