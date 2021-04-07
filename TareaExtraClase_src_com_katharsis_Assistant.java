package com.katharsis;

public class Assistant {
    Assistant(){
    }
    public void validarPassw(String password, String repassword) throws CustomException{

        if(!password.equals(repassword)){

            throw new CustomException("las contraseñas ingresadas no coinciden, por favor intente de nuevo.");

        }
        if (password.length() < 10){
            throw new CustomException("la contraseña debe tener al menos 8 caracteres.");

        }
        if (password.equals(repassword)){
            System.out.println("Usuario creado con éxito. ¡Bienvenid@!");
        }
    }
}
