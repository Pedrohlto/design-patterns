import java.math.BigDecimal;

public class RH {

    private static final Double PORCENTAGEM_JR_TEMPO_CASA_MENOR_CINCO = 0.5 ;
    private static final Double PORCENTAGEM_JR_TEMPO_CASA_MAIOR_CINCO = 0.7 ;
    private static final Double PORCENTAGEM_PLENO_TEMPO_CASA_MENOR_CINCO = 0.10 ;
    private static final Double PORCENTAGEM_PLENO_TEMPO_CASA_MAIOR_CINCO = 0.12;
    private static final Double PORCENTAGEM_SENIOR_TEMPO_CASA_MENOR_CINCO = 0.15;
    private static final Double PORCENTAGEM_SENIOR_TEMPO_CASA_MAIOR_CINCO = 0.17;
    private static final Double PORCENTAGEM_ESPECIALISTA_TEMPO_CASA_MENOR_CINCO = 0.20;
    private static final Double PORCENTAGEM_ESPECIALISTA_TEMPO_CASA_MAIOR_CINCO = 0.25;

    public BigDecimal calcularAumentoFuncionario(Funcionario funcionario){

        if(funcionario.getSenioridade().equals(Senioridade.JUNIOR)){

            if(funcionario.getTempoDeCasaEmAnos() < 5) {
              return funcionario.getSalario().multiply(BigDecimal.valueOf(PORCENTAGEM_JR_TEMPO_CASA_MENOR_CINCO));
            } else {
              return funcionario.getSalario().multiply(BigDecimal.valueOf(PORCENTAGEM_JR_TEMPO_CASA_MAIOR_CINCO));
            }
        }

        if(funcionario.getSenioridade().equals(Senioridade.PLENO)){
            if(funcionario.getTempoDeCasaEmAnos() < 5) {
                return funcionario.getSalario().multiply(BigDecimal.valueOf(PORCENTAGEM_PLENO_TEMPO_CASA_MENOR_CINCO));
            } else {
                return funcionario.getSalario().multiply(BigDecimal.valueOf(PORCENTAGEM_PLENO_TEMPO_CASA_MAIOR_CINCO));
            }
        }

        if(funcionario.getSenioridade().equals(Senioridade.SENIOR)){
            if(funcionario.getTempoDeCasaEmAnos() < 5) {
                return funcionario.getSalario().multiply(BigDecimal.valueOf(PORCENTAGEM_SENIOR_TEMPO_CASA_MENOR_CINCO));
            } else {
                return funcionario.getSalario().multiply(BigDecimal.valueOf(PORCENTAGEM_SENIOR_TEMPO_CASA_MAIOR_CINCO));
            }
        }

        if(funcionario.getSenioridade().equals(Senioridade.ESPECIALISTA)){
            if(funcionario.getTempoDeCasaEmAnos() < 5) {
                return funcionario.getSalario().multiply(BigDecimal.valueOf(PORCENTAGEM_ESPECIALISTA_TEMPO_CASA_MENOR_CINCO));
            } else {
                return funcionario.getSalario().multiply(BigDecimal.valueOf(PORCENTAGEM_ESPECIALISTA_TEMPO_CASA_MAIOR_CINCO));
            }
        }
        return BigDecimal.valueOf(0);
    }
}
