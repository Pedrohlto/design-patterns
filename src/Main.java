import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        //Funcionario funcionario = new Funcionario("Fulano", LocalDate.of(2020, Month.JANUARY, 3), BigDecimal.valueOf(1500), "(11)99996-9996", LocalDate.of(1990, Month.JULY, 15), "40412366598", "15423659" , Senioridade.PLENO);

        var funcionario = Funcionario.builder().
                nome("Fulano")
                .dataContratacao(LocalDate.of(2020, Month.JANUARY, 3))
                .salario(BigDecimal.valueOf(1500))
                .telefone("(11)99996-9996")
                .dataNascimento(LocalDate.of(1990, Month.JULY, 15))
                .cpf("40412366598")
                .rg("15423659")
                .senioridade(Senioridade.PLENO)
                .build();
        RH rh = new RH();

        var valorAumento = rh.calcularAumentoFuncionario(funcionario);
        funcionario.aumentarSalario(valorAumento);
        System.out.println(valorAumento);

        Comunicacao comunicacao = new Comunicacao();
        comunicacao.enviarSMS(funcionario);
    }
}