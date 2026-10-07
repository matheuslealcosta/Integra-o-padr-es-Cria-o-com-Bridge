package padroesestruturais.bridgecriacao;

public class MensagemUrgente extends Mensagem {

    public MensagemUrgente(String canal) {
        super(canal);
    }

    public String enviar(String texto) {
        return this.canal.enviar("[URGENTE] " + texto.toUpperCase());
    }
}
