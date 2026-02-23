import java.util.Scanner;

public class ex2 {
    static Scanner sc = new Scanner(System.in);
    static int [] rm = new int[30];
    static double [] nota1 = new double[30];
    static double [] nota2 = new double[30];
    static double [] media = new double[30];
    static String [] status = new String[30];
    public static void main(String[] args) {
        for(int j=0;j<30;j++){}
            entradaDeDados();
            calcularMedia();
            gerarAprovados();
        //apresentar dados
        for(int i=0;i<30;i++){
            if(rm[i] >= 0){
                System.out.printf("RM: %d | Média: %.1f | Status: %s\n", rm[i], media[i], status[i]);
            } else {
                break;
            }
        }
    }
    public static void entradaDeDados(){
        for(int i=0;i<30;i++) {
            System.out.println("Digite seu RM: ");
            rm[i] = sc.nextInt();
            //verificar rm
            if (rm[i] < 0) {
                break;
            }
            System.out.println("Digite sua nota1: ");
            nota1[i] = sc.nextDouble();
            System.out.println("Digite sua nota2: ");
            nota2[i] = sc.nextDouble();
        }
    }
    public static void calcularMedia(){
        //media
        for(int i=0;i<30;i++){
            media[i] = (nota1[i] + nota2[i])/2;
        }
    }
    public static void gerarAprovados(){
        //gerear aprovado e reprovado
        for(int i=0;i<30;i++){
            if (media[i] >= 6){
                status[i] = "Aprovado";
            } else {
                status[i] = "Reprovado";
            }
        }
    }


}
