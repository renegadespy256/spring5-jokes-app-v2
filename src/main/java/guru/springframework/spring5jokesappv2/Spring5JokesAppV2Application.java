package guru.springframework.spring5jokesappv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.springframework.norris.chuck","guru.springframework.spring5jokesappv2"})
public class Spring5JokesAppV2Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring5JokesAppV2Application.class, args);
    }

}
