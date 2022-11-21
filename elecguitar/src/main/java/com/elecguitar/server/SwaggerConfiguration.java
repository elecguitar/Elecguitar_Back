package com.elecguitar.server;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	    @Bean
	    public Docket postsApi() {
	       final ApiInfo apiInfo = new ApiInfoBuilder()
	               .title("Elec기:타 API")
	               .description("<h3>Elec기:타 API Reference for Developers</h3>")
	               .license("SSAFY License")
	               .version("1.0")
	               .build();
	       
	        Docket docket = new Docket(DocumentationType.SWAGGER_2)
	                .groupName("elecGuitarApi")
	                .apiInfo(apiInfo)
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.elecguitar.server.controller"))
//		              .paths(PathSelectors.ant("/admin/**"))
	                .paths(postPaths())
	                .build();
	        System.out.println(docket);
	        return docket;
	    }

		private Predicate<String> postPaths() {
			return regex("/carapi/.*");
		}
}