package empresa;

public class Desenvolvedor extends Funcionario {
    private double salarioAdicional = 7528.39;

    public Desenvolvedor(String nome, int matricula, double salario, String cargo, double salarioadicional){
        super(nome, matricula, salario, cargo);
        this.salarioAdicional = salarioadicional;
        cargo = "funcionario";
    }

}
