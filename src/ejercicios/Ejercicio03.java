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
public class Ejercicio03 {

    public static void main(String[] args) {
        int nota;
        String estado, alumno;
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar el nombre del alumno: ");
        alumno = lectura.next();

        System.out.print("Ingresar la nota: ");
        nota = lectura.nextInt();

        //proceso de datos
        if (nota >= 17) {
            estado = "Aprobado con A";
        } else if (nota >= 15) {
            estado = "Aprobado con B";
        } else if (nota >= 12) {
            estado = "Aprobado con C";
        } else {
            estado = "Reprobado";
        }

        System.out.println("El alumno " + alumno + " esta: " + estado);
    }
}
