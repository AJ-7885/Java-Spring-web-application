package web_test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan("web_test")
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    // ~~~~~~~~~~~~~~~~~~~~~~~ public methods ~~~~~~~~~~~~~~~~~~~~~~~~~~

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/htdocs/**").addResourceLocations("/htdocs/");
    }

    public WebMvcConfig() {
        System.out.println("------- Init WebMvcConfig ------");
    }
	// ~~~~~~~~~~~~~~~~~~~~~~~ protected methods ~~~~~~~~~~~~~~~~~~~~~~~

	// ~~~~~~~~~~~~~~~~~~~~~~~ private methods ~~~~~~~~~~~~~~~~~~~~~~~~~
}
