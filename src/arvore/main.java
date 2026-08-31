package arvore;

import java.util.Scanner;

public class main{
    static void main() {
        Scanner sc = new Scanner(System.in);
        Tree arvore = new Tree();
        int opcao;
        do{
            System.out.print("""
                    [0] - Sair
                    [1] - Inserir
                    [2] - Apresentar
                    [3] - Quantidade de nós
                    Escolha uma opção -> """);
            opcao = sc.nextInt();

            switch (opcao){
                case 0:
                    System.out.println("Saindo...");
                case 1:
                    System.out.print("\nDigite o valor a ser inserido -> ");
                    int dado = sc.nextInt();
                    arvore.root = arvore.inserir(arvore.root, dado);
                    break;
                case 2:
                    System.out.println("\nAprensetando dados:\n");
                    arvore.mostrarEmOrdem(arvore.root);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("\nQuantidade de nós = "+arvore.contaNos(arvore.root, 0));

            }
        }while (opcao != 0);

    }

}
