package principal;

import java.util.Scanner;

import controle.Controle;

public class Loja {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Controle controle = new Controle();
        char resp;

        do {
            System.out.println("===== Digite a opção desejada ======");
            System.out.println("[1] - Adicionar item\n[2] - Realizar pedido\n"
                    + "[3] - Adicionar observadores\n[4] - Alterar status do pedido\n"
                    + "[5] - Exibir pedido\n[6] - Sair do sistema");
            System.out.println("<<");
            int opc = teclado.nextInt();
            if (opc >= 1 && opc < 6) {
                controle.operacoes(opc);
            } else if (opc == 6) {
                System.out.println("Saindo do sistema");
                teclado.close();
                System.exit(0);
            } else {
                System.out.println("Opção inválida!");
            }

            teclado.nextLine();
            System.out.println("Deseja continuar (s/n)?");
            resp = teclado.nextLine().charAt(0);
        } while (resp == 's');
    }
}
