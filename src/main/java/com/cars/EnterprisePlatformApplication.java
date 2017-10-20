package com.cars;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages ="com.cars.Mapper")
public class EnterprisePlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnterprisePlatformApplication.class, args);
	}
}
