package com.ldh;

import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class WebFluxApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebFluxApplication.class, args);
	}

	/**
	 * SQL执行效率插件
	 */
	@Bean
	public PerformanceInterceptor performanceInterceptor() {
		return new PerformanceInterceptor();
	}
}
