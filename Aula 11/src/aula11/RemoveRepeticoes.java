/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula11;

import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class RemoveRepeticoes {
    public static void removeRepeticoes(RandomAccessFile a) throws Exception {
        a.seek(0);
        for(int i=0; i<a.length()/4; i++) {
            a.seek(i*4);
            int v = a.readInt();
            for(int j=i+1; j<a.length()/4-1; j++) {
                a.seek(j*4);
                int atual = a.readInt();
                int p = j;
                if(v == atual) {                    
                    for(int k=j; k<a.length()/4-1; k++) {
                        int aux = a.readInt();
                        a.seek(p*4);
                        a.writeInt(aux);
                    }
                    a.setLength(a.length() - 4);
                }
            }
        }        
    }
    public static void main(String args[]) throws Exception {
        RandomAccessFile arq = new RandomAccessFile(JOptionPane.showInputDialog("Nome: "), "rw");
        removeRepeticoes(arq);
    }
}
