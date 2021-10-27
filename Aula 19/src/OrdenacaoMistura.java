
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class OrdenacaoMistura extends Ordenacao {
    public static void mistura(int[] v, int i, int m, int f) {
        int[] aux = new int[f - i + 1];
        int prim = i;
        int seg = m + 1;
        int atual = 0;
        while(prim <= m && seg <= f) {
            if(v[prim] < v[seg]) {
                aux[atual] = v[prim];
                prim++;
            }
            else {
                aux[atual] = v[seg];
                seg++;
            }
            atual++;
        }
        if(prim > m)
            for(int k=seg; k<=f; k++) {
                aux[atual] = v[k];
                atual++;
            }
        else
            for(int k=prim; k<=m; k++) {
                aux[atual] = v[k];
                atual++;
            }
        atual = 0;
        for(int k=i; k<=f; k++) {
            v[k] = aux[atual];
            atual++;
        }        
        mostra(v);
    }
    public static void divideEMistura(int[] v, int inicio, int fim) {
        //mostraP("Ciclo " + inicio + " " + fim + " ", v, inicio, fim);
        if(inicio >= fim)
            return;
        else {
            int meio = (inicio + fim) / 2;
            divideEMistura(v, inicio, meio);
            divideEMistura(v, meio + 1, fim);
            mistura(v, inicio, meio, fim);
        }        
    }
    public static void mergeSort(int[] v) {
        System.out.println("Merge Sort (Método de ordenação por mistura)");        
        divideEMistura(v, 0, v.length - 1);        
    }
    public static void main(String args[]) {
        int k, n = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros?"));
        int[] vetor = new int[n];
        gera(vetor);
        mergeSort(vetor);
    }
}
