package padroesestruturais.bridgecriacao;

public class CanalEmail implements Canal {

    public String enviar(String texto) {
        return "Email: " + texto;
    }
}
