package java8.streams_examples.lab;

import lombok.RequiredArgsConstructor;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public enum Seniority {
    JUN(Integer.MIN_VALUE, 10), MIDDLE(11, 20), SENIOR(21, Integer.MAX_VALUE);
    private final int min;
    private final int max;


    public static Seniority bySalary(int salary) {
        return Arrays.stream(values())
                .filter(seniority -> seniority.min <= salary)
                .filter(seniority -> seniority.max >= salary)
                .findAny()
                .get();
    }
}


