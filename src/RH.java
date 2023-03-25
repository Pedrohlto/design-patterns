import java.math.BigDecimal;

public class RH {

    public BigDecimal calcularAumentoFuncionario(Funcionario funcionario){

        RegraCalculoAumentoFactory factory = new RegraCalculoAumentoFactory();
        var classeAumento = factory.getRegra(funcionario);
        return classeAumento.calcular(funcionario);

    }
}
