package cadastro;

    public class Aluno extends Pessoa {
        private String tipoDePobreza;

    public Aluno(String nome, String cpf, String dataNascimento, String tipoDePobreza) {
        super(nome, cpf, dataNascimento);
        this.tipoDePobreza = tipoDePobreza;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá eu sou o aluno " + getNome());
    }

    public String getTipoDePobreza() {
        return tipoDePobreza;
    }

    public void setTipoDePobreza(String tipoDePobreza) {
        this.tipoDePobreza = tipoDePobreza;
    }

}
