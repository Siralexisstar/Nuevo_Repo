package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setApellido("Villar");

        persona.setDNI("47668228S");




        SpringApplication.run(Demo2Application.class, args);
    }




}
