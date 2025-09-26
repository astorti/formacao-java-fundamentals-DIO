package ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Mensagens.Records;

import ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Mensagens.Interfaces.Message;

public record Email(String message) implements Message {

    @Override
    public String sendMessage() {
        System.out.println("Mensagem enviada via e-mail.");
        return message;
    }
}
