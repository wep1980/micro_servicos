package br.com.wepdev.recursoshumanostrabalhadores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient // Configurando o projeto para ser um cliente Eureka
@SpringBootApplication
public class RecursosHumanosTrabalhadoresApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecursosHumanosTrabalhadoresApplication.class, args);
    }

}
