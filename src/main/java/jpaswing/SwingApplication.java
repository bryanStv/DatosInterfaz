package jpaswing;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SwingApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SwingApplication.class)
                .headless(false)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
