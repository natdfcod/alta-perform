package arvore;

public class Tree {
    public NO root = null;

    private class NO {
        int dado;
        NO dir;
        NO esq;
    }
    public NO inserir(NO p, int dado){
        //insere elemento em uam ABB
        if (p == null){
            p = new NO();
            p.dado = dado;
            p.esq = null;
            p.dir = null;
        } else {
            if (dado < p.dado) {
                p.esq = inserir(p.esq, dado);
            } else {
                p.dir = inserir(p.dir, dado);
            }
        }
        return p;
    }

    public void mostrarEmOrdem(NO p){
        if (p != null){
            mostrarEmOrdem(p.esq);
            System.out.print("\t" + p.dado);
            mostrarEmOrdem(p.dir);
        }
    }

    public int contaNos(NO p, int cont){
        if (p != null){
            cont++;
            cont = contaNos(p.esq, cont);
            cont = contaNos(p.dir, cont);
        }
        return cont;
    }

}
