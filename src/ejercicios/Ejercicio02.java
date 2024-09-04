/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author serva
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        //declarar variables
        double dinero, vuelto, cant_azucar, costo_kg;
        Scanner lectura = new Scanner(System.in);

        //entrada de datos
        System.out.print("Ingresar el dinero que da la mama: ");
        dinero = lectura.nextDouble();

        System.out.print("Ingresar el costo por kg: ");
        costo_kg = lectura.nextDouble();

        DecimalFormat formato = new DecimalFormat("##.##");
        if (dinero >= costo_kg) {
            cant_azucar = 1;
            vuelto = dinero - costo_kg;
        } else {
            cant_azucar = dinero / costo_kg;
            vuelto = 0;
        }
        System.out.println("El nino compro " + formato.format(cant_azucar) + "kg");
        System.out.println("El vuelto es: " + formato.format(vuelto) + " soles");
    }
}
