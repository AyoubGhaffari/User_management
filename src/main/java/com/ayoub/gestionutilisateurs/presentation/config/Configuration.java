package com.ayoub.gestionutilisateurs.presentation.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Optional;

import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;
import static springfox.documentation.spi.DocumentationType.SWAGGER_2;

@org.springframework.context.annotation.Configuration
@EnableSwagger2
@AllArgsConstructor
public class Configuration {

    private Properties properties;

    @Bean
    public Docket productApi() {
        return new Docket(SWAGGER_2)
                .select()
                .apis(basePackage("com.ayoub.usermanagement"))
                .build()
                .apiInfo(apiInfo())
                .genericModelSubstitutes(Optional.class);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(properties.getTitle())
                .description(properties.getDescription())
                .version(properties.getVersion())
                .contact(contact())
                .build();
    }

    private Contact contact() {
        return new Contact(
                properties.getContactName(),
                properties.getContactUrl(),
                properties.getContactEmail()
        );
    }

}
