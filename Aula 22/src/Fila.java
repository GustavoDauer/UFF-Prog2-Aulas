/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Fila {
    private No primeiro, ultimo;
    private int total;
    public Fila() {
        primeiro = ultimo = null;
        total = 0;
    }
    public boolean enfila(Object novo) {
        try {
            No temp = new No(novo);
            if(total == 0) {
                primeiro = ultimo = temp;                
            }
            else {
                ultimo.prox = temp;
                ultimo = temp;                
            }
            total++;
            return true;
        } catch(Exception e) {
            return false;
        }
    }
    public boolean desenfila() {
        if(total == 0)
            return false;
        else {
            if(primeiro == ultimo)
                primeiro = ultimo = null;
            else
                primeiro = primeiro.prox;
            total--;
            return true;
        }
    }
    public Object naFrente() {
        if(total == 0)
            return null;
        else
            return primeiro.info;
    }
    public Object noFinal() {
        if(total == 0)
            return null;
        else
            return ultimo.info;
    }
    public boolean vazia() {
        return (total == 0);
    }
}
