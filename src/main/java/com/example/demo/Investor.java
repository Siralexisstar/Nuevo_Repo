package com.example.demo;

public class Investor {

    public Investor(){

    }

    public String DNI;

    public String dinero;

    public int capital;

    public Investor(String DNI, String dinero, int capital) {
        this.DNI = DNI;
        this.dinero = dinero;
        this.capital = capital;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDinero() {
        return dinero;
    }

    public void setDinero(String dinero) {
        this.dinero = dinero;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }
}
