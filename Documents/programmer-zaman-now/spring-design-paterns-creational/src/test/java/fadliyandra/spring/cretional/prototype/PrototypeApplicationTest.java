package fadliyandra.spring.cretional.prototype;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = PrototypeAplication.class)
public class PrototypeApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testPrototype(){
        Employee fadli = applicationContext.getBean("employeeManager", Employee.class);
        fadli.setName("Fadli");

        Employee budi = applicationContext.getBean("employeeStaff", Employee.class);
        budi.setName("Budi");

        Employee joko = applicationContext.getBean("employeeStaff", Employee.class);
        joko.setName("Joko");

        System.out.println(fadli);
        System.out.println(budi);
        System.out.println(joko);
    }
}
