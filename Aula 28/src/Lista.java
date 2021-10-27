/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Lista extends Lisp {
    int info;
    Lista prox;
    public Lista(int x) {
        info = x;
        prox = null;
    }
    @Override
    public String toString() {
        if(info > 0)
            return info + " -> " + prox;
        return info + " -> fim";
    }
}
