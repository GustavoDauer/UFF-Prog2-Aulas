/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Pilha {
    private No topo;
    private int total;
    public Pilha() {
        topo = null;
        total = 0;
    }
    public boolean empilha(Object novo) {
        try {
            No temp = new No(novo);
            temp.prox = topo;
            topo = temp;
            total++;
            return true;
        } catch(Exception e) {
            return false;
        }
    }
    public boolean desempilha() {
        if(total == 0)
            return false;
        else {
            topo = topo.prox;
            total--;
            return true;
        }
    }
    public Object topo() {
        if(total == 0)
            return null;
        else
            return topo.info;
    }
    public int tamanho() {
        return total;
    }
    public boolean vazia() {
        return (total == 0);
    }
    public boolean cheia() {
        return false;
    }    
}
