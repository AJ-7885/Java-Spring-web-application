package web_test;

import java.util.EnumSet;
import java.util.Set;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import web_test.config.RootConfig;
import web_test.config.WebMvcConfig;

public class AppInit implements WebApplicationInitializer {

    public static final String ATTRIBUTE_TRANSFORMER_POOL = "attribute.transformer_pool";

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        System.out.println("=== webapp initializer ===");
        final AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();

        context.register(RootConfig.class);
        this.addFilters(servletContext);
        servletContext.addListener(new ContextLoaderListener(context));
        servletContext.setInitParameter("defaultHtmlEscape", "true");
        this.addAppServlet(servletContext);
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~ public methods ~~~~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~ protected methods ~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~ private methods ~~~~~~~~~~~~~~~~~~~~~~~~~
    private void addFilters(final ServletContext servletContext) {
        this.addCharacterEncodingFilter(servletContext);
        this.checkDatabase(servletContext);
    }

    private void checkDatabase(ServletContext servletContext) {
        System.out.println("Checking Database");

    }

    private void addCharacterEncodingFilter(final ServletContext servletContext) {
        final FilterRegistration.Dynamic characterEncodingFilter = servletContext.addFilter("characterEncodingFilter", new CharacterEncodingFilter());
        characterEncodingFilter.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/rest/*");
        characterEncodingFilter.setInitParameter("encoding", "UTF-8");
        characterEncodingFilter.setInitParameter("forceEncoding", "true");
    }

    private void addAppServlet(final ServletContext servletContext) {
        final AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
        appContext.register(WebMvcConfig.class);

        final ServletRegistration.Dynamic appServlet = servletContext.addServlet("web_test", new DispatcherServlet(appContext));
        appServlet.setLoadOnStartup(1);

        final Set<String> mappingConflicts = appServlet.addMapping("/");
        if (!mappingConflicts.isEmpty()) {
            throw new IllegalStateException("'app' cannot be mapped to '/' under Tomcat versions <= 7.0.14");
        }
    }

}
