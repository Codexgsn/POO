package empresa;

public class Funcionario {
    private String nome;
    private int matricula;
    protected double salario;
    private String cargo;
    private double bonus;

    public Funcionario(String nome, int matricula, double bonus) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = 1621.00;
        this.cargo = "Funcionário";
        this.bonus = bonus;
    }

    public double calcularBonus(){
        return salario += salario * bonus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public double getSalario(){
        return salario;
    }

    public void salario(double salario){
        this.salario = salario;
    }

    public String getCargo(){
        return cargo;
    }

    public void cargo(String cargo){
        this.cargo = cargo;
    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

}
