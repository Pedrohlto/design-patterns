public class RegraCalculoAumentoFactory {

    public CalcularAumentoStrategy getRegra(Funcionario funcionario){
        var senioridade = funcionario.getSenioridade();

        switch (senioridade){

            case JUNIOR :
                return new AumentoSalarioJR();
            case PLENO:
                return new AumentoSalarioPLENO();
            case SENIOR:
                return new AumentoSalarioSenior();
            case ESPECIALISTA:
                return new AumentoSalarioEspecialista();
            default:
                throw new RuntimeException();
        }
    }
}
