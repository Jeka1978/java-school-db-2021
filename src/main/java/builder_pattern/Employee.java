package builder_pattern;

import com.db.model.Person;
import lombok.Builder;
import lombok.NonNull;
import lombok.Singular;
import lombok.ToString;

import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Builder
@ToString
public class Employee {
    @NonNull
    private final Integer bonus;
    @NonNull
    private final Integer salary;
    private final String name;

    @Singular
    private final Map<String, Integer> beers;

    @Singular("рыба")
    public List<String> fish;

}
