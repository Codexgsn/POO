package empresa;

public class Desenvolvedor extends Funcionario {
    private String senioridade;

    public Desenvolvedor(String nome, int matricula, String senioridade){
        super(nome, matricula);
        this.senioridade = senioridade;
        this.salario += 7528.39;

    }
    @Override
    public String getCargo(){
        return "Desenvolvedor";
    }

    public String getSenioridade(){
        return senioridade;
    }

    public void setSenioridade(String senioridade){
        this.senioridade = senioridade;
    }

}
