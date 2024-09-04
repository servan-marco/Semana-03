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
public class Programa01 {

    public static void main(String[] args) {
        int n1, n2, n3, n4, mayor;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingresar el Numero 1: ");
        n1 = lectura.nextInt();

        System.out.print("Ingresar el Numero 2: ");
        n2 = lectura.nextInt();

        System.out.print("Ingresar el Numero 3: ");
        n3 = lectura.nextInt();

        System.out.print("Ingresar el Numero 4: ");
        n4 = lectura.nextInt();

        mayor = n1;

        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }
        if (n4 > mayor) {
            mayor = n4;
        }
        System.out.println("El numero mayor es: " + mayor);
    }
}
