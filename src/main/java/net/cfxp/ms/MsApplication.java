package net.cfxp.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;


@SpringBootApplication
public class MsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MsApplication.class, args);
	}

	public static class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
		@Override
		protected String[] getServletMappings() {
			return new String[0];
		}

		@Override
		protected javax.servlet.Filter[] getServletFilters(){
			DelegatingFilterProxy delegatingFilterProxy = new DelegatingFilterProxy();
			delegatingFilterProxy.setTargetBeanName("loggingFilter");
			return new Filter[] {delegatingFilterProxy};
		}

		@Override
		protected Class<?>[] getRootConfigClasses() {
			return new Class[0];
		}

		@Override
		protected Class<?>[] getServletConfigClasses() {
			return new Class[0];
		}
	}
}
