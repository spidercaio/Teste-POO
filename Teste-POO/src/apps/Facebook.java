package apps;

public class Facebook extends ServicoMensagemInstantanea {
    public void enviarMensagem(){
        validarConexaoInternet();
    System.out.println("Enviando mensagem pelo Facebook...");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook");
    }
}
