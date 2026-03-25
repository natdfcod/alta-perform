package ex4;
import java.util.Scanner;
import ex3.PilhaInt;

public class DecBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilhaInt pilha = new PilhaInt();
        int valorEmDecimal, resto;
        char opcao;
        do{
            pilha.init();
            System.out.println("********************");
            System.out.println("Decimal para Binario");
            System.out.print("Digite um valor inteiro --> ");
            valorEmDecimal = sc.nextInt();
            //faz a pilha de binarios
            while(valorEmDecimal != 0){
                resto = valorEmDecimal % 2;
                pilha.push(resto);
                valorEmDecimal /= 2;
            }
            //exibe e "limpa" a pilha
            pilha.esvaziar("");
            System.out.println();
            System.out.print("Quer tentar novamente? (S/N) --> ");
            opcao = sc.next().toUpperCase().charAt(0);
        }while(opcao != 'N');

    }
}
