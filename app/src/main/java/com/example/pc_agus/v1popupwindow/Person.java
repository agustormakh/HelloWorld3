package com.example.pc_agus.v1popupwindow;

public class Person {
    protected String name;
    protected int edad;
    protected int DNI;

    public Person(String name,int edad , int DNI){
        this.name = name;
        this.edad = edad;
        this.DNI = DNI;
    }

    public String decimeKienSos(){
        return "Me llamo " + this.name + " tengo " + this.edad + " anios " + "mi dni es " + this.DNI;
    }


}
