/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class OrdenacaoBolha extends Ordenacao {
    public static void bubbleSort(int[] v) {
        boolean troca = true;
        int aux;
        while(troca) {
            troca = false;
            for(int i=0; i<v.length - 1; i++)
                if(v[i] > v[i+1]) {
                    aux = v[i+1];
                    v[i+1] = v[i];
                    v[i] = aux;
                    troca = true;
                }
        }
    }
    public static void main(String args[]) {
        int[] v = new int[5];
        gera(v);
        mostra(v);
        bubbleSort(v);
        mostra(v);
    }
}
