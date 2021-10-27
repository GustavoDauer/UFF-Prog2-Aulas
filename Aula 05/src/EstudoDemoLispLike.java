
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class EstudoDemoLispLike {
    public static int car(EstudoLista l) {
        return l.info;
    }
    public static EstudoLista cdr(EstudoLista l) {
        return l.proximo;
    }
    public static EstudoLista cons(int x, EstudoLista b) {
        return new EstudoLista(x, b);
    }
    public static EstudoLista cons(int x) {
        return new EstudoLista(x, null);
    }
    public static boolean pertence(int x, EstudoLista l) {
        if(l == null)
            return false;
        else
            if(l.info == x || pertence(x, l.proximo))
                return true;                
        return false;
    }
    public static void main(String args[]) {
        EstudoLista l = cons(1, cons(2, cons(3, cons(4, cons(5)))));
        JOptionPane.showMessageDialog(null, pertence(2, l));
    }
}
