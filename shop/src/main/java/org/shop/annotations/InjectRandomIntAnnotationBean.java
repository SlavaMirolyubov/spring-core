package org.shop.annotations;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Random;

public class InjectRandomIntAnnotationBean implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();

        Arrays.stream(fields).forEach(x -> {
                    InjectRandomInt annotation = x.getAnnotation(InjectRandomInt.class);
                    if (annotation!=null) {
                        Random random = new Random();
                        int min = annotation.min();
                        int max = annotation.max();
                        int randomInt = min + random.nextInt(max-min+1);
                        x.setAccessible(true);
                        ReflectionUtils.setField(x, bean, randomInt);
                    }
                });
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
