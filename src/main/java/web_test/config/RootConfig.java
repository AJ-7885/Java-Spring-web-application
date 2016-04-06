package web_test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@ComponentScan("web_test")
@EnableAsync
public class RootConfig {

    public RootConfig() {
        System.out.println("=== Root Config ===");
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~ public methods ~~~~~~~~~~~~~~~~~~~~~~~~~~

    // ~~~~~~~~~~~~~~~~~~~~~~~ protected methods ~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~ private methods ~~~~~~~~~~~~~~~~~~~~~~~~~
}
