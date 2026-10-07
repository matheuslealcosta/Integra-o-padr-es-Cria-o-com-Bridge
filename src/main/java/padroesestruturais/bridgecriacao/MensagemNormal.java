package padroesestruturais.bridgecriacao;

public class MensagemNormal extends Mensagem {

    public MensagemNormal(String canal) {
        super(canal);
    }

    public String enviar(String texto) {
        return this.canal.enviar(texto);
    }
}
