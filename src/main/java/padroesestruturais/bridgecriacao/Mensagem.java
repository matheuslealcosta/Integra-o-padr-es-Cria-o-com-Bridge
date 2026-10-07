package padroesestruturais.bridgecriacao;

public abstract class Mensagem {

    protected Canal canal;

    public Mensagem(String canal) {
        this.canal = CanalFactory.obterCanal(canal);
    }

    public void setCanal(String canal) {
        this.canal = CanalFactory.obterCanal(canal);
    }

    public abstract String enviar(String texto);
}
