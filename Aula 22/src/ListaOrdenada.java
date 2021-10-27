/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
abstract class ListaOrdenada {
    abstract boolean menor(Object x, Object y);
    private No inicio, cursor;
    private int total;
    public ListaOrdenada() {
        inicio = null;
        total = 0;
    }    
    public boolean insere(Object novo) {
        try {
            if(total == 0) {
                inicio = new No(novo);
                cursor = inicio;
            }
            else {
                No temp = new No(novo);
                if(menor(novo, inicio.info)) {
                    temp.prox = inicio;
                    inicio = temp;
                }
                else {
                    No antes, depois;
                    antes = inicio;
                    depois = antes.prox;
                    while((depois != null) && menor(depois.info, novo)) {
                        antes = depois;
                        depois = depois.prox;
                    }
                    temp.prox = depois;
                    antes.prox = temp;
                }
            }
        } catch(Exception e) { }
        return true;
    }
    public boolean remove(Object quem) {
        return true;
    }
    public Object consultar(Object x) {
        if(cursor == null)
            return null;
        else
            return cursor.info;
    }
    public int tamanho() {
        return total;
    }
    public boolean vazia() {
        return (total == 0);
    }
    public void incializaCursor() {
        cursor = inicio;
    }
    public boolean avancaCursor() {
        if(cursor == null)
                return false;
        else {
            cursor = cursor.prox;
            return true;
        }
    }
    public boolean recuaCursor() {
        if(cursor == inicio)
            return false;
        else {
            No aux = inicio;
            while(aux.prox != cursor)
                aux = aux.prox;
            cursor = aux;
            return true;
        }
    }
}
