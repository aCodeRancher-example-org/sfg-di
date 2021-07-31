package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


@Component
public class CustomBeanPostProcessorTest implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

//        if(bean instanceof LifeCycleDemoBean){
//            ((LifeCycleDemoBean) bean).beforeInit();
//        }

//Error creating bean with name 'lifeCycleDemoBeanTest' defined in file sfg-di\target\classes\guru\springframework\sfgdi\services\LifeCycleDemoBeanTest.class]: Initialization of bean failed; nested exception is java.lang.ClassCastException: class guru.springframework.sfgdi.services.LifeCycleDemoBeanTest cannot be cast to class guru.springframework.sfgdi.services.LifeCycleDemoBean (guru.springframework.sfgdi.services.LifeCycleDemoBeanTest and guru.springframework.sfgdi.services.LifeCycleDemoBean are in unnamed module of loader 'app')
//        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.d
        if(bean instanceof LifeCycleDemoBeanTest){
            ((LifeCycleDemoBeanTest) bean).beforeInit();
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        if(bean instanceof LifeCycleDemoBean){
//            ((LifeCycleDemoBean) bean).afterInit();
//        }

        if(bean instanceof LifeCycleDemoBeanTest){
            ((LifeCycleDemoBean) bean).afterInit();
        }

        return bean;
    }
}
