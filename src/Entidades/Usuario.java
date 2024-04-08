
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author regr9
 */
public class Usuario {
    
    private String nombreUsuario, contraseña;
    private ArrayList<Usuario> listaUsuarios = new ArrayList();

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void agregarUsuarioLista(Usuario usuario) {
        this.listaUsuarios.add(usuario);
    }

   

   

}
