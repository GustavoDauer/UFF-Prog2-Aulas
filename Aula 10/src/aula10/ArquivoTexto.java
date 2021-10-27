/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula10;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class ArquivoTexto {
    public static void main(String args[]) {
        String nome = JOptionPane.showInputDialog("Entre com o nome do arquivo: ");
        int i = 1;
        String linha = JOptionPane.showInputDialog("Linha "+ i + ":");
        String texto = linha + "\n";
        while(!linha.equals("")) {
            i++;
            linha = JOptionPane.showInputDialog("Linha "+ i + ":");
            texto += linha + "\n";
        }
        try {
            Formatter arq = new Formatter(new File(nome + ".txt"));
            arq.format("%s", texto);
            arq.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // Transferir linhas
        texto = "";
        try {
            Scanner arq2 = new Scanner(new File(nome + ".txt"));
            while(arq2.hasNextLine()) {
                texto += arq2.nextLine();
            }
            arq2.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        nome = JOptionPane.showInputDialog("Entre com o nome do novo arquivo: ");
        i = 1;
        try {
            Formatter arq = new Formatter(new File(nome + ".txt"));
            arq.format("%s", texto);
            arq.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
