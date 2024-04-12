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

    private String nombreArchivo, linea;
    
    private ArrayList<String> lista = new ArrayList<>();

    
    
    
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

    public void insertar(AccesoDatos objAccesoDatos) throws IOException {

        BufferedWriter objBufferedWriter = new BufferedWriter(new FileWriter(objAccesoDatos.getNombreArchivo(), true));
        objBufferedWriter.append(linea);
        objBufferedWriter.newLine();
        objBufferedWriter.close();

    }
    
    public void leer(AccesoDatos objAccesoDatos) throws IOException {

        String lineaArchivo = null;

        BufferedReader objBufferedReader = new BufferedReader(new FileReader(
                objAccesoDatos.getNombreArchivo()));

        while ((lineaArchivo = objBufferedReader.readLine()) != null) {
            objAccesoDatos.setElementoLista(lineaArchivo);
        }

    }
    
    
    
    
    public ArrayList<String> getLista() {
        return lista;
    }

    public void setElementoLista(String elemento) {
        this.lista.add(elemento);
    }

    public void limpiarLista() {
        this.lista = new ArrayList<>();
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

}
