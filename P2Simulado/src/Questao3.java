/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Questao3 {
    public static Lista cons(int x) {
        return new Lista(x);
    }
    public static Lista cons(int x, Lista p) {
        return new Lista(x, p);
    }
    public static int car(Lista l) {
        return l.info;
    }
    public static Lista cdr(Lista l) {
        return l.prox;
    }
    public static Lista gera() {
        int n = (int) (5 * Math.random());
        Lista l = cons(n);
        if(n > 0)
            l.prox = gera();
        return l;
    }    
    public static void mostra(Lista l) {
        if(l != null)
            System.out.print(l);
        else
            System.out.println();
    }
    public static Lista pares(Lista l) {
        if(l != null) {
            if(car(l) % 2 == 0)
                return cons(car(l), pares(cdr(l)));        
            return pares(cdr(l));
        }
        return null;
    }
    public static Lista inverte(Lista l) {
        if(l != null)
            if(cdr(l) != null)
                return cons(car(inverte(cdr(l))), cdr(l));                    
        return null;
    }
    public static void main(String args[]) {
        Lista l = gera();
        mostra(l);
        mostra(pares(l));
        mostra(inverte(l));
    }
}