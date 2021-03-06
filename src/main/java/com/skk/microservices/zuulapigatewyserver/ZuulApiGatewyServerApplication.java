package com.skk.microservices.zuulapigatewyserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import brave.sampler.Sampler;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ZuulApiGatewyServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGatewyServerApplication.class, args);
	}
	
	@Bean
	public Sampler defaultSapler() {
		
		return Sampler.ALWAYS_SAMPLE;
	}
}
