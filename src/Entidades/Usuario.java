package Entidades;

import java.util.ArrayList;

/**
 *
 * @author regr9
 */
public class Usuario {

    /**
     * la variable nombreUsuario almacea el nombre del Usuario la variable
     * contraseña almacena la contraseña la variable nombre almacena el nombre
     * la variable primerApellido almacena el primer apellido la variable
     * segundo Apellido almacena el segundo apellido
     */
    private String nombreUsuario, contraseña, nombre, primerApellido, segundoApellido;
    /**
     * El ArrayList listaUsuarios almacena una lista con los nombres de los
     * usuarios creados
     */
    private ArrayList<Usuario> listaUsuarios = new ArrayList();

    /**
     * la variable ID almacena el ID que corresponde a cada usuario
     */
    private int ID;

    /**
     * permite obtener la lista de usuarios existentes
     *
     * @return devuelve una lista de usuarios
     */
    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    /**
     * permite agregar un usuario a la lista
     *
     * @param usuario recibe un objeto de tipo Usuario
     */
    public void agregarUsuarioLista(Usuario usuario) {
        this.listaUsuarios.add(usuario);
    }

    /**
     * permite recuperar el nombre del archivo de texto almacenado en la
     * variable nombreArchivo
     *
     * @return devuelve un String con el nombre del archivo de texto
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * permite almacenar un String con el nombre del archivo de texto
     *
     * @param nombreUsuario recibe un String con el nombre del archivo de texto
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * permite recuperar la contraseña almacenada en la variable contraseña
     *
     * @return devuelve un String con la contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * permite almacenar la contraseña que establezca el usuario del sistema
     *
     * @param contraseña recibe un String ocn la contraseña
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * permite recuperar el nombre almacenado en la variable nombre
     *
     * @return devuelve el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * permite almacenar el nombre ingresado por el usuario
     *
     * @param nombre recibe un String con el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * permite recuperar el primer apellido almacenado en la varible
     *
     * @return devuleve un String con el primer apellido
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * permite almacenar el primer apellido en la variable primerApellido
     *
     * @param primerApellido recibo un String con el primer apellido
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * permite recuperar el segundo apellido almacedo en la variable
     * segundoApellido
     *
     * @return devulve un String con el segundo apellido
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * permite almacenar el nombre del segundo apellido en la variable
     * segundoApellido
     *
     * @param segundoApellido recibe un String con el nombre del segundo
     * apellido
     */
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    /**
     * permite recuperar el numero de id almacendo en la variable ID
     *
     * @return devuelve un int con el numero de ID
     */
    public int getID() {
        return ID;
    }

    /**
     * permite almacenar un int con el numero de ID
     *
     * @param ID recibe un int con el numero de ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

}
