public class BrokerXPTO {

    public String host;
    public String porta;
    public String token;
    public String destino;

    public void enviarSMS(Funcionario funcionario){
        System.out.println("conectando com o broker de msg XPTO");
        System.out.println("Fazendo autenticação com o broker de msg XPTO");
        System.out.println("Enviando mensagem com o broker de msg XPTO");
        System.out.println(String.format("Olá %S você recebeu um aumento e seu novo salario é R$ %s", funcionario.getNome(),  funcionario.getSalario()));
    }
}
