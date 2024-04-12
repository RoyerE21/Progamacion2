package LogicaNegocio;

import AcccesoDatos.AccesoDatos;
import Entidades.Usuario;
import java.io.IOException;

/**
 *
 * @author regr9
 */
public class LogicaUsuario {

    

    private AccesoDatos objAccesoDatos;

    public void insertNuevoUsuario(Usuario objUsuario) throws IOException {

        
        AccesoDatos objAccesoDatos = new AccesoDatos();

        objAccesoDatos.setNombreArchivo("archivoUsuariosSistema.txt");
        
        objAccesoDatos.setLinea(objAccesoDatos.obtenerUltimoId(objAccesoDatos)
                + ","+ objUsuario.getNombreUsuario() 
                + "," + objUsuario.getContraseña()
                + "," +objUsuario.getNombre()+ "," 
                +objUsuario.getPrimerApellido()+ "," 
                +objUsuario.getSegundoApellido());
        
        objAccesoDatos.insertar(objAccesoDatos);

    }

    

   


}
