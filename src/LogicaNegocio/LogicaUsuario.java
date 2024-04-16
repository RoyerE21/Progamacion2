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

    private AccesoDatos objAccesoDatos;

    public void read(Usuario objUsuario) throws IOException {

        AccesoDatos objAccesoDatos = new AccesoDatos();
        objAccesoDatos.setNombreArchivo("archivoUsuariosSistema");

        objAccesoDatos.leer(objAccesoDatos);

        for (String elemento : objAccesoDatos.getLista()) {
            String[] dato = elemento.split(",");
            Usuario usuario = new Usuario();
            usuario.setID(Integer.parseInt(dato[0]));
            usuario.setNombreUsuario(dato[1]);
            usuario.setContraseña(dato[2]);
            usuario.setNombre(dato[3]);
            usuario.setPrimerApellido(dato[4]);
            usuario.setPrimerApellido(dato[5]);

            
            objUsuario.agregarUsuarioLista(usuario);

        }

    }

    public void insert(Usuario objUsuario) throws IOException {

        objAccesoDatos = new AccesoDatos();
        objAccesoDatos.setNombreArchivo("archivoUsuariosSistema");

        objUsuario.setID(objAccesoDatos.obtenerUltimoId(objAccesoDatos));

        objAccesoDatos.setLinea(objUsuario.getID() + ","
                + objUsuario.getNombreUsuario()+ ","
                + objUsuario.getContraseña()+ ","
                + objUsuario.getNombre()+ ","
                + objUsuario.getPrimerApellido()+ ","
                + objUsuario.getSegundoApellido());
               
                

        objAccesoDatos.insertar(objAccesoDatos);

    }
    
    
    public void update(Usuario objUsuario) throws IOException {

        AccesoDatos objAccesoDatos = new AccesoDatos();
        objAccesoDatos.setNombreArchivo("archivoUsuariosSistema");
        objAccesoDatos.leer(objAccesoDatos);

        int IdUsuario = objUsuario.getID();

        ArrayList<String> listaTemporal = objAccesoDatos.getLista();

        objAccesoDatos.limpiarLista();

        for (String elemento : listaTemporal) {
            String[] dato = elemento.split(",");
            int id = Integer.parseInt(dato[0]);

            if (id == IdUsuario) {
                String nombreUsuario = (objUsuario.getNombreUsuario() != null) ? objUsuario.getNombreUsuario() : dato[1];
                String contraseña = (objUsuario.getContraseña() != null) ? objUsuario.getContraseña() : dato[2];
                String nombre = (objUsuario.getNombre() != null) ? objUsuario.getNombre() : dato[3];
                String primerApellido = (objUsuario.getPrimerApellido() != null) ? objUsuario.getPrimerApellido() : dato[4];
                String segundoApellido = (objUsuario.getSegundoApellido() != null) ? objUsuario.getSegundoApellido() : dato[5];
                
                elemento = IdUsuario + "," + nombreUsuario + "," + contraseña + "," + nombre + "," + primerApellido + "," +segundoApellido;
            }
            objAccesoDatos.agregarLineaLista(elemento);
        }
        objAccesoDatos.actualizar(objAccesoDatos);

    }
    
    
    public void delete(Usuario objUsuario) throws IOException {

        AccesoDatos objAccesoDatos = new AccesoDatos();
        objAccesoDatos.setNombreArchivo("archivoUsuariosSistema");
        objAccesoDatos.leer(objAccesoDatos);

        int IdUsuario = objUsuario.getID();

        ArrayList<String> listaTemporal = objAccesoDatos.getLista();

        objAccesoDatos.limpiarLista();

        for (String elemento : listaTemporal) {
            String[] dato = elemento.split(",");
            int id = Integer.parseInt(dato[0]);

            if (id == IdUsuario) {
                continue;
            }
            objAccesoDatos.agregarLineaLista(elemento);
        }
        objAccesoDatos.eliminar(objAccesoDatos);

    }
    

}
