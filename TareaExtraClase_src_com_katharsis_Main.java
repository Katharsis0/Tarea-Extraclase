package com.katharsis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Factorial.Factorial();

        System.out.println("\nRegistro de Usuario y Contraseña: \n");

        String user, password, repassword;
        user= "hvsebas";
        //alterar la password y repassword para ver los distintos errores.
        password= "Panchito31";
        repassword= "Panchito31";

        Assistant a= new Assistant();

        try {
            a.validarPassw(password, repassword);
        }

        catch (CustomException e){
            System.out.println("Error: El usuario no pudo ser registrado debido a que " + e.getMessage());
        }
        finally {
            System.out.println("\nFin del proceso de registro.");
        }
    }
}
