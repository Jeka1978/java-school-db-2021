package my_spring;

/**
 * @author Evgeny Borisov
 */
public interface ProxyConfigurator {

    Object configure(Object t,Class<?> type);

}
