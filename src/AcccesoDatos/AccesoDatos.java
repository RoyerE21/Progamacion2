package AcccesoDatos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author regr9
 */
public class AccesoDatos {

    /**
     * la variable nombreArchivo va a almacenar el nombre del archivo que tiene
     * los usuarios la variable linea va a almacenar toda la linea que
     * corresponde a un usuario.
     *
     */
    private String nombreArchivo, linea;

    /**
     * el ArrayList lista almacena la lista de usuarios escritos en el archivo
     * de texto
     */
    private ArrayList<String> lista = new ArrayList<>();

    /**
     * el metodo obtenerUltimoId permite obtener el ultimo id del los usuarios
     * escritos en el archivo de texto
     *
     * @param objAccesoDatos recibe un objeto de tipo AccesoDatos
     * @return devuelve el ultimo id escrito en el archivo de texto +1
     * @throws IOException
     */
    public int obtenerUltimoId(AccesoDatos objAccesoDatos) throws IOException {
        int nuevoId = 0;

        BufferedReader objBufferedReader = new BufferedReader(new FileReader(objAccesoDatos.getNombreArchivo()));
        String linea = null;

        while ((linea = objBufferedReader.readLine()) != null) {

            String[] datos = linea.split(",");
            if (datos.length >= 6) {
                int ultimoId = Integer.parseInt(datos[0]);
                if (ultimoId > nuevoId) {
                    nuevoId = ultimoId;
                }
            }
        }

        objBufferedReader.close();

        return nuevoId + 1;
    }

    /**
     * el metodo insertar escribe en el archivo de texto el nuevo usuario
     * ingresado en sistema.
     *
     * @param objAccesoDatos recibe un objeto de tipo AccesoDatos
     * @throws IOException
     */
    public void insertar(AccesoDatos objAccesoDatos) throws IOException {

        BufferedWriter objBufferedWriter = new BufferedWriter(new FileWriter(this.nombreArchivo, true));

        objBufferedWriter.append(this.linea);
        objBufferedWriter.newLine();

        objBufferedWriter.close();

    }

    /**
     * el metodo leer lee los usuarios escritos en el archivo de texto
     *
     * @param objAccesoDatos recibe un objeto de tipo AccesoDatos
     * @throws IOException
     */
    public void leer(AccesoDatos objAccesoDatos) throws IOException {

        String lineaArchivo = null;

        BufferedReader objBufferedReader = new BufferedReader(new FileReader(
                objAccesoDatos.getNombreArchivo()));

        while ((lineaArchivo = objBufferedReader.readLine()) != null) {
            objAccesoDatos.agregarLineaLista(lineaArchivo);
        }

    }

    /**
     * el metodo actualizar selecciona un usuario y actualiza su contenido en el
     * archivo de texto
     *
     * @param objAccesoDatos recibe un objeto de tipo AccesoDatos
     * @throws IOException
     */
    public void actualizar(AccesoDatos objAccesoDatos) throws IOException {

        BufferedWriter objBufferedWriter = new BufferedWriter(new FileWriter(objAccesoDatos.nombreArchivo));

        for (String linea : objAccesoDatos.getLista()) {
            objBufferedWriter.write(linea);
            objBufferedWriter.newLine();

        }

        objBufferedWriter.close();
    }

    /**
     * permite seleccionar y borrar un usuario en el archivo de texto
     *
     * @param objAccesoDatos recibe un objeto de tipo AccesoDatos
     * @throws IOException
     */
    public void eliminar(AccesoDatos objAccesoDatos) throws IOException {

        actualizar(objAccesoDatos);
    }

    /**
     * metodo get del ArrayList Lista
     *
     * @return devuelve una lista de usuarios
     */
    public ArrayList<String> getLista() {
        return lista;
    }

    /**
     * metodo agregarLineaLista agrega una linea a la ArrayList lista
     *
     * @param linea recibo una linea formada por un objeto de tipo usuario
     */
    public void agregarLineaLista(String linea) {
        this.lista.add(linea);
    }

    /**
     * metodo limpiar limpia el ArrayList lista
     */
    public void limpiarLista() {
        this.lista = new ArrayList<>();
    }

    /**
     * este metodo permite recuperar el nombre del archivo de texto almacenado
     * en el
     *
     * @return devuelve un String con el nombre del archivo de texto almacenado
     * en el
     */
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    /**
     * este metodo permite almacenar el nombre del archivo de texto en la
     * variable nombre archivo
     *
     * @param nombreArchivo recibo un String con el nombre del archivo de texto
     */
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    /**
     * este metodo devuelve la linea almacenada en el
     *
     * @return devuelve una linea con un objeto de tipo Usuario
     */
    public String getLinea() {
        return linea;
    }

    /**
     * este metodo permite almacenar una linea con la informacion del objeto de
     * tipo Usuario
     *
     * @param linea recibe una linea con la informacion del Usuario
     */
    public void setLinea(String linea) {
        this.linea = linea;
    }

}
