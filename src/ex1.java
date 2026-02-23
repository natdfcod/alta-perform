import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 30;
        int n = 0;
        int[] rm = new int[N];
        double[] nota1 = new double[N];
        double[] nota2 = new double[N];

        //receber dados
        System.out.println("Digite seu RM: ");
        int rmLido = sc.nextInt();
        while (rmLido >= 0 && n < N) {
            rm[n] = rmLido;
            System.out.println("Digite sua nota1: ");
            nota1[n] = sc.nextDouble();
            System.out.println("Digite sua nota2: ");
            nota2[n] = sc.nextDouble();
            n++;
            System.out.println("Digite seu RM: ");
            rmLido = sc.nextInt();
        }
        double[] media = new double[n];
        for(int i = 0; i < n; i++){
            //media
            media[i] = (nota1[i]+nota2[i])/2;
            //gerear aprovado e reprovado
            if (media[i] >= 6) {
            //apresentar dados
            System.out.printf("RM: %d | Média: %.1f | Status: Aprovado\n", rm[i], media[i]);
            }
        }
    }
}

