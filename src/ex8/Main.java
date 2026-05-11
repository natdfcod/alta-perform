package ex8;

public class Main {
    public static void main(String[] args) {
        FilaIntNo fila = new FilaIntNo();
        fila.init();
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);

        while (!fila.isEmpty()){
            System.out.println(fila.dequeue());
        }

    }
}
