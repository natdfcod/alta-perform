package ex5;

import ex3.PilhaInt;

import java.util.Arrays;
import java.util.Scanner;

public class palindromo {
    static PilhaInt pilha = new PilhaInt();
    static int[] vetor = new int[10];
    static int cont;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        char op;
        do {
            cont = 0;
            System.out.print("Digite um numero e dê enter para ver se é um polindromo no final: ");
            number = sc.nextInt();

            while (number >= 0){
                vetor[cont] = number;
                cont++;
                pilha.push(number);

                System.out.print("Digite o proximo numero e dê enter: ");
                number = sc.nextInt();
            }
            if (isPalindromo()){
                System.out.println("Essa sequencia de números é um palindromo!!");
            } else {
                System.out.println("Essa sequencia de números não é um palindromo");
            }
            System.out.print("Quer tentar novamente? (S/N) --> ");
            op = sc.next().toUpperCase().charAt(0);
        } while (op != 'N');


    }
    private static boolean isPalindromo(){
        for (int i = 0; i < cont; i++) {
            if (vetor[i] != pilha.pop() ){
                return false;
            }
        }
        return true;
    }

}
