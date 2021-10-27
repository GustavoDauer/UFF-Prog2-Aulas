/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Exercicio_Ordenacao {
    public static void quickSort(int v[], int inicio, int fim) {
        int i, j, p, aux;
        i = inicio;
        j = fim;      
        p = v[(inicio + fim) / 2];
        while (i < j) {
           while (v[i] < p)
              i = i + 1;
           while (v[j] > p)
              j = j - 1;
           if(i <= j) {
               aux  = v[i];
               v[i] = v[j];
               v[j] = aux;
               i = i + 1;
               j = j - 1;
           }
        }
        if (j > inicio)   
            quickSort(v, inicio, j);   
        if (i < fim)   
            quickSort(v, i, fim);
    }

    public static void mostra(int[] v) {
        for(int i=0; i<v.length; i++)
            System.out.print(v[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] v = { 5, 2, 7, 70, 25, 700, 7000, 7257, 2570 };
        mostra(v);
        quickSort(v, 0, v.length - 1);
        mostra(v);
    }
}
