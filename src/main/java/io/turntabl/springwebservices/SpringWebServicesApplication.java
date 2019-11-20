package io.turntabl.springwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebServicesApplication.class, args);
	}

	@Bean
	public DataSource francisBilla(){
		return new DriverManagerDataSource("jdbc:postgresql://localhost/bookshop", null, null);
	}
}
