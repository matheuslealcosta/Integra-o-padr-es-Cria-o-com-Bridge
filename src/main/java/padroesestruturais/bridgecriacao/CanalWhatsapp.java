package padroesestruturais.bridgecriacao;

public class CanalWhatsapp implements Canal {

    public String enviar(String texto) {
        return "WhatsApp: " + texto;
    }
}
