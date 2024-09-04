/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author serva
 */
public class Programa02 {

    public static void main(String[] args) {
        //declarar variables
        double nt1, nt2, nt3, promedio;
        String alumno, condicion;
        Scanner lectura = new Scanner(System.in);

        //entrada de datos
        System.out.print("Ingresar nombre del alumno: ");
        alumno = lectura.next();

        System.out.print("Ingresar nota 1: ");
        nt1 = lectura.nextDouble();

        System.out.print("Ingresar nota 2: ");
        nt2 = lectura.nextDouble();

        System.out.print("Ingresar nota 3: ");
        nt3 = lectura.nextDouble();
        promedio = (nt1 + nt2 + nt3) / 3;

        DecimalFormat formato = new DecimalFormat("##.##");
        if (promedio >= 12) {
            condicion = "Aprobado";
        } else {
            condicion = "Desprobado";
        }
        System.out.println("El promedio es: " + formato.format(promedio));
        System.out.println("La condicion es: " + condicion);

    }
}
