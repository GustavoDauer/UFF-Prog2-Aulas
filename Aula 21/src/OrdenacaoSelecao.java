
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
        int temp;
        for(int i=0; i<v.length; i++)
            for(int j=0; j<v.length; j++)
                if(v[i] < v[j]) {                    
                    temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
        

    }    
    public static void main(String args[]) {
        int k;
        int[] v = new int[5];
        gera(v);
        mostra(v);
        selectionSort(v);
        mostra(v);
    }
}
