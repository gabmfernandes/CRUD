public class Funcionario {
    private String nome;
    private String cargo;
    private String expediente;
    private int matricula;
    private int idade;

    public String getNome() {

        return nome;
    }
    public void setNome(String nome) {

        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {

        this.cargo = cargo;
    }
    public String getExpediente() {

        return expediente;
    }
    public void setExpediente(String expediente) {

        this.expediente = expediente;
    }
    public int getMatricula() {

        return matricula;
    }
    public void setMatricula(int matricula) {

        this.matricula = matricula;
    }
    public int getIdade() {

        return idade;
    }
    public void setIdade(int idade) {

        this.idade = idade;
    }
    public Funcionario(String nome, String cargo, String expediente, int matricula, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.expediente = expediente;
        this.matricula = matricula;
        this.idade = idade;
    }
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", expediente=" + expediente + ", matricula="
                + matricula + ", idade=" + idade + "]";
    }
}
