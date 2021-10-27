
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Questao1 {
    public static int[] proc(int[] vet) {
        int[] ind = new int[vet.length];
        for(int i=0; i<ind.length-1; i++) {
            int m = vet[i];
            int p = i;
            for(int j=i+1; j<ind.length-1; j++) {
                if(vet[j] <= m && vet[j] != -1) {
                    m = vet[j];
                    p = j;
                }
            }
            System.out.println(m);
            ind[i] = m;
            vet[p] = -1;            
        }
        return ind;
    }
    public static void main(String args[]) {
        int[] v = { 25, 5, 2, 7, 80, 14, 250 };
        int[] r = proc(v);
        for(int i=0; i<r.length; i++)
            System.out.print(r[i] + " ");
    }
}
