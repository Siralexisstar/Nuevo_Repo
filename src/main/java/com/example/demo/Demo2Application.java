package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setApellido("Villar");



        SpringApplication.run(Demo2Application.class, args);
    }




}
