package com.epcor.appservices.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.*;

@Configuration
@EnableWebMvc
@Import(AppConfig.class)

public class WebAppConfig extends WebMvcConfigurerAdapter{


	@Bean
	public InternalResourceViewResolver setupViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
        resolver.setOrder(1);

		return resolver;
	}
/**
    @Bean
    public XmlViewResolver setupXmlViewResolver(){
        XmlViewResolver resolver = new XmlViewResolver();
        resolver.setLocation(new ClassPathResource("spring-xcel-view.xml"));
        resolver.setOrder(1);
        return resolver;
    }
*/
    /**
    @Bean
    public ViewResolver setupContentNegotiationViewResolver(ContentNegotiationManager manager){

        List< ViewResolver > resolvers = new ArrayList< ViewResolver >();
        //Add more view resolvers

        InternalResourceViewResolver r1 = new InternalResourceViewResolver();
        r1.setPrefix("/WEB-INF/pages/");
        r1.setSuffix(".jsp");
        r1.setViewClass(JstlView.class);
        resolvers.add(r1);

        JsonViewResolver r2 = new JsonViewResolver();
        resolvers.add(r2);

        ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
        resolver.setOrder(1);
        List<View> viewList = new ArrayList<View>();
        viewList.add(new MappingJackson2JsonView());

        resolver.setDefaultViews(viewList);

        resolver.setContentNegotiationManager(manager);
        resolver.setViewResolvers(resolvers);


        return resolver;
    }
    */
    /**
     * THis is added over here (and the class extends WebMvcConfigurerAdapter) because all the static files
     * (*.js, *.css and images) need to be exempt from dispatcherServlet. Otherwise it is complaining of
     * these resources being not found.
     */


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/angular2app/**").addResourceLocations("/angular2app/dist/");
    }
}
/**
class JsonViewResolver implements ViewResolver {
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        MappingJackson2JsonView view = new MappingJackson2JsonView();
        view.setPrettyPrint(true);
        return view;
    }
}
*/