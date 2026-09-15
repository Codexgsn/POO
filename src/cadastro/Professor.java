package cadastro;

    public class Professor extends Pessoa {
        private String carteiraTrabalho;

    public Professor (String nome, String cpf, String dataNascimento,String carteiraTrabalho) {
        super(nome, cpf, dataNascimento);
        this.carteiraTrabalho = carteiraTrabalho;
    }

    @Override
    public void apresentar() {
        System.out.println("Eu sou o Professor " + getNome());
    }

    public String getCarteiraTrabalho(){
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

}
