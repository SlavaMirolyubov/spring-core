package org.shop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({FactoryConfig.class, ServiceConfig.class, InitializerConfig.class, RepositoryConfig.class})
public class RootConfig {

}
