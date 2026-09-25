package empresa;

public class Desenvolvedor extends Funcionario {
    private String senioridade;


    public Desenvolvedor(String nome, int matricula, String senioridade, double bonus){
        super(nome, matricula, bonus);
        this.senioridade = senioridade;
        this.salario += 7528.39;


    }
    @Override
    public String getCargo(){
        return "Desenvolvedor";
    }

    @Override
    public double calcularBonus(){
        return salario += salario * getBonus();
    }

    public String getSenioridade(){
        return senioridade;
    }

    public void setSenioridade(String senioridade){
        this.senioridade = senioridade;
    }

}
