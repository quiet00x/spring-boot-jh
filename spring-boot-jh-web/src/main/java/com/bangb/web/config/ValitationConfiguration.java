package com.bangb.web.config;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * @project_name: spring-boot-webflux
 * @date: 2020/4/3 - 0:53
 * @author: Mr_Bangb
 * SpringBoot自动装配只能自动装配启动类所在工程中的 配置类
 */
@Configuration
@Slf4j
public class ValitationConfiguration {

    /**
     * 当第一个参数校验失败后，停止校验
     * @return
     */
    @Bean
    public Validator validator() {
        ValidatorFactory validatorFactory = Validation.byProvider(
                HibernateValidator.class)
                .configure()
                .failFast(true)
                .buildValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        log.info("************************ validator is building ********************");
        return  validator;
    }
}