package programmerzamannow.spring.core.configuration;

import org.springframework.context.annotation.Bean;
import programmerzamannow.spring.core.data.Foo;

public class FooConfiguration {

    @Bean
    public Foo foo(){
        return new Foo();
    }

}
