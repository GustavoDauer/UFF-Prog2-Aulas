/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class OrdenacaoRapida extends Ordenacao {
    public static void quickSort(int[] v) {
        quickSort(v, 0, v.length-1);
    }
    public static void quickSort(int[] v, int inicio, int fim) {
        int i, j, aux;
        i = inicio;
        j = fim;
        int p = (i + j) / 2;
        while(i < j) {
            while(v[i] < v[p])
                i++;            
            while(v[j] > v[p])
                j--;            
            if(i <= j) {
                aux = v[i];
                v[i] = v[j];
                v[j] = aux;
                i++;
                j--;                
            }
        }
        if(j > inicio)
            quickSort(v, inicio, j);
        if(i < fim)
            quickSort(v, i, fim);
    }
    public static void main(String args[]) {
        int[] v = new int[5];
        gera(v);
        mostra(v);
        quickSort(v);
        mostra(v);
    }
}
