/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author serva
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        int edad;
        String nombre, mayoria;
        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingresar el Nombre: ");
        nombre = lectura.next();

        System.out.print("Ingresar la edad: ");
        edad = lectura.nextInt();
        mayoria = "no es mayor de edad";
        if (edad >= 21) {
            mayoria = "si es mayor de edad";
        }
        System.out.println("La persona " + nombre + " " + mayoria);
    }
}
