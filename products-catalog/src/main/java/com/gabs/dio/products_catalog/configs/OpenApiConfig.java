package com.gabs.dio.products_catalog.configs;

import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Products API")
                        .version("1.0")
                        .description("Documentation for Products API for NTT Data chalenge")
                        .contact(new Contact()
                                .name("Gabriel Ferreira dos Santos")
                                .email("gabriel.fsantos97@outlook.com")
                        )
                );
    }
}