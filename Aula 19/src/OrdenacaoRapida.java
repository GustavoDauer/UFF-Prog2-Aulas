/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class OrdenacaoRapida extends Ordenacao {
    public static void separa(int[] v, int p, int r) {        
    }
    public static int reorganiza(int[] v, int i, int f) {
        return (i + f) / 2;
    }
    public static void quickSort(int[] v) {
        quickSort(v, 0, v.length-1);
    }
    public static void quickSort(int[] v, int inicio, int fim) {
        int p = reorganiza(v, inicio, fim);
        quickSort(v, inicio, p-1);
        quickSort(v, p+1, fim);
    }
    public static void main(String args[]) {
        int[] v = new int[5];
        gera(v);
        mostra(v);
        quickSort(v);
        mostra(v);
    }
}
