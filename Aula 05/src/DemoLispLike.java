/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prog1c
 */

public class DemoLispLike {
    public static int car(Lista l) {
        return l.info;
    }
    public static Lista cdr(Lista l) {
        return l.proximo;
    }
    public static Lista cons(int x, Lista l) {
        return new Lista(x, l);
    }
    public static boolean pertence(int x, Lista l) {
        if(!vazia(l))
            if(x == car(l) || pertence(x, cdr(l)))
                return true;            
            else
                return false;                    
        else
            return false;        
    }
    public static boolean vazia(Lista l) {
        if(l == null)
            return true;
        else
            return false;
    }
    public static Lista uniao(Lista a, Lista b) {
        if(vazia(a))
            return b;
        else
            if(pertence(car(a), b))
                return uniao(cdr(a),b);
            else
                return cons(car(a),uniao(cdr(a),b));        
    }
    public static Lista intersecao(Lista a, Lista b) {
        if(vazia(a))
            return null;
        else
            if(pertence(car(a), b))
                return cons(car(a), intersecao(cdr(a), b));
            else
                return intersecao(cdr(a), b);
    }
    public static Lista impares(Lista a) {
        if(vazia(a))
            return null;
        else
            if(car(a) % 2 != 0)
                return cons(car(a), impares(cdr(a)));
            else
                return impares(cdr(a));
    }
    public static Lista insereOrdenadamente(int x, Lista a) {
        if(vazia(a))
            return cons(x, null);
        else 
            if(x < car(a))
                return cons(x, a);
            else
                return cons(car(a), insereOrdenadamente(x, cdr(a)));
    }
    public static Lista ordena(Lista a) {
        if(vazia(a))
            return null;
        else
            return insereOrdenadamente(car(a), ordena(cdr(a)));
    }
    public static void main(String args[]) {
        Lista a = cons(50, cons(26, cons(2, null)));
        System.out.println(a);
        System.out.println(ordena(a));
    }
}
