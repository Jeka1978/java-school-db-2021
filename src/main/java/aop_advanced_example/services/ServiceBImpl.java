package aop_advanced_example.services;

import aop_advanced_example.DBException;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class ServiceBImpl implements ServiceB {
    @Override
    public void doB() {
        System.out.println("b started...");
        throw new DBException("fire all DBA");
    }
}
