package arvore.AVL;

import java.util.Scanner;

public class MenuAVL {
    static void main() {
        Scanner sc = new Scanner(System.in);
        AvlInt avl = new AvlInt();
        int opcao;
        do {
            System.out.println("""
                    [0] - Sair do programa
                    [1] - Insere 1 valor na AVL;
                    [2] - Apresenta pós ordem os nós da AVL apresentando também o FB do nó;
                    Digite uma opção:""");
            opcao = sc.nextInt();

            switch (opcao){
                case 0 -> System.out.println("Encerrando...");

                case 1 -> {
                    System.out.print("Digite o valor que deseja inserir -> ");
                    int valor = sc.nextInt();
                    avl.root = avl.inserirH(avl.root, valor);
                }

                case 2 -> {
                    System.out.println("Apresentando AVL");
                    avl.mostraFB(avl.root);
                }

                default -> System.out.println("Digite uma opção valida!");
            }
        } while(opcao != 0);
    }
}
