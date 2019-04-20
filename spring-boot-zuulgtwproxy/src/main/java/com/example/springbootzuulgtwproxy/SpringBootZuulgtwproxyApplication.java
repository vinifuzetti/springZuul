package com.example.springbootzuulgtwproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.springbootzuulgtwproxy.filters.ErrorFilter;
import com.example.springbootzuulgtwproxy.filters.PostFilter;
import com.example.springbootzuulgtwproxy.filters.PreFilter;
import com.example.springbootzuulgtwproxy.filters.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class SpringBootZuulgtwproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulgtwproxyApplication.class, args);
	}
	
	@Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }

}
