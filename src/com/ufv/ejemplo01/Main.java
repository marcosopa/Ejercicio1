package com.ufv.ejemplo01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Pepino");
        System.out.println(p.getNombre());



        System.out.println("Hola Mundo");
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String cadena = sc.nextLine();
        System.out.println(cadena);
    }
}
