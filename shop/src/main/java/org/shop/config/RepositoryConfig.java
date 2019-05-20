package org.shop.config;


import org.aspectj.weaver.ast.Or;
import org.shop.ShopLauncher;
import org.shop.annotations.InjectRandomIntAnnotationBean;
import org.shop.repository.*;
import org.shop.repository.factory.UserRepositoryFactory;
import org.shop.repository.map.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;

@Configuration
public class RepositoryConfig {

    @Autowired
    Environment environment;

    @Bean
    public InjectRandomIntAnnotationBean injectRandomIntAnnotationBean() {
        return new InjectRandomIntAnnotationBean();
    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepositoryFactory().createUserRepository();
    }

    @Bean
    public OrderRepository orderRepository() {
        return new OrderMapRepository();
    }

    @Bean
    public ProductRepository productRepository() {
        return new ProductMapRepository();
    }

    @Bean
    public ProposalRepository proposalRepository() {
        return new ProposalMapRepository();
    }

    @Bean
    public SellerRepository sellerRepository() {
        return new SellerMapRepository();
    }

    @Bean
    public UserRepositoryFactory userRepositoryFactory() {
        return new UserRepositoryFactory();
    }

    @Bean
    public ItemRepository itemRepository() {
        return new ItemMapRepository();
    }

}
