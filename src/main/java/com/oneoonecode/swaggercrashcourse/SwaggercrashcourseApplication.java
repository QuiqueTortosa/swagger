package com.oneoonecode.swaggercrashcourse;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "ToDoItems API",
				version = "1.0.0"
		),
		servers = {
				@Server(url = "http://localhost:8080"),
				@Server(url = "http://oneoone.com")
		},
		tags = {
				@Tag(name = "TodoItems", description = "This is TodoItem Description"),
		}
)
@SecurityScheme(
		name = "BearerJWT",
		type = SecuritySchemeType.HTTP,
		scheme = "bearer",
		bearerFormat = "JWT",
		description = "Bearer token for the project"
)
public class SwaggercrashcourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggercrashcourseApplication.class, args);
	}

}
