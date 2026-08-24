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
                    Escolha uma opção -> """);
            opcao = sc.nextInt();

            switch (opcao){
                case 0:
                    System.out.println("Saindo...");
                case 1:
                    System.out.print("Digite o valor a ser inserido -> ");
                    int dado = sc.nextInt();
                    arvore.root = arvore.inserir(arvore.root, dado);
                    break;
                case 2:
                    System.out.println("Aprensetando dados:");
                    arvore.mostrarEmOrdem(arvore.root);
                    System.out.println();
                    break;

            }
        }while (opcao != 0);

    }

}
