/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula10;

import javax.swing.JOptionPane;
import java.io.RandomAccessFile;

/**
 *
 * @author gustavo
 */
public class ArquivoDeAcessoDireto {
    public static void main(String args[]) throws Exception {
        String nome = JOptionPane.showInputDialog("Entre com o nome do arquivo: ");
        RandomAccessFile arq = new RandomAccessFile(nome, "rw");
        JOptionPane.showMessageDialog(null, arq.getFilePointer());
        String n = JOptionPane.showInputDialog("Numero: ");
        while(!n.equals("")) {
            if(!n.equals(""))
                arq.writeInt(Integer.parseInt(n));
            n = JOptionPane.showInputDialog("Numero:");            
        }
        JOptionPane.showMessageDialog(null, arq.getFilePointer());        
        arq.close();
    }
}
