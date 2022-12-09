package com.nt;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class BootmvcProj10I18nApplication
{
	@Bean("localeResolver")
	public SessionLocaleResolver createSLR()
	{
		SessionLocaleResolver resolver=new SessionLocaleResolver();
		resolver.setDefaultLocale(new Locale("en","US"));
		return resolver;
	}
	
	@Bean("lci")
	public LocaleChangeInterceptor createLCI()
	{
		LocaleChangeInterceptor lci=new LocaleChangeInterceptor();
		lci.setParamName("lang");
		return lci;
	}

	public static void main(String[] args) {
		SpringApplication.run(BootmvcProj10I18nApplication.class, args);
	}

}
