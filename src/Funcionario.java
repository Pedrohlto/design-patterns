import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Funcionario {

    private String nome;
    private LocalDate dataContratacao;
    private BigDecimal salario;
    private String telefone;
    private LocalDate dataNascimento;
    private String cpf;
    private String rg;
    private Senioridade senioridade;

    public Funcionario(String nome, LocalDate dataContratacao, BigDecimal salario, String telefone, LocalDate dataNascimento, String cpf, String rg, Senioridade senioridade) {
        this.nome = nome;
        this.dataContratacao = dataContratacao;
        this.salario = salario;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.senioridade = senioridade;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public Integer getTempoDeCasaEmAnos() {
        return Period.between(this.dataContratacao, LocalDate.now()).getYears();
    }

    public String getTelefone(){
        return this.telefone;
    }

    public Senioridade getSenioridade(){
        return this.senioridade;
    }

    public void aumentarSalario(BigDecimal valorAumento) {
        this.salario = this.salario.add(valorAumento);
    }

}
