package ex7;
import ex6.FilaInt;

import java.util.Scanner;

public class gerenciadorTarefeas {
    static FilaInt fila = new FilaInt();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        fila.init();
        int opcao;
        do {
            System.out.print("""
                    [1] - Insere o processo na fila
                    [2] - Executa precesso
                    [3] - Shutdown
                    Digite sua resposta -->""");
            opcao = sc.nextInt();
            switch (opcao){
                case 1 -> inserir();
                case 2 -> retira();
                case 3 -> encerrar();
                default -> System.out.println("Opção invalida!!");
            }
        } while (opcao != 3);
    }

    private static void encerrar() {
        if (!fila.isEmpty()){
            System.out.println("Encerrando...");
        } else {
            System.out.println("Fila não esta vazia!");
        }
    }

    private static void retira() {
        if (!fila.isEmpty()){
            fila.dequeue();
        } else {
            System.out.println("Sem processos a executar");
        }
    }

    private static void inserir() {
        if (!fila.isFull()){
            System.out.print("Digite o byd do processo ->");
            fila.enqueue(sc.nextInt());
        }
    }
}
