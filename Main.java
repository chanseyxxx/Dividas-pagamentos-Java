//testar tudo e pegar input
import java.util.Scanner;
public class Main{
    Cliente cliente;
    void menu(){
        System.out.println("-----ESCOLHA UMA OPÇÃO-----");
        System.out.println("1-Cadastrar cliente");// quando for cliente novo
        System.out.println("2-Cadastrar venda");
        System.out.println("3-Ver divida");
        System.out.println("4-Sair");

        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                cadastrarCliente();
                break;
            case 2:
                //criar função cadastrar venda
                break;
            case 3:
                //criar função cadastrar cliente
                break;
            case 4:
                break;
            default:
                System.out.println("Escolha uma opção válida");
                break;
        }
    }

    void cadastrarCliente(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do cliente");
        String nome = scanner.nextLine();
        cliente.setNome(nome);
        System.out.println("Digite a divida do cliente(Caso ele não tenha coloque 0)");
        Float divida = scanner.nextFloat();
        cliente.setDivida(divida);
    }

    void cadastrarVenda(){
        
    }
    public static void main(String[] args){
        Main m = new Main();
        m.menu();
    }
}