package ex6;

public class Main {
    public static void main(String[] args) {
        FilaInt fila = new FilaInt();
        fila.init();
        fila.enqueue(23);
        fila.enqueue(66);
        fila.enqueue(69);
        fila.dequeue();
        if (fila.isEmpty()){
            System.out.println("inicio da fila é --> "+ fila.first());
        }
        fila.esvaziar();
    }
}
