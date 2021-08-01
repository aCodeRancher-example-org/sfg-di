package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Profile("test")
public class LifeCycleDemoBeanTest
        implements InitializingBean, DisposableBean, BeanNameAware,
                   BeanFactoryAware, ApplicationContextAware {


    public LifeCycleDemoBeanTest() {
        System.out.println("## TestI'm in the LifeCycleBean Constructor");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## TestThe Lifecycle bean has been terminated");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## TestThe LifeCycleBean has its properties set!");

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## TestBean Factory has been set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## TestMy Bean Name is: " + name);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## TestApplication context has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## TestThe Post Construct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## TestThe Predestroy annotated method has been called");
    }

    public void beforeInit(){
        System.out.println("## Test- Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## Test- After init called by Bean Post Processor");
    }
}
