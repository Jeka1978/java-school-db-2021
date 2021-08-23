package homework.matematik;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Exercise {
    private int a;
    private int b;
    private int answer;
    private Operation operation;


    @Override
    public String toString() {
        return a + " " + operation + " " + b + " = " + answer;
    }
}
