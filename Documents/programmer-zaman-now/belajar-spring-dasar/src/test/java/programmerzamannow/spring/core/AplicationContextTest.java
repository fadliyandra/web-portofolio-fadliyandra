package programmerzamannow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AplicationContextTest {

    @Test
    void  tesApplicationContext(){
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfigration.class);
        Assertions.assertNotNull(context);

    }
}
