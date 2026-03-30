package ex3;

public class PilhaInt {
    final int N=10;
    int[] dados = new int[N];
    int topo;

    public void init(){
        topo = 0;
    }
    public boolean isEmpty(){
        return (topo == 0);
    }
    public boolean isFull(){
        return topo == N;
    }
    public void push(int elem){
        if (isFull()){
            System.out.println("Stack overflow");
            return;
        }
        dados[topo++] = elem;
    }
    public int top(){
        return dados[topo-1];
    }
    public int pop(){
        topo--;
        return dados[topo];
    }
    public void esvaziar(String between){
        while (!isEmpty()){
            System.out.printf("%s"+ pop(), between);
        }
    }
}