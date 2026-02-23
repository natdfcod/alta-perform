import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] rm = new int[30];
        double [] nota1 = new double[30];
        double [] nota2 = new double[30];
        double [] media = new double[30];
        String [] status = new String[30];

        //receber dados
        for(int i=0;i<30;i++){
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
        for(int i=0;i<30;i++){
            if(rm[i] >= 0){
            System.out.printf("RM: %d | Média: %.1f | Status: %s\n", rm[i], media[i], status[i]);
            } else {
                break;
            }
        }
    }
}
