/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Lisp {
    public static Lista cons(int x) {
        return new Lista(x);
    }
    public static int car(Lista l) {
        return l.info;
    }
    public static Lista cdr(Lista l) {
        return l.prox;
    }
}
