package mypackage;

import apps.Facebook;
import apps.MsnMessage;
import apps.Telegram;

public class Computador {
    public static void main(String[] args) {
        System.out.println("MSN");
        MsnMessage msn = new MsnMessage();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("Facebook");
        Facebook fcb = new Facebook();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println("Telegram");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
        
    }
}
