package org.shop.config;

import org.shop.annotations.InjectRandomIntAnnotationBean;
import org.shop.aop.Logging;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("initial.properties")
@Import({FactoryConfig.class, ServiceConfig.class, InitializerConfig.class, RepositoryConfig.class})
@EnableAspectJAutoProxy
public class RootConfig {

    @Bean
    public Logging logging() {
        return new Logging();
    }

}
