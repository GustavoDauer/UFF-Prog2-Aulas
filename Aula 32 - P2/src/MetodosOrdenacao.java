/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class MetodosOrdenacao {

    public static void bubbleSort(int[] v) {
        boolean troca = true;
        while(troca) {
            troca = false;
            for(int i=0; i<v.length-1; i++)
                if(v[i] > v[i+1]) {
                    int aux = v[i];
                    v[i] = v[i+1];
                    v[i+1] = aux;
                    troca = true;
                }                   
        }
    }

    public static void main(String[] args) {
        int[] v = { 5, 2, 7, 25 };
        bubbleSort(v);
        for(int i=0; i<v.length; i++)
            System.out.println(v[i]);
    }
}
