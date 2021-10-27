/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Lista {
    int info;
    Lista prox;
    public Lista(int x) {
        info = x;
        prox = null;
    }
    public Lista(int x, Lista p) {
        info = x;
        prox = p;
    }
    @Override
    public String toString() {
        if(prox != null)
            return info + " " + prox;
        return info + "\n";
    }
}
