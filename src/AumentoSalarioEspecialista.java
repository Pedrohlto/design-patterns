import java.math.BigDecimal;

public class AumentoSalarioEspecialista implements CalcularAumentoStrategy{


    private static final Double PORCENTAGEM_ESPECIALISTA_TEMPO_CASA_MENOR_CINCO = 0.20;
    private static final Double PORCENTAGEM_ESPECIALISTA_TEMPO_CASA_MAIOR_CINCO = 0.25;
    @Override
    public BigDecimal calcular(Funcionario funcionario) {
        if(funcionario.getTempoDeCasaEmAnos() < 5) {
            return funcionario.getSalario().multiply(BigDecimal.valueOf(PORCENTAGEM_ESPECIALISTA_TEMPO_CASA_MENOR_CINCO));
        } else {
            return funcionario.getSalario().multiply(BigDecimal.valueOf(PORCENTAGEM_ESPECIALISTA_TEMPO_CASA_MAIOR_CINCO));
        }
    }
}
