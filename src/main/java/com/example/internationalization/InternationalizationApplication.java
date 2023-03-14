package com.example.internationalization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@SpringBootApplication
public class InternationalizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternationalizationApplication.class, args);
	}


//	@Bean
//	public SessionLocaleResolver localResolver() {
//		SessionLocaleResolver resolver = new SessionLocaleResolver();
//		resolver.setDefaultLocale(Locale.US);
//		return resolver;
//
//	}
//
//	@Bean
//	public ResourceBundleMessageSource resourceBundleMessageSource(){
//		ResourceBundleMessageSource rs = new ResourceBundleMessageSource();
//		rs.setBasename("messages");
//		rs.setUseCodeAsDefaultMessage(true);
//		return rs;
//	}
//
//@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String getSource(@RequestHeader("Accept-Language") String local){
//		return resourceBundleMessageSource().getMessage("hello.txt",null,new Locale(local));
//}

}