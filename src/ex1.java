import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 30;
        int [] rm = new int[N];
        double [] nota1 = new double[N];
        double [] nota2 = new double[N];
        double [] media = new double[N];
        String [] status = new String[N];

        //receber dados
        for(int i=0;i<N;i++){
        System.out.println("Digite seu RM: ");
        rm[i] = sc.nextInt();
        //verificar rm
        if(rm[i]<0){
            break;
        }
        System.out.println("Digite sua nota1: ");
        nota1[i] = sc.nextDouble();
        System.out.println("Digite sua nota2: ");
        nota2[i] = sc.nextDouble();
        //media
        media[i] = (nota1[i] + nota2[i])/2;
        //gerear aprovado e reprovado
        if (media[i] >= 6){
            status[i] = "Aprovado";
        } else {
            status[i] = "Reprovado";
        }
        }
        //apresentar dados
        for(int i=0;i<N;i++){
            if(rm[i] >= 0){
            System.out.printf("RM: %d | Média: %.1f | Status: %s\n", rm[i], media[i], status[i]);
            } else {
                break;
            }
        }
    }
}
