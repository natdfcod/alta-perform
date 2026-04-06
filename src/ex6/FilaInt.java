package ex6;

import javax.swing.plaf.PanelUI;

public class FilaInt {
    final int N = 3;
    int [] dados = new int[N];
    int ini, fim, cont;

    public void init(){
        ini = fim = cont = 0;
    }
    public boolean isEmpty(){
        return (cont == 0);
    }
    public boolean isFull(){
        return (cont == N);
    }
    public void enqueue(int elem){
        if(isFull()){
            System.out.println("Fila cheia!");
            return;
        }
        dados[fim] = elem;
        cont++;
        fim = (fim+1) % N;
    }
    public int dequeue(){
        int elem = dados[ini];
        cont--;
        ini = (ini+1) % N;
        System.out.println("elemento retirardo --> "+elem);
        return elem;
    }
    public void esvaziar(){
        while (!isEmpty()){
            dequeue();
        }
    }
    public int first(){
            return dados[ini];
    }
}
