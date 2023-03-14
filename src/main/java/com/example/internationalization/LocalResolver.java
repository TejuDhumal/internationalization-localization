package com.example.internationalization;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.LocaleResolver;
import java.util.Locale;


@Component
public class LocalResolver implements LocaleResolver {
    @Override
    public  Locale resolveLocale(HttpServletRequest request) {
        String language = request.getHeader("Accept-lang");
        if(language==null || language.isEmpty()){
            return Locale.forLanguageTag("en");
        }
        Locale locale = Locale.forLanguageTag(language);
        if(LanguageConfig.locales.contains(locale)){
            return locale;
        }
        else {
            return Locale.forLanguageTag("en");
        }

    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
