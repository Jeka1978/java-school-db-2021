package aop_advanced_example.aop;

import aop_advanced_example.DBException;

/**
 * @author Evgeny Borisov
 */
public interface DBExceptionHandler {
    void handle(DBException ex);
}
