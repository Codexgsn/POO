package empresa;

public class Vendedor extends Funcionario {
    private int vendas;

    public Vendedor(String nome, int matricula,double bonus, int vendas) {
        super(nome, matricula, bonus);
        this.salario += 1238.32;
    }

    @Override
    public String getCargo() {
        return "Vendedor";
    }

    public double calcularBonus(){
        return salario += getBonus()*50;
    }

}
