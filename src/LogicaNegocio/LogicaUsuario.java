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
/**
 * Instancia de la clase AccesoDatos para poder ejecutar SCRUB
 */
    private AccesoDatos objAccesoDatos;
    
    /**
     * El metodo read permite leer el archivo texto 
     * @param objUsuario el metodo read recibe un objeto de un parametro de tipo Usuario.
     * @throws IOException 
     */

    
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
            usuario.setApellidos(dato[4]);
            usuario.setCorreo(dato[5]);

            
            objUsuario.agregarUsuarioLista(usuario);

        }

    }
    
    /**
     * El metodo insert permite actualizar los usuarios del archivo de texto 
     * @param objUsuario el metodo read recibe un objeto de un parametro de tipo Usuario
     * @throws IOException 
     */

    public void insert(Usuario objUsuario) throws IOException {

        objAccesoDatos = new AccesoDatos();
        objAccesoDatos.setNombreArchivo("archivoUsuariosSistema");

        objUsuario.setID(objAccesoDatos.obtenerUltimoId(objAccesoDatos));

        objAccesoDatos.setLinea(objUsuario.getID() + ","
                + objUsuario.getNombreUsuario()+ ","
                + objUsuario.getContraseña()+ ","
                + objUsuario.getNombre()+ ","
                + objUsuario.getApellidos()+ ","
                + objUsuario.getCorreo());
               
                

        objAccesoDatos.insertar(objAccesoDatos);

    }
    
    
    /**
     * El metodo update permite actualizar el usuario que se seleccione en el archivo texto 
     * @param objUsuario el metodo read recibe un objeto de un parametro de tipo Usuario
     * @throws IOException 
     */
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
                String primerApellido = (objUsuario.getApellidos() != null) ? objUsuario.getApellidos() : dato[4];
                String segundoApellido = (objUsuario.getCorreo() != null) ? objUsuario.getCorreo() : dato[5];
                
                elemento = IdUsuario + "," + nombreUsuario + "," + contraseña + "," + nombre + "," + primerApellido + "," +segundoApellido;
            }
            objAccesoDatos.agregarLineaLista(elemento);
        }
        objAccesoDatos.actualizar(objAccesoDatos);

    }
    
    
    /**
     * El metodo delete permite borrar el usuario que se seleccione en el archivo de texto 
     * @param objUsuario el metodo read recibe un objeto de un parametro de tipo Usuario
     * @throws IOException 
     */
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
