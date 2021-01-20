//package com.github.huifer.dao.config;
//
//import java.nio.charset.StandardCharsets;
//
//import com.zaxxer.hikari.HikariDataSource;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.config.BeanPostProcessor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//import org.springframework.util.Base64Utils;
//
//@Component
//public class PasswordMysql {
//    @Bean
//    public static BeanPostProcessor beanPostProcessor() {
//        return new BeanPostProcessor() {
//            @Override
//            public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//                if (bean instanceof HikariDataSource) {
//                    HikariDataSource hikariDataSource = (HikariDataSource) bean;
//                    hikariDataSource.setPassword(new String(Base64Utils.decode(hikariDataSource.getPassword().getBytes())));
//                }
//                return null;
//            }
//        };
//    }
//
//}
