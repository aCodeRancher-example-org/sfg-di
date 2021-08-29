package guru.springframework.sfgdi.repositories;

import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.services.GreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SpanishGreetingRepositoryImplTest {

    @InjectMocks
    I18nController i18nController;
    @Mock
    GreetingService engService;


    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this);
        i18nController = new I18nController(engService);
    }

    @Test
    void getGreeting() {

        when(engService.sayGreeting()).thenReturn("Hello World - EN");
        assertEquals( "Hello World - EN",i18nController.sayHello());
        verify(engService,times(1)).sayGreeting();
    }
}
