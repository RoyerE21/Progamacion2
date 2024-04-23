package LogicaNegocio;

import Entidades.Usuario;
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
import LogicaNegocio.LogicaColaborador;
import java.time.LocalDate;
/**
 *
 * @author regr9
 */
public class LogicaPDF {

   // LogicaNegocio.LogicaColaborador objLogicaColaborador = new LogicaNegocio.LogicaColaborador().;
 private static String nombreArchivo;
    public static void CrearPdf() {
        Usuario objUsuario = new Usuario();
        LogicaEnviarCorreo  objLogicaEnviarCorreo = new LogicaEnviarCorreo();
        Document document = new Document();
        LocalDate fechaActual = LocalDate.now();
         nombreArchivo =  objLogicaEnviarCorreo.getCorreoEnvioPDF()+ fechaActual+ ".pdf";
        // objLogicaEnviarCorreo.setCorreoEnvioPDF
        try {
             LogicaNegocio.LogicaColaborador objLogicaColaborador = new LogicaNegocio.LogicaColaborador();
            PdfWriter.getInstance(document, new FileOutputStream(nombreArchivo));
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
            tabla.addCell("CRC " + LogicaNegocio.LogicaColaborador.getTotalSem());
 
            tabla.addCell("IVM");
            tabla.addCell("5.42%");
            tabla.addCell("4.17%");
            tabla.addCell("CRC " + LogicaNegocio.LogicaColaborador.getTotalIvm());
 
            //
            tabla.addCell("Total CCSS");
            tabla.addCell("14.67%");
            tabla.addCell("9.67%");
            tabla.addCell("CRC "+ LogicaNegocio.LogicaColaborador.getTotalCcss());
 
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
            tabla1.addCell("CRC "  + LogicaNegocio.LogicaColaborador.getDeduccionCuotaPopularPatrono());
 
            //
            tabla1.addCell("Asignaciones Familiares");
            tabla1.addCell("5.00%");
            tabla1.addCell("            -");
            tabla1.addCell("CRC " + LogicaNegocio.LogicaColaborador.getDeduccionAsignacionesFamiliares());
 
            tabla1.addCell("IMAS");
            tabla1.addCell("0.50%");
            tabla1.addCell("            -");
            tabla1.addCell("CRC " + LogicaNegocio.LogicaColaborador.getDeduccionImas());
 
            tabla1.addCell("INA");
            tabla1.addCell("1.50%");
            tabla1.addCell("            -");
            tabla1.addCell("CRC " +LogicaNegocio.LogicaColaborador.getDeduccionIna());
 
            tabla1.addCell("Total Otras Instituciones");
            tabla1.addCell("7.25%");
            tabla1.addCell("            -");
            tabla1.addCell("CRC " + LogicaNegocio.LogicaColaborador.getOtrasInstituciones());
 
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
            tabla2.addCell("            -");
            tabla2.addCell("CRC " + LogicaNegocio.LogicaColaborador.getDeduccionAportePopularPatrono());
 
            tabla2.addCell("Fondo de Capitalización laboral");
            tabla2.addCell("1.50");
            tabla2.addCell("            -");
            tabla2.addCell("CRC " + LogicaNegocio.LogicaColaborador.getTotalFondoCapitalizacion());
 
            tabla2.addCell("Fondo de Pensiones Complementarias");
            tabla2.addCell("2.00%");
            tabla2.addCell("            -");
            tabla2.addCell("CRC " + LogicaNegocio.LogicaColaborador.getTotalFondoPensiones());
 
            tabla2.addCell("Aporte Trabajador Banco Popular");
            tabla2.addCell("            -");
            tabla2.addCell("1.00%");
            tabla2.addCell("CRC " + LogicaNegocio.LogicaColaborador.getDeduccionAportePopularTrabajador());
 
            tabla2.addCell("INS");
            tabla2.addCell("1.00%");
            tabla2.addCell("            -");
            tabla2.addCell("CRC " +LogicaNegocio.LogicaColaborador.getTotalIns());
 
            tabla2.addCell("TOTAL LPT");
            tabla2.addCell("4.75%");
            tabla2.addCell("1.00%");
            tabla2.addCell("CRC " + LogicaNegocio.LogicaColaborador.getTotalLpt());
            document.add(tabla2);
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
            tabla3.addCell("37.34%");
 
            tabla3.addCell("MONTOS TOTALES");
            tabla3.addCell("CRC " + LogicaNegocio.LogicaColaborador.getAporteTotalPatrono());
            tabla3.addCell("CRC " + LogicaNegocio.LogicaColaborador.getDeduccionesCcssColaborador());
            tabla3.addCell("CRC " + LogicaNegocio.LogicaColaborador.getAporteTotal());
            document.add(tabla3); // Agregamos la tabla al documento
 
            Paragraph espacio7 = new Paragraph("\n" + "Detalles sobre el Pago");
            espacio7.setAlignment(Element.ALIGN_CENTER);
            document.add(espacio7);
 
            Paragraph espacio8 = new Paragraph("\n");
            document.add(espacio8);
 
            PdfPTable tabla4 = new PdfPTable(2);
            tabla4.addCell("Deducción a trabajador");
            tabla4.addCell("Monto correspondiente");
 
            tabla4.addCell("CSS");
            tabla4.addCell("CRC " + LogicaNegocio.LogicaColaborador.getDeduccionesCcssColaborador());
 
            tabla4.addCell("Impuesto a la renta");
            tabla4.addCell("CRC " + LogicaNegocio.LogicaColaborador.getImpuestosSobreRenta());
            document.add(tabla4);
 
            Paragraph p4 = new Paragraph("\n" + "Su salario bruto corresponde a: CRC " + LogicaNegocio.LogicaColaborador.getSalarioSinDeducciones());
            document.add(p4);
 
            Paragraph p5 = new Paragraph("Su salario neto corresponde a: CRC " + LogicaNegocio.LogicaColaborador.getSalarioNeto());
            document.add(p5);
            document.close();
            System.out.println("Documento con imagen creado exitosamente.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static String getNombreArchivo() {
        return nombreArchivo;
    }

    public static void setNombreArchivo(String aNombreArchivo) {
        nombreArchivo = aNombreArchivo;
    }
    }
