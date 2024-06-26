package LogicaNegocio;
 
import java.io.File;
import javax.mail.Authenticator;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;
 
/**
*
* "@author Grupo #2"
*/
public class LogicaEnviarCorreo extends LogicaPDF {
   private static LogicaPDF objLogicaPDF = new LogicaPDF();
    private static String correoEnvioPDF;
                   
 
    /**
     * Clase principal que permite enviar correos electrónicos utilizando la API
     * de JavaMail.
     */
//public class Main {
    // Variables estáticas para almacenar la información del correo electrónico
    private static String emailFrom = "eduardo.dominguez0809@gmail.com";
    // Contraseña del remitente
    private static String passwordFrom = "nywo wwcr dnfx ngyb";
    private static String emailTo;
    private static String content;
    private static String subject;
    // Variables de instancia para almacenar las propiedades del correo y la sesión
    private static Properties mProperties;
    private static Session mSession;
    private static MimeMessage mCorreo;
 
    /**
     * Método para crear el correo electrónico con la configuración adecuada.
     */
    public void createEmail() {
        // Configuración de las propiedades del servidor SMTP de Gmail
        mProperties = new Properties();
        // Correo electrónico del destinatario
        emailTo = correoEnvioPDF;
        // Asunto del correo
        subject = "Comprobante de pago ";
        // Contenido del correo
        content = "";
        // Configuración de las propiedades del servidor SMTP de Gmail
        mProperties.put("mail.smtp.host", "smtp.gmail.com");
        mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        mProperties.setProperty("mail.smtp.starttls.enable", "true");
        mProperties.setProperty("mail.smtp.port", "587");
        mProperties.setProperty("mail.smtp.user", emailFrom);
        mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        mProperties.setProperty("mail.smtp.auth", "true");
        // Creación de la sesión de correo electrónico
        mSession = Session.getDefaultInstance(mProperties);
        try {
            // Creación del mensaje de correo electrónico
            mCorreo = new MimeMessage(mSession);
            // Dirección del remitente
            mCorreo.setFrom(new InternetAddress(emailFrom));
            // Dirección del destinatario
            mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
            // Asignación del asunto
            mCorreo.setSubject(subject);
            // Asignación del contenido
            mCorreo.setText(content, "ISO-8859-1", "html");
            
           
 
        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(null, "Error de sistema "+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
         try {
            // Creación del mensaje de correo electrónico
            mCorreo = new MimeMessage(mSession);
            // Dirección del remitente
            mCorreo.setFrom(new InternetAddress(emailFrom));
            // Dirección del destinatario
            mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
            // Asignación del asunto
            mCorreo.setSubject(subject);

            // Crear el cuerpo del mensaje
            MimeBodyPart mensajeBodyPart = new MimeBodyPart();
            mensajeBodyPart.setContent(content, "text/html");

            // Crear la parte del archivo adjunto
            MimeBodyPart adjuntoBodyPart = new MimeBodyPart();
            DataSource fuenteDatos = new FileDataSource(LogicaPDF.getNombreArchivo());
            adjuntoBodyPart.setDataHandler(new DataHandler(fuenteDatos));
            adjuntoBodyPart.setFileName(new File(LogicaPDF.getNombreArchivo()).getName());

            // Crear una parte mixta para el mensaje
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(mensajeBodyPart);
            multipart.addBodyPart(adjuntoBodyPart);

            // Establecer el contenido mixto como el contenido del mensaje
            mCorreo.setContent(multipart);

        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(null, "Error de sistema "+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    
 
    }
 
    /**
     * Método para enviar el correo electrónico.
     */
    public void sendMail() {
        try {
            Transport mTransport = mSession.getTransport("smtp");
            // Autenticación con la cuenta del remitente
            mTransport.connect(emailFrom, passwordFrom);
            // Envío del correo
            mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
            // Cierre de la conexión
            mTransport.close();
            JOptionPane.showMessageDialog(null, "Correo enviado");
        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(null, "Error de sistema "+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
 
    }
 
    public String getCorreoEnvioPDF() {
        return correoEnvioPDF;
    }
 
    public void setCorreoEnvioPDF(String correoEnvioPDF) {
        this.correoEnvioPDF = correoEnvioPDF;
    }
    /**
     * Método principal para enviar un correo electrónico.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
 
}