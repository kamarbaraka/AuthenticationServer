package com.kamar.authenticationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatProtocolHandlerCustomizer;

import java.util.concurrent.Executors;

@SpringBootApplication
public class AuthenticationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthenticationServerApplication.class, args);
    }

    TomcatProtocolHandlerCustomizer<?> tomcatProtocolHandlerVirtualThreadCustomizer(){

        return protocolHandler -> protocolHandler.setExecutor(
                Executors.newVirtualThreadPerTaskExecutor()
        );
    }

}
