package com.dibimbing1.dibimbing.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class TestBeans {

    @Bean
    public String appSaya(){

        return "aplikasi pertama saya";
    }
}
