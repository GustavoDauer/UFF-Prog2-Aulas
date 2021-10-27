/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class ListaNums {
    public double x;
    public ListaNums prox;
    public ListaNums(double d) {
        x = d;
        prox = null;
    }
    public ListaNums(double d, ListaNums p) {
        x = d;
        prox = p;
    }
}
