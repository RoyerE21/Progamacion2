
package LogicaNegocio;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import java.io.FileOutputStream;


/**
 *
 * @author regr9
 */
public class LogicaPDF {
  
    public static void main(String[] args) {
        Document document = new Document();
        String nombreArchivo = "PDFSalario.pdf";
        try {
            PdfWriter.getInstance(document, new FileOutputStream("PDFSalario.pdf"));
            document.open();
            
            // Agrega un párrafo con el texto "Calculo de salario" centrado
            Paragraph p = new Paragraph("Calculo de salario");
            p.setAlignment(Element.ALIGN_CENTER); // Alinea el texto en el centro
            document.add(p);
            
            // Agrega una imagen
            Image imagen = Image.getInstance("\"C:\\Users\\eduar\\Downloads\\CCSS-2.jpg\""); // Ruta de la imagen
            imagen.scaleToFit(200, 200); // Escala la imagen para que se ajuste a un tamaño específico
            imagen.setAlignment(Element.ALIGN_CENTER); // Alinea la imagen en el centro
            document.add(imagen);
            
            // Agrega una tabla
            PdfPTable tabla = new PdfPTable(3); // Creamos una tabla con 3 columnas
            tabla.addCell("Nombre");
            tabla.addCell("Apellido");
            tabla.addCell("Edad");
            
            // Añade más filas de datos
            tabla.addCell("Juan");
            tabla.addCell("Pérez");
            tabla.addCell("30");
            tabla.addCell("María");
            tabla.addCell("López");
            tabla.addCell("25");
            
            document.add(tabla); // Agregamos la tabla al documento
            
            document.close();
            System.out.println("Documento con imagen creado exitosamente.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

     
}
