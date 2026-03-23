import java.util.Scanner;

public class ex2 {
    static Scanner sc = new Scanner(System.in);
    static final int N = 30;


    public static void main(String[] args) {
        int[] rm = new int[N];
        double[] nota1 = new double[N];
        double[] nota2 = new double[N];
        entradaDados(rm, nota1, nota2);
    }
    public static void entradaDados(int []rm, double []nota1, double []nota2) {
        //receber dados
        int n = 0;
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
    }
}
