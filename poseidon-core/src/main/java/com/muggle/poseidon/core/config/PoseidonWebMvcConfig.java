package com.muggle.poseidon.core.config;

import com.muggle.poseidon.core.generater.service.factory.IdServiceFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: poseidon
 * @description:
 * @author: muggle
 * @create: 2018-12-28 12:11
 **/
@Configuration
public class PoseidonWebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    @Bean(initMethod = "init")
    IdServiceFactoryBean getIdservice(){
        IdServiceFactoryBean idService=new IdServiceFactoryBean();
        idService.setMachineId(1);
        idService.setProviderType(IdServiceFactoryBean.Type.PROPERTY);
        return idService;
    }


}