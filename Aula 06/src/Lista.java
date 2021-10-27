/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prog1c
 */
public class Lista {
    int info;
    Lista proximo;
    public Lista(int x) {
        info = x;
        proximo = null;
    }
    public Lista(int x, Lista continua) {
        info = x;
        proximo = continua;
    }
    @Override
    public String toString() {
        if(proximo == null)
            return info + " -> fim \n";
        else
            return info + "->" + proximo;
    }
}
