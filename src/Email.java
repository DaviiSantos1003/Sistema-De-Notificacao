public class Email implements Notificador {


    @Override
    public void enviar(String mensagem) {
        IO.println ("Enviando Email: " + mensagem);
    }


}