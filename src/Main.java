void main() {

    Notificador email = new Email();
    Notificador SMS = new SMS();

    email.enviar("Testando implements...");
    SMS.enviar("Agregação e Composição em andamento:");


}