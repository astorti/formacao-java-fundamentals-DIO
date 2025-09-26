package ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Mensagens.Records;

import ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Mensagens.Interfaces.Message;

public record SocialMedias(String message) implements Message {

    @Override
    public String sendMessage() {
        System.out.println("Mensagem enviada via Redes Sociais.");
        return message;
    }
}
