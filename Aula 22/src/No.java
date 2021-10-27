/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class No {
    Object info;
    No prox;
    public No(Object x) {
        info = x;
        prox = null;
    }
    @Override
    public String toString() {
        return info + " " + prox;
    }
}
