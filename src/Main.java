import cadastro.Pessoa;
import cadastro.Cliente;
void main() {
    Pessoa p1 = new Pessoa("gustavo", "123", "04-11-07");
    Cliente p2 = new Cliente("marlom", "456", "10-11-09", 510);
    System.out.println("--- p1 ---");
    p1.apresentar();
    System.out.println(p1.getCpf());
    System.out.println(p1.getDataNascimento());


    System.out.println("--- p2 ---");
    p2.apresentar();
    System.out.println(p2.getCpf());
    System.out.println(p2.getDataNascimento());
    System.out.println(p2.getDinheiro());

}
