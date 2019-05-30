package com.produtos.apirest.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.swagger.models.Contact;
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
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.produtos.apirest")).paths(PathSelectors.any())
				.build().pathMapping("/").apiInfo(apiInfo());
	}
	 private ApiInfo apiInfo() {
			ApiInfo apiInfo = new ApiInfo(
	                  "Cliente REST API Criada por Anderson Jose Baroni",
	                  "Exemplo de descrição da API.",
	                  "Versão API 1.0",
	                  "Termos de uso",
	                  "anderson.baroni1@hotmail.com",
	                  "API License",
	                  "API License URL"
	                );
			return apiInfo;
		   }
	
//	@Bean
//	public Docket productApi() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("com.produtos.apirest"))
//				.paths(regex("/api.*"))
//				.build()
//				.apiInfo(metaInfo());
//	}
//	
//	private ApiInfo metaInfo() {
//		ApiInfo apiInfo = new ApiInfo(
//			"Produtos API REST",
//			"API REST de cadastro de produtos.",
//			"1.0",
//			"Terms of service",
//			new Contact("Michele Brito","https://www.youtube.com/michelebrito","michellidibrito@gmail.com"),
//			"Apache License Version 2.0",
//			"https://www.apache.org/licesen.html", new ArrayList<VendorExtension>());
//		return apiInfo;
//	}
	
}
