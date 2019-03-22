package com.hx.swagger02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Minghua Chen on 2019/03/22.
 * add jxust-nc
 */
@Configuration //必须存在
@EnableSwagger2 //必须存在
@EnableWebMvc //必须存在
//必须存在 扫描的API Controller包
@ComponentScan(basePackages = {"com.hx.swagger02.controller"})
public class SwaggerConfig {

    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("CMH", "http://www.jxustcmh.cn/", "jxrjcmh@qq.com");
        return new ApiInfoBuilder()
                .title("陈明华的API接口文档")
                .description("API接口")
                .contact(contact)
                .version("1.1.0")
                .build();
    }
}
