
package Presentacion;

import Entidades.Usuario;
import LogicaNegocio.LogicaUsuario;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author regr9
 */
public class NewClass {

    
    // esta es una clase para pobrar la logica DESPUES LA VOY A ELIMINAR.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        LogicaUsuario objLogicaUsuario = new LogicaUsuario();
        Usuario objUsuario = new Usuario();
        
       System.out.println("USUARIO");
       objUsuario.setNombreUsuario(teclado.nextLine());
      
        System.out.println("contraseña");
        objUsuario.setContraseña(teclado.nextLine());
        
        System.out.println("nombre");
        objUsuario.setNombre(teclado.nextLine());
        
        System.out.println("apellido");
        objUsuario.setPrimerApellido(teclado.nextLine());
        
        System.out.println("apellido 2");
        objUsuario.setSegundoApellido(teclado.nextLine());
        
        
        
        
       
        try {
            
            objLogicaUsuario.insertNuevoUsuario(objUsuario);
            
        } catch (IOException ex) {
            
            System.out.println(ex.getMessage()); 
        }
        
        
    }
    
}
