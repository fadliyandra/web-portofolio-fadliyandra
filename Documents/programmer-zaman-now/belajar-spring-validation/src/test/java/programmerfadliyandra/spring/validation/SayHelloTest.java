package programmerfadliyandra.spring.validation;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import programmerfadliyandra.spring.validation.helper.SayHello;

import javax.validation.ConstraintViolationException;

@SpringBootTest
public class SayHelloTest {

    @Autowired
    private SayHello sayHello;

    @Test
    void testSuccess(){
        String message = sayHello.sayHello("Fadli");
        Assertions.assertEquals("Hello Fadli", message);
    }
    @Test
    void testError(){
        Assertions.assertThrows(ConstraintViolationException.class, () ->{
            sayHello.sayHello("");
        });
    }
}
