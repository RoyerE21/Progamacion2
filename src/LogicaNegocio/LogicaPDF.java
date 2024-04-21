package LogicaNegocio;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import java.io.FileOutputStream;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author regr9
 */
public class LogicaPDF {

    public static void main(String[] args) {
        Document document = new Document();
        String nombreArchivo = "PDFSalario.pdf";
        try {
            PdfWriter.getInstance(document, new FileOutputStream("PDFSalario1.pdf"));
            document.open();

            // Agrega un párrafo con el texto "Calculo de salario" centrado
            Paragraph p = new Paragraph("Calculo de salario");
            p.setAlignment(Element.ALIGN_CENTER); // Alinea el texto en el centro
            document.add(p);

            Paragraph espacio = new Paragraph("\n");
            document.add(espacio);
            // Agrega una imagen
            /*   Image imagen = Image.getInstance("\"C:\\Users\\eduar\\Downloads\\CCSS-2.jpg\""); // Ruta de la imagen
            imagen.scaleToFit(200, 200); // Escala la imagen para que se ajuste a un tamaño específico
            imagen.setAlignment(Element.ALIGN_CENTER); // Alinea la imagen en el centro
            document.add(imagen);*/

            // Agrega una tabla
            PdfPTable tabla = new PdfPTable(4);

            tabla.addCell("Concepto");
            tabla.addCell("Patrono");
            tabla.addCell("Trabajador");
            tabla.addCell("Monto");
            // Añade más filas de datos
            tabla.addCell("SEM");
            tabla.addCell("9.25%");
            tabla.addCell("5.50%");
            tabla.addCell("María");

            tabla.addCell("IVM");
            tabla.addCell("5.42%");
            tabla.addCell("4.17%");
            tabla.addCell("María");

            //
            tabla.addCell("Total CCSS");
            tabla.addCell("14.67%");
            tabla.addCell("9.67%");
            tabla.addCell("María");

            document.add(tabla);
            Paragraph espacio1 = new Paragraph("\n");
            document.add(espacio1);
            Paragraph p1 = new Paragraph("Otras Instituciones");
            p1.setAlignment(Element.ALIGN_CENTER); // Alinea el texto en el centro
            document.add(p1);
            Paragraph espacio2 = new Paragraph("\n");
            document.add(espacio2);
            PdfPTable tabla1 = new PdfPTable(4);
            //

            tabla1.addCell("Cuota Banco Popular");
            tabla1.addCell("0.25%");
            tabla1.addCell("            -");
            tabla1.addCell("María");

            //
            tabla1.addCell("Asignaciones Familiares");
            tabla1.addCell("5.00%");
            tabla1.addCell("            -");
            tabla1.addCell("María");

            tabla1.addCell("IMAS");
            tabla1.addCell("0.50%");
            tabla1.addCell("            -");
            tabla1.addCell("María");

            tabla1.addCell("INA");
            tabla1.addCell("1.50%");
            tabla1.addCell("            -");
            tabla1.addCell("María");

            tabla1.addCell("Total Otras Instituciones");
            tabla1.addCell("7.25%");
            tabla1.addCell("            -");
            tabla1.addCell("María");

            document.add(tabla1);
            Paragraph espacio3 = new Paragraph("\n");
            document.add(espacio3);
            Paragraph p2 = new Paragraph("Ley de Protección al Trabajador (LPT)");
            p2.setAlignment(Element.ALIGN_CENTER); // Alinea el texto en el centro
            document.add(p2);
            Paragraph espacio4 = new Paragraph("\n");
            document.add(espacio4);
            PdfPTable tabla2 = new PdfPTable(4);

            tabla2.addCell("Aporte Patrono Banco Popular");
            tabla2.addCell("0.25%");
            tabla1.addCell("            -");
            tabla2.addCell("María");

            tabla2.addCell("Fondo de Capitalización laboral");
            tabla2.addCell("1.50");
            tabla1.addCell("            -");
            tabla2.addCell("María");

            tabla2.addCell("Fondo de Pensiones Complementarias");
            tabla2.addCell("2.00%");
            tabla1.addCell("            -");
            tabla2.addCell("María");

            tabla2.addCell("Aporte Trabajador Banco Popular");
            tabla1.addCell("            -");
            tabla2.addCell("1.00%");
            tabla2.addCell("María");

            tabla2.addCell("INS");
            tabla2.addCell("1.00%");
            tabla1.addCell("            -");
            tabla2.addCell("María");

            tabla2.addCell("TOTAL LPT");
            tabla2.addCell("4.75%");
            tabla2.addCell("1.00%");
            tabla2.addCell("María");
            document.add(tabla1);
            Paragraph espacio5 = new Paragraph("\n");
            document.add(espacio5);
            Paragraph p3 = new Paragraph("TOTAL");
            p3.setAlignment(Element.ALIGN_CENTER); // Alinea el texto en el centro
            document.add(p3);
            Paragraph espacio6 = new Paragraph("\n");
            document.add(espacio6);
            PdfPTable tabla3 = new PdfPTable(4);

            //
            tabla3.addCell("PORCENTAJES TOTALES");
            tabla3.addCell("26.67%");
            tabla3.addCell("10.67%");
            tabla3.addCell("María");

            tabla3.addCell("MONTOS TOTALES");
            tabla3.addCell("25");
            tabla3.addCell("30");
            tabla3.addCell("María");
            document.add(tabla3); // Agregamos la tabla al documento

            document.close();
            System.out.println("Documento con imagen creado exitosamente.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
