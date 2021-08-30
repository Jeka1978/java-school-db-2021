package screen_saver;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import lombok.SneakyThrows;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.concurrent.TimeUnit;

/**
 * @author Evgeny Borisov
 */
public class TwoSecondsScopeProvider implements Scope {

    Cache<String, Object> cache = CacheBuilder.newBuilder().expireAfterWrite(2, TimeUnit.SECONDS).build();


    @Override
    @SneakyThrows
    public Object get(String name, ObjectFactory<?> objectFactory) {

        return cache.get(name, objectFactory::getObject);

    }













    @Override
    public Object remove(String name) {
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
