package com.nttdata.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Gateway-Server application, enable eureka client.
 */
@EnableEurekaClient
@SpringBootApplication
public class GatewayServerApplication {
  public static void main(String[] args) {
    SpringApplication.run(GatewayServerApplication.class, args);
  }
}
