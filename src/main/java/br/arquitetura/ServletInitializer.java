package br.arquitetura;

import org.apache.catalina.Context;
import org.apache.catalina.webresources.StandardRoot;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TaskManagerApplication.class);
	}

	@Bean
	public EmbeddedServletContainerFactory servletContainer() {
	    TomcatEmbeddedServletContainerFactory tomcatFactory = new TomcatEmbeddedServletContainerFactory() {
	        @Override
	        protected void postProcessContext(Context context) {
	            final int cacheSize = 40 * 1024;
	            StandardRoot standardRoot = new StandardRoot(context);
	            standardRoot.setCacheMaxSize(cacheSize);
	            context.setResources(standardRoot); // This is what made it work in my case.

	            logger.info(String.format("New cache size (KB): %d", context.getResources().getCacheMaxSize()));
	        }
	    };
	    return tomcatFactory;
	}
}
