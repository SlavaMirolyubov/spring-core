package org.shop.config;

import org.shop.annotations.InjectRandomIntAnnotationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("initial.properties")
@Import({FactoryConfig.class, ServiceConfig.class, InitializerConfig.class, RepositoryConfig.class})
public class RootConfig {



}
