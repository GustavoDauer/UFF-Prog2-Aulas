/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Lista {
    Object info;
    Lista prox;
    public Lista (Object x) {
        info = x;
        prox = null;
    }
    public Lista (Object x, Lista l) {
        info = x;
        prox = l;
    }
    @Override
    public String toString() {
        if(prox == null)
            return info + "\n";
        else
            return info + "\n" + prox + "\n";
    }
}
