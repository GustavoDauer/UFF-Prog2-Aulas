/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Questa1P1 extends Lisp {
    public static void mostra(Lista l) {
        System.out.println(l);
    }
    public static Lista removeRepeticoes(int x, Lista l) {
        return l;
    }
    public static Lista conjunto(Lista lis) {
        return lis;
    }
    public static Lista valoresIguaisNasPosicoes(Lista alfa, Lista beta) {
        return alfa;
    }
    public static void main(String args[]) {
        Lista l = cons(1);
        l.prox = cons(2);
        l.prox.prox = cons(3);
        l.prox.prox.prox = cons(3);
        mostra(l);
        conjunto(l);
        mostra(l);
    }
}
