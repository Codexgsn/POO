import java.util.Scanner;
import cadastro.Pessoa;
import cadastro.Cliente;
import cadastro.Professor;
import cadastro.Aluno;
import empresa.Funcionario;
import empresa.Desenvolvedor;
import empresa.Gerente;
void main() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Escolha entre os packages: \ncadastro--> 1 \nempresa--> 2 \nopção: ");


    if(scan.hasNextInt()) {
        int opt = scan.nextInt();
        switch (opt) {

            case 1:
                Pessoa p1 = new Pessoa("gustavo", "123", "04-11-07");
                Cliente c1 = new Cliente("marlom", "456", "10-11-09", 510);
                Professor pf1 = new Professor("jedson", "331", "11-12-1603", "euSouInevitavel");
                Aluno a1 = new Aluno("heitor", "67", "20-03-1200", "garoto de programa");
                System.out.println("--- p1 ---");
                p1.apresentar();
                System.out.println(p1.getCpf());
                System.out.println(p1.getDataNascimento());

                System.out.println("--- c1 ---");
                c1.apresentar();
                System.out.println(c1.getCpf());
                System.out.println(c1.getDataNascimento());
                System.out.println(c1.getDinheiro());

                System.out.println("--- pf1 ---");
                pf1.apresentar();
                System.out.println(pf1.getCpf());
                System.out.println(pf1.getDataNascimento());
                System.out.println(pf1.getCarteiraTrabalho());

                System.out.println("--- a1 ---");
                a1.apresentar();
                System.out.println(a1.getCpf());
                System.out.println(a1.getDataNascimento());
                System.out.println(a1.getTipoDePobreza());
                break;

            case 2:
                Funcionario f1 = new Funcionario("Gustavo", 84551, 0.025);
                Desenvolvedor d1 = new Desenvolvedor("Pedro", 34578, "Pleno", 0.07);
                Gerente g1 = new Gerente("Heitor", 34584, "Médio", 0.1);

                System.out.println("--- F1 ---");
                System.out.println(f1.getNome());
                System.out.println(f1.getCargo());
                System.out.println(f1.getSalario());
                System.out.println(f1.calcularBonus());

                System.out.println("--- D1 ---");
                System.out.println(d1.getNome());
                System.out.println(d1.getCargo());
                System.out.println(d1.getSenioridade());
                System.out.println(d1.getSalario());
                System.out.println(d1.calcularBonus());

                System.out.println("--- G1 ---");
                System.out.println(g1.getNome());
                System.out.println(g1.getCargo());
                System.out.println(g1.getNivel());
                System.out.println(g1.getSalario());
                System.out.println(g1.calcularBonus());
                break;

            default:
                System.out.println("Opção inválida");
        }

    } else {
        System.out.println("Opção inválida, por favor tente novamente");
    }

}
