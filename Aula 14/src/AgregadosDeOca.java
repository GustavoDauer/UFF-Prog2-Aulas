/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class AgregadosDeOca {
    Oca[] itens;
    int usados;
    public AgregadosDeOca(int t) {
        itens = new Oca[t];
        usados = 0;
    }
    public boolean insere(Oca x) {
        if(usados == itens.length)
            return false;
        else {
            itens[usados] = x;
            usados++;
            return true;
        }
    }
    @Override
    public String toString() {
        String r = "";
        for(int i=0; i<itens.length; i++)
            r += itens[i];
        return r;
    }
}
