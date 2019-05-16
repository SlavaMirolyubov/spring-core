package org.shop;


import org.shop.annotations.InjectRandomInt;
import org.shop.config.FactoryConfig;
import org.shop.config.RootConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The ShopLauncher class.
 */
public class ShopLauncher {
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        //TODO: implement using Spring Framework ApplicationContext
        new AnnotationConfigApplicationContext(RootConfig.class);
    }
}
