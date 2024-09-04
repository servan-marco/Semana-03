/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

import java.util.Scanner;

/**
 *
 * @author serva
 */
public class Programa03 {

    public static void main(String[] args) {
        double n1, n2, resultado;
        String opa;
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar numero 1: ");
        n1 = lectura.nextDouble();

        System.out.print("Ingresar numero 2: ");
        n2 = lectura.nextDouble();

        System.out.print("Ingresar operacion [+,-,*,/]: ");
        opa = lectura.next();

        //proceso de datos
        if (opa.equals("+")) {
            resultado = n1 + n2;
        } else if (opa.equals("-")) {
            resultado = n1 - n2;
        } else if (opa.equals("*")) {
            resultado = n1 * n2;
        } else {
            resultado = n1 / n2;
        }

        System.out.print("El resultado es: " + resultado);
    }

}
