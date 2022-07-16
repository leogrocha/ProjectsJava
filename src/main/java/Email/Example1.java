package Email;

import java.io.File;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.mail.internet.MimeMultipart;




public class Example1 {
	
	static int PORT = 587;
	
	public static void main(String[] args) throws MessagingException {
		Properties props = new Properties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.port", PORT);
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");
		
		Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);
        
        
        Address from = new InternetAddress("leonardo.rocha@ectare.com.br");
        Address to = new InternetAddress("leogrocha1998@gmail.com");

        //configurando o remetente e o destinatario
        message.setFrom(from);
        message.addRecipient(RecipientType.TO, to);

         //configurando a data de envio,  o assunto e o texto da mensagem
        message.setSentDate(new Date());
        message.setSubject("Enviando uma mensagem formatada com anexo");
        
        // conteudo html que sera atribuido a mensagem
        String htmlMessage = "< h t m l > C�digo HTML da mensagem ";

        //criando a Multipart
        Multipart multipart = new MimeMultipart();

        //criando a primeira parte da mensagem
        MimeBodyPart attachment0 = new MimeBodyPart();
        //configurando o htmlMessage com o mime type
        attachment0.setContent(htmlMessage,"text/html; charset=UTF-8");
        //adicionando na multipart
        multipart.addBodyPart(attachment0);
        
        //arquivo que ser� anexado
        String pathname = "duke.png";//pode conter o caminho
        File file = new File(pathname);

        //criando a segunda parte da mensagem
        MimeBodyPart attachment1 = new MimeBodyPart();  
        //configurando o DataHandler para o arquivo desejado
        //a leitura dos bytes, descoberta e configuracao do tipo
        //do arquivo ser�o resolvidos pelo JAF (DataHandler e FileDataSource)
        attachment1.setDataHandler(new DataHandler(new FileDataSource(file)));
        //configurando o nome do arquivo que pode ser diferente do arquivo
        //original Ex: setFileName("outroNome.png")
        attachment1.setFileName(file.getName());
        //adicionando o anexo na multipart
        multipart.addBodyPart(attachment1);

        //adicionando a multipart como conteudo da mensagem 
        message.setContent(multipart);
        
        //enviando
        Transport.send(message);
        
        System.out.println("E-mail enviado com sucesso!");
	}
}
