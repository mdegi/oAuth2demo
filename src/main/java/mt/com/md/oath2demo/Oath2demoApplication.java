package mt.com.md.oath2demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class Oath2demoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oath2demoApplication.class, args);
    }

}
