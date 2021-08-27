package real_spring;

import com.github.javafaker.Faker;
import homework.lab3.utils.RandomUtil;
import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class InjectRandomNameAnnotationBeanPostProcessor implements BeanPostProcessor {




    @Override
    @SneakyThrows
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> type = bean.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectRandomName.class)) {
                field.setAccessible(true);
                field.set(bean, RandomUtil.randomName());
            }
        }
        return bean;

    }


}
