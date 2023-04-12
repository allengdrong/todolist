package com.cmm.conf;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class PropertyConfig {

    @Bean("system")
    public PropertiesFactoryBean propertiesFactoryBean() throws Exception {

        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
        ClassPathResource classPathResource = new ClassPathResource("conf/properties/globalProperty.properties");

        propertiesFactoryBean.setLocation(classPathResource);
        return propertiesFactoryBean;

    }

}
