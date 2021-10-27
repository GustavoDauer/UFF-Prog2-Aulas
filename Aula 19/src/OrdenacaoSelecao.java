
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class OrdenacaoSelecao extends Ordenacao {    
    public static void selectionSort(int[] v) {
        System.out.println("Selection Sort (Método de ordenação por seleção)");
        mostra(v);
        int temp;
        for(int i=0; i<v.length; i++)
            for(int j=0; j<v.length; j++)
                if(v[i] < v[j]) {
                    System.out.println("Trocando " + v[i] + " por " + v[j]);
                    temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
        mostra(v);

    }    
    public static void main(String args[]) {
        int k, n = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros?"));
        int[] vetor = new int[n];
        gera(vetor);
        selectionSort(vetor);        
    }
}
