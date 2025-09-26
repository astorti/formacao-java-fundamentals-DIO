package ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Mensagens;

import java.util.Scanner;

import ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Mensagens.Records.Email;
import ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Mensagens.Records.SMS;
import ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Mensagens.Records.SocialMedias;
import ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Mensagens.Records.WhatsApp;

public class Main {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva uma mensagem: ");
        String message = scanner.nextLine();
        
        Email email = emailMessage(message);
        System.out.println(email.sendMessage());

        SMS sms = smsMessage(message);
        System.out.println(sms.sendMessage());

        SocialMedias socialMedia = socialMediaMessage(message);
        System.out.println(socialMedia.sendMessage());

        WhatsApp whatsApp = whatsAppMessage(message);
        System.out.println(whatsApp.sendMessage());

        scanner.close();
    }

    private static Email emailMessage(String message) {
        return new Email(message);
    }

    private static SMS smsMessage(String message) {
        return new SMS(message);
    }

    private static SocialMedias socialMediaMessage(String message) {
        return new SocialMedias(message);
    }

    private static WhatsApp whatsAppMessage(String message) {
        return new WhatsApp(message);
    }

}
