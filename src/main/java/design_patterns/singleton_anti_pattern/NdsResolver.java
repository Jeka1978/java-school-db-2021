package design_patterns.singleton_anti_pattern;

/**
 * @author Evgeny Borisov
 */
public interface NdsResolver {
    double getNds();
    default int getX(){return 5;}


}
