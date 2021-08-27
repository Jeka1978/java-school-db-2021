package real_spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author Evgeny Borisov
 */
public class BeanDefinitionValidatorBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        String[] definitionNames = beanFactory.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(definitionName);
            if (beanDefinition.isPrototype() && beanDefinition.getDestroyMethodName() != null) {
                throw new IllegalStateException("Ты ИДИОТ");
            }
        }
    }
}
