package com.ufv.ejemplo01;

public class Persona {

    private String nombre;
    private String apellidos;
    private int dnisinletra;
    private int edad;

    public Persona(){

    }

    public Persona(String nombre, String apellidos, int dnisinletra, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dnisinletra = dnisinletra;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDnisinletra() {
        return dnisinletra;
    }

    public void setDnisinletra(int dnisinletra) {
        this.dnisinletra = dnisinletra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
