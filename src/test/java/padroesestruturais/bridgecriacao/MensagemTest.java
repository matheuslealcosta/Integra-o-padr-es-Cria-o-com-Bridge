package padroesestruturais.bridgecriacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MensagemTest {
    @Test
    void deveCriarCanalEmail() {
        Canal canal = CanalFactory.obterCanal("Email");
        assertInstanceOf(CanalEmail.class, canal);
    }

    @Test
    void deveCriarCanalSms() {
        Canal canal = CanalFactory.obterCanal("Sms");
        assertInstanceOf(CanalSms.class, canal);
    }

    @Test
    void deveRetornarExcecaoCanalInexistente() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CanalFactory.obterCanal("Telegram");
        });
        assertEquals("Canal inexistente", exception.getMessage());
    }

    @Test
    void deveEnviarMensagemNormalPorEmail() {
        Mensagem mensagem = new MensagemNormal("Email");
        assertEquals("Email: Reunião às 14h", mensagem.enviar("Reunião às 14h"));
    }

    @Test
    void deveEnviarMensagemNormalPorSms() {
        Mensagem mensagem = new MensagemNormal("Sms");
        assertEquals("SMS: Reunião às 14h", mensagem.enviar("Reunião às 14h"));
    }

    @Test
    void deveEnviarMensagemUrgentePorWhatsapp() {
        Mensagem mensagem = new MensagemUrgente("Whatsapp");
        assertEquals("WhatsApp: [URGENTE] SERVIDOR FORA DO AR", mensagem.enviar("Servidor fora do ar"));
    }

    @Test
    void deveEnviarMensagemUrgentePorEmail() {
        Mensagem mensagem = new MensagemUrgente("Email");
        assertEquals("Email: [URGENTE] SERVIDOR FORA DO AR", mensagem.enviar("Servidor fora do ar"));
    }

    @Test
    void deveTrocarCanalDaMensagem() {
        Mensagem mensagem = new MensagemNormal("Email");
        mensagem.setCanal("Sms");
        assertEquals("SMS: Prova adiada", mensagem.enviar("Prova adiada"));
    }
}