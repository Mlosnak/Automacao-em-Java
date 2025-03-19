@Service
public class EmailService {

    @Async
    public void enviarEmail(String destinatario, String assunto, String corpo) {
        System.out.println("Enviando e-mail para: " + destinatario);
    }
}