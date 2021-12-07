//package com.codecreaters.employee.config;
//
//import com.google.common.base.Predicates;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//public class SwaggerConfig extends WebMvcConfigurerAdapter {
//    @Bean
//    public Docket api() {
//        // @formatter:off
//        //Register the controllers to swagger
//        //Also it is configuring the Swagger Docket
//        return new Docket(DocumentationType.SWAGGER_2).select()
//                // .apis(RequestHandlerSelectors.any())
//                .apis(Predicates.not(RequestHandlerSelectors.basePackage("com.codecreaters.employee")))
//                // .paths(PathSelectors.any())
//                // .paths(PathSelectors.ant("/swagger2-demo"))
//                .build();
//        // @formatter:on
//
//}
