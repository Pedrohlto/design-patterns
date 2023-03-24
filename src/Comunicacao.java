public class Comunicacao {

    public void enviarSMS(Funcionario funcionario){
        BrokerXPTO xpto = new BrokerXPTO();
        xpto.host = "hots";
        xpto.porta = "porta";
        xpto.token = "123456789";
        xpto.destino = funcionario.getTelefone();
        xpto.enviarSMS(funcionario);
    }
}
