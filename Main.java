import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = lerOpcaoDoCardapio();
        exibirMensagemEscolha(opcao);
    }

    // Método para exibir o cardápio e ler a opção do usuário
    private static int lerOpcaoDoCardapio() {
        Scanner leitorOpcao = new Scanner(System.in);
        int opcao = -1;

        // Apresenta o cardápio
        System.out.println("Escolha uma opção do cardápio:");
        System.out.println("1 Pastel de carne");
        System.out.println("2 Coxinha de frango");
        System.out.println("3 Kibe com queijo");

        // Tenta ler a opção, garantindo que seja um número válido
        while (true) {
            System.out.print("Escolha uma opção: ");
            if (leitorOpcao.hasNextInt()) {
                opcao = leitorOpcao.nextInt();
                if (opcao >= 1 && opcao <= 3) {
                    break; // Opção válida, sai do loop
                } else {
                    System.out.println("Opção inválida! Por favor, escolha um número entre 1 e 3.");
                }
            } else {
                System.out.println("Entrada inválida! Digite um número.");
                leitorOpcao.next(); // Limpa a entrada inválida
            }
        }

        leitorOpcao.close(); // Fecha o scanner após o uso
        return opcao;
    }

    // Método para exibir a mensagem de escolha com base na opção
    private static void exibirMensagemEscolha(int opcao) {
        switch (opcao) {
            case 1:
                System.out.println("Pastel de carne escolhido.");
                break;
            case 2:
                System.out.println("Coxinha de frango escolhida.");
                break;
            case 3:
                System.out.println("Kibe com queijo escolhido.");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
