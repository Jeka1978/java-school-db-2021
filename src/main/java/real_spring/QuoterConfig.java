package real_spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

/**
 * @author Evgeny Borisov
 */

@Configuration
@PropertySource("classpath:quotes.properties")
@ComponentScan(basePackages = "real_spring")
@EnableAspectJAutoProxy
public class QuoterConfig {


}
