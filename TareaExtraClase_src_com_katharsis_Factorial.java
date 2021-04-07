package com.katharsis;

import java.util.Scanner;

public class Factorial {
    public static void Factorial(){
        // Calcular factorial

        Scanner scanner= new Scanner(System.in);
        int n; //número a calcular

        System.out.println("Ingrese el valor numérico entero al que le desea calcular el factorial:");

        try {

            n = scanner.nextInt();
            int factorial=1;

            for (int i= 1; i<=n; i++){
                factorial= factorial*i;
            }
            System.out.println("El factorial de " + n + " es " + factorial +".\n");
        }
        catch (Exception e) {
            System.out.println("Error: por favor ingrese un valor numérico entero. \n");
        }
        finally {
            System.out.println("Fin del cálculo del factorial.");
        }
    }
}
