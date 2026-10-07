package padroesestruturais.bridgecriacao;

public class CanalSms implements Canal {

    public String enviar(String texto) {
        return "SMS: " + texto;
    }
    
}
