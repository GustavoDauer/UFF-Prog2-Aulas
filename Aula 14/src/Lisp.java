/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Lisp {
    public static Object car (Lista l) {
        return l.info;
    }
    public static Lista cdr (Lista l) {
        return l.prox;
    }
    public static Lista cons (Object x, Lista l) {
        return new Lista(x, l);
    }
    public static Lista cons (Object x) {
        return new Lista(x, null);
    }
}
