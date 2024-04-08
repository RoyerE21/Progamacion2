package LogicaNegocio;

import AcccesoDatos.AccesoDatos;
import Entidades.Usuario;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author regr9
 */
public class LogicaUsuario {

    private ArrayList<Usuario> listaUsuarios = new ArrayList();

    private AccesoDatos objAccesoDatos;

    public void insertNuevoUsuario(Usuario objUsuario) throws IOException {

        AccesoDatos objAccesoDatos = new AccesoDatos();

        objAccesoDatos.setNombreArchivo("archivoUsuariosSistema.txt");
        objAccesoDatos.setLinea(objUsuario.getNombreUsuario() + "," + objUsuario.getContraseña());
        objAccesoDatos.insertar(objAccesoDatos);

    }

    //no esta terminado..
    
    public void readUsuarios(Usuario objusuario) throws IOException {

        AccesoDatos objAccesoDatos = new AccesoDatos();
        objAccesoDatos.setNombreArchivo("archivoUsuariosSistema.txt");
        objAccesoDatos.read(objAccesoDatos);

        for (String elemento : objAccesoDatos.getLista()) {
            String[] dato = elemento.split(",");
            Usuario usuario = new Usuario();
            usuario.setNombreUsuario(dato[0]);
            usuario.setContraseña(dato[1]);
            usuario.agregarUsuarioLista(usuario);
        }

    }

    public void update(Usuario objUsuario) throws IOException {

        AccesoDatos objAccesoDatos = new AccesoDatos();
        objAccesoDatos.setNombreArchivo("archivoUsuariosSistema.txt");
        objAccesoDatos.read(objAccesoDatos);

    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void agregarUsuario(Usuario usuario) {
        this.listaUsuarios.add(usuario);
    }

}
