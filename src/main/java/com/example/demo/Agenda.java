package com.example.demo;

public class Agenda {

    private String contactos;

    private String hombre;


    public Agenda(String contactos, String hombre) {
        this.contactos = contactos;
        this.hombre = hombre;
    }

    public String getContactos() {
        return contactos;
    }

    public void setContactos(String contactos) {
        this.contactos = contactos;
    }

    public String getHombre() {
        return hombre;
    }

    public void setHombre(String hombre) {
        this.hombre = hombre;
    }


}
