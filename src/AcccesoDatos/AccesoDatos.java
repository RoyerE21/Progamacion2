package AcccesoDatos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
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
    private ArrayList<String> lista = new ArrayList();
    
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
    
    public ArrayList<String> getLista() {
        return lista;
    }
    
    public void agregarLineaLista(String linea) {
        this.lista.add(linea);
    }
    
    public void insertar(AccesoDatos objAccesoDatos) throws IOException {
        
        BufferedWriter objBufferedWriter = new BufferedWriter(new FileWriter(nombreArchivo, true));
        objBufferedWriter.append(this.linea);
        objBufferedWriter.newLine();
        objBufferedWriter.close();

        
    }
    
    
    // no esta terminado.
    public void read(AccesoDatos objAccesoDatos) throws FileNotFoundException, IOException {

        //envio 2 tipos de error
        String lineaArchivo;
        BufferedReader objBufferedReader = new BufferedReader(new FileReader(nombreArchivo));
        
        while ((lineaArchivo = objBufferedReader.readLine()) != null) {            
            objAccesoDatos.agregarLineaLista(lineaArchivo);
            
        }
        
        
    }
    
}
