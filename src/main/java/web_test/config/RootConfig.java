package web_test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@EnableScheduling
@ComponentScan("web_test")
@EnableAsync
@EnableWebMvc
public class RootConfig extends WebMvcConfigurationSupport {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/htdocs/**").addResourceLocations("/htdocs/");
    }

    public RootConfig() {
        System.out.println("=== Root Config ===");
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~ public methods ~~~~~~~~~~~~~~~~~~~~~~~~~~

    // ~~~~~~~~~~~~~~~~~~~~~~~ protected methods ~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~ private methods ~~~~~~~~~~~~~~~~~~~~~~~~~
}
