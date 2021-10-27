
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class LispAmpliada extends Lisp {
    public static boolean ehLista (Object x) {
        try {
            Lista teste = (Lista) x;
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static String mostra (Lista l) {
        if(l == null)
            return "";
        else
            if(!ehLista(car(l)))
                return car(l) + ", " + mostra(cdr(l));
            else
                return " (" + mostra ((Lista) car(l)) + ") " + mostra (cdr(l));
    }
    public static boolean pertence (Object x, Lista l) {
        if(l == null)
            return false;
        else
            if(!ehLista(car(l)))
                return (x == car(l)) || pertence(x, cdr(l));
            else
                return pertence(x, (Lista) car(l)) || pertence(x, cdr(l));
    }
    public static void main(String args[]) {
        Lista a = cons(new Multa("KZV-6882"), cons(new Multa("KZV-6882")));
        Lista b = cons(a, a);
        JOptionPane.showMessageDialog(null, a);
        JOptionPane.showMessageDialog(null, b);
        JOptionPane.showMessageDialog(null, mostra (a));
        JOptionPane.showMessageDialog(null, mostra (b));
        JOptionPane.showMessageDialog(null, pertence(25, a));
    }
}
