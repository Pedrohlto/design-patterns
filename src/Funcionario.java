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

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{

        private String nome;
        private LocalDate dataContratacao;
        private BigDecimal salario;
        private String telefone;
        private LocalDate dataNascimento;
        private String cpf;
        private String rg;
        private Senioridade senioridade;

        public Builder nome(String nome){
            this.nome = nome;
            return this;
        }

        public Builder dataContratacao(LocalDate dataContratacao){
            this.dataContratacao = dataContratacao;
            return this;
        }

        public Builder salario(BigDecimal salario){
            this.salario = salario;
            return this;
        }

        public Builder telefone(String telefone){
            this.telefone = telefone;
            return this;
        }

        public Builder dataNascimento(LocalDate dataNascimento){
            this.dataNascimento = dataNascimento;
            return this;
        }

        public Builder cpf(String cpf){
            this.cpf = cpf;
            return this;
        }

        public Builder rg(String rg){
            this.rg = rg;
            return this;
        }

        public Builder senioridade(Senioridade senioridade){
            this.senioridade = senioridade;
            return this;
        }

        public Funcionario build(){
            return new Funcionario(this.nome, this.dataContratacao, this.salario, this.telefone, this.dataNascimento, this.cpf, this.rg, this.senioridade);
        }


    }

}
