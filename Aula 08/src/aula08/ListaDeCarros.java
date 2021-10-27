/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula08;

/**
 *
 * @author 20931131
 */
public class ListaDeCarros {
    Carro info;
    ListaDeCarros proximo;
    public ListaDeCarros(Carro c, ListaDeCarros l) {
        info = c;
        proximo = l;
    }
    public ListaDeCarros(Carro c) {
        info = c;
        proximo = null;
    }
    @Override
    public String toString() {
        if(proximo == null)
            return info + "\n";
        return info + "->" + proximo;
    }
}
