package guru.springframework.sfgdi.repositories;
import guru.springframework.sfgdi.controllers.I18nController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles({"EN", "default"})
class EnglishGreetingRepositoryImplTest {
    @Autowired
    I18nController i18nController;


    @Test
    void getGreeting() {

        assertEquals("Hello World - EN",i18nController.sayHello());
    }
}