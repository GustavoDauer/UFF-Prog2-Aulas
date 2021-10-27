/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula09;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class Palindromo {
    public static boolean EPalindromo(String texto) {
        char[] v = texto.toCharArray();
        for(int i=0, j=v.length - 1; i<v.length &&  j>0; i++, j--)
            if(v[i] != v[j])
                return false;
        return true;
    }
    public static boolean EPalindromo2(String texto) {
        int t = texto.length();
        for(int i=0; i<texto.length(); i++)
            if(texto.charAt(i) != texto.charAt(--t))
                return false;
        return true;
    }
    public static String P(String texto) {
        String resultado = "";
        int i = 0, j = texto.length() - 1;
        while(EPalindromo(texto.substring(i, j)))
            resultado += texto.substring(i, j) + "\n";
        return resultado;
    }
    public static void main(String args[]) {
        String texto = JOptionPane.showInputDialog("Entre com a palavra");
        JOptionPane.showMessageDialog(null, EPalindromo(texto));
        JOptionPane.showMessageDialog(null, EPalindromo2(texto));
        JOptionPane.showMessageDialog(null, P(texto));
    }
}