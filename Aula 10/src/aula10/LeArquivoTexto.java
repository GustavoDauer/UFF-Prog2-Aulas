/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula10;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class LeArquivoTexto {
    public static void main(String args[]) {
        String nome = JOptionPane.showInputDialog("Entre com o nome do arquivo: ");
        String texto = "";
        try {
            Scanner arq = new Scanner(new File(nome + ".txt"));
            while(arq.hasNextLine())
                texto += arq.nextLine();            
            arq.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        JOptionPane.showMessageDialog(null, texto);
    }
}
