package padroesestruturais.bridgecriacao;

public class CanalFactory {

    public static Canal obterCanal(String canal) {
        if (canal.equals("Email")) {
            return new CanalEmail();
        }
        if (canal.equals("Sms")) {
            return new CanalSms();
        }
        if (canal.equals("Whatsapp")) {
            return new CanalWhatsapp();
        }
        throw new IllegalArgumentException("Canal inexistente");
    }
}
