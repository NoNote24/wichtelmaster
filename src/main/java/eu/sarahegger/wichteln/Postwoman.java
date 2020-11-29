package eu.sarahegger.wichteln;

import lombok.Setter;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.Session;
import javax.mail.Transport;

/**
 * For more information about what is going on here,visit
 * https://www.geeksforgeeks.org/send-email-using-java-program/
 * and for using yahoo etc., look here:
 * https://www.codeproject.com/Articles/5266074/Send-Email-with-Java-and-Yahoo-Mail
 */
public class Postwoman {
    @Setter private String recipient;
    private String sender = "YOUR.EMAIL@yourhost.com";
    private String host = "smtp.mail.WHATEVER.com";
    private Properties properties = System.getProperties();
    private Session session;

    public Postwoman() {
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "YOURPORT");
        properties.put("mail.smtp.starttls.enable", true);
        properties.put("mail.smtp.auth", true);
        session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("YOUR.EMAIL@yourhost.com", "your$4FEpwd");
            }
        });
        session.setDebug(true);
    }

    public void sendEmail(String senderName, String recipientName) {
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(sender));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            message.setSubject("Wichteln");
            message.setContent(new Template(senderName, recipientName).returnContent(), "text/html");
            Transport.send(message);
            System.out.println("Mail successfully sent. Amazing - 'successfully' contains three double consonants!");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
