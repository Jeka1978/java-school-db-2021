package design_patterns.singleton_anti_pattern;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class NdsResolverSingleton {
    @Getter
    private static NdsResolverSingleton instance = new NdsResolverSingleton();

    public double getNds(){
        return 0.2;
    }


}
