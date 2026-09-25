package empresa;

public class Gerente extends Funcionario {
    private String nivel;

    public Gerente(String nome, int matricula, String nivel, double bonus) {
        super(nome, matricula, bonus);
        this.salario += 5452.98;
        this.nivel = nivel;
    }

    @Override
    public String getCargo(){
        return "Gerente";
    }

    @Override
    public double calcularBonus() {
        return salario += salario * getBonus();
    }

    public String getNivel(){
        return nivel;
    }

    public void setNivel(String nivel){
        this.nivel = nivel;
    }
}
