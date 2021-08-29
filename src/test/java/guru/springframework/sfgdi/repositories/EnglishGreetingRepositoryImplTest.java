package guru.springframework.sfgdi.repositories;

import guru.springframework.sfgdi.SfgDiApplication;
import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.controllers.PetController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class EnglishGreetingRepositoryImplTest {
    I18nController i18nController;

    @BeforeEach
    void setUp() {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
        i18nController = (I18nController) ctx.getBean("i18nController");
    }

    @Test
    void getGreeting() {
        assertEquals("Hello World - EN",i18nController.sayHello());
    }
}