package cadastro;

public class Cliente extends Pessoa {
    private int dinheiro;

    public Cliente(String nome, String cpf, String dataNascimento, int dinheiro) {
        super(nome, cpf, dataNascimento);
        this.dinheiro = dinheiro;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro){
        this.dinheiro = dinheiro;
    }

    @Override
    public void apresentar() {
        System.out.println("Eu sou o Cliente " + getNome());
    }

}
