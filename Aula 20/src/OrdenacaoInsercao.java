/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class OrdenacaoInsercao extends Ordenacao {
    public static void insertionSort(int[] v) {
        for(int i=1; i<v.length; i++)
            inserirOrdenado(i, v);
    }    
    public static void inserirOrdenado(int p, int[] v) {
        int k = 0;
        while((k < p) && (v[k] <= v[p]))
            k++;
        int aux = v[p];
        for(int i=p; i>k; i--)
            v[i] = v[i-1];
        v[k] = aux;
    }
    public static void main(String args[]) {
        int[] v = new int[25];
        gera(v);
        mostra(v);
        insertionSort(v);
        mostra(v);
    }
}
