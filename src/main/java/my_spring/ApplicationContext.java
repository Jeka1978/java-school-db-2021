package my_spring;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
@Getter
public class ApplicationContext implements Context {

    private final String packagesToScan;
    private final Map<Class, Class> ifc2ImplClass;

    private Map<Class, Object> cache = new HashMap<>();


    @Override
    public <T> T getObject(Class<T> type) {
        if (cache.containsKey(type)) {
            return (T) cache.get(type);
        }else {

            //use objectFactory to create object and in case it marked as singleton, cache it as well
        }
        return null;
    }
}




