package com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAutoConfiguration 
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb")
@SpringBootApplication
public class MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodbApplication.class, args);
	}

}

