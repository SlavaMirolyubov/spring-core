package org.shop.config;

import org.shop.*;
import org.shop.api.ProductService;
import org.shop.api.UserService;
import org.shop.data.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class InitializerConfig {

    @Bean(initMethod = "initData")
    public DataInitializer dataInitializer(){
        DataInitializer dataInitializer = new DataInitializer();
        return dataInitializer;
    }

    @Bean
    public ProductInitializer productInitializer(ProductService productService) {
        return new ProductInitializer(productService);
    }

    @Bean
    public SellerInitializer sellerInitializer() {
        SellerInitializer sellerInitializer = new SellerInitializer();
        return sellerInitializer;
    }

    @Bean(name = "mapBean")
    public Map<Long, String> mapBean() {
        Map<Long, String> map = new HashMap<>();
        map.put(1L, "RAZ");
        map.put(2L, "DVA");
        return map;
    }

    @Bean
    public ProposalInitializer proposalInitializer() {
        ProposalInitializer proposalInitializer = new ProposalInitializer();
        return proposalInitializer;
    }

    @Bean
    public UserInitializer userInitializer(UserService userService) {
        return new UserInitializer(userService);
    }



}
