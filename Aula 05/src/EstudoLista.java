/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class EstudoLista {
    int info;
    EstudoLista proximo;
    public EstudoLista(int x) {
        info = x;
        proximo = null;
    }
    public EstudoLista(int x, EstudoLista l) {
        info = x;
        proximo = l;
    }
    @Override
    public String toString() {
        if(proximo == null)
            return info + " -> fim";
        else
            return info + " -> " + proximo;
    }
}
