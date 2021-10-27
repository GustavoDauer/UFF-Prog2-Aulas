/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class VetorOrdenado {
    Incompleta itens[];
    int usados;
    public VetorOrdenado(int tam) {
        itens = new Incompleta [tam];
        usados = 0;
    }
    @Override
    public String toString() {
        String resp = "";
        for(int i=0; i<usados; i++)
            resp += itens[i] + "\n";
        return resp;
    }
    public boolean insere(Incompleta x) {
        if(usados == itens.length)
            return false;
        else {
            int i = 0;
            while((i<usados) && itens[i].menor(x))
                i++;
            for(int k=usados; k>i; k--)
                itens[k] = itens[k-1];
            itens[i] = x;
            usados++;
            return true;
        }
    }
}
