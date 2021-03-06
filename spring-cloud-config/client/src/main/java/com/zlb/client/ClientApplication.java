package com.zlb.client;

import com.zlb.client.entity.PropertyDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
//@EnableConfigurationProperties(PropertyDto.class)
public class ClientApplication {

    public static void main(String[] args) {
        //new SpringApplicationBuilder(Application.class).web(true).run(args);
        SpringApplication.run(ClientApplication.class, args);
    }
}
