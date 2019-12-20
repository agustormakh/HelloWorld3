package com.example.pc_agus.v1popupwindow;

public class Student extends Person{

    private String colegio;

    public Student(String name, int edad, int DNI, String colegio) {
        super(name, edad, DNI);
        this.colegio = colegio;
    }

    @Override
    public String decimeKienSos(){
        return super.decimeKienSos() +"voy al colegio " + this.colegio;
    }
}
