package com.codecreaters.employee.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



    @Configuration
    @EnableSwagger2
    public class SwaggerConfig {

        @Bean
        public Docket devApi() {
            return new Docket(DocumentationType.SWAGGER_2).groupName("employee-details-api")
                    .apiInfo(apiInfo()).enable(true).select().apis(RequestHandlerSelectors.basePackage("com.codecreaters.employee")).paths(PathSelectors.regex(".*")).build();
        }

        private ApiInfo apiInfo() {
            return new ApiInfoBuilder()
                    .title("Employee Details APIs")
                    .description("This page lists all the rest apis for Swagger Sample App.")
                    .version("1.0-SNAPSHOT")
                    .build();
        }
    }

