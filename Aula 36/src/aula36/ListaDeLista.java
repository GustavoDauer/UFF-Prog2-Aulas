/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula36;

import java.awt.Color;

/**
 *
 * @author Dante
 */
public class ListaDeLista {
    ListaDeLista prox;
    Lista info;
    Color cor;
    public ListaDeLista(Lista l, Color c){
        cor = c;
        info = l;
        prox = null;
    }
    public ListaDeLista(Lista l, Color c, ListaDeLista ldl){
        cor = c;
        info = l;
        prox = ldl;
    }
    @Override
    public String toString(){
        if(this==null)
            return "";
        else
            if(prox == null)
                return cor+"\n"+"["+info+"] \n";
            else
                return cor+"\n"+"["+info+"] \n"+prox;
    }
}
