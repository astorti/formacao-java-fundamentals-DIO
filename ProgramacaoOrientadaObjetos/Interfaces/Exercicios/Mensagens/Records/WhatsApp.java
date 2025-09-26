package ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Mensagens.Records;

import ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Mensagens.Interfaces.Message;

public record WhatsApp(String message) implements Message {

    @Override
    public String sendMessage() {
        System.out.println("Mensagem enviada via WhatsApp.");
        return message;
    }
}
