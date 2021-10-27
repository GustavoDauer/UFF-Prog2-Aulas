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
public class Expressao {
    public static double avalia(String s) {
        int onde = s.indexOf("+");
        if(onde < 0)
            return Double.parseDouble(s);
        else
            return Double.parseDouble(s.substring(onde)) + avalia(s.substring(onde+1));
    }
    public static void main(String args[]) {
        String expressao = JOptionPane.showInputDialog("Expressao");
        String[] e = expressao.split("\\+");
        int j = 0, k = 0;
        double n;
        double ns[];
        double resultado = 0;
        for(int i=0; i<e.length; i++) // Conta quantas parcelas tem
            if(!e[i].equals("+") || !e[i].equals("-") || !e[i].equals("*") || !e[i].equals("/"))
                j++;
            else
                k++;

        ns = new double[j];

        for(int i=0; i<e.length; i++) // Joga no vetor as parcelas
            if(!e[i].equals("+") || !e[i].equals("-") || !e[i].equals("*") || !e[i].equals("/"))
                ns[i] = Double.parseDouble(e[i]);
        
        for(int i=0; i<ns.length; i++) { // Soma as parcelas
            resultado += ns[i];
        }
        JOptionPane.showMessageDialog(null, resultado);
        JOptionPane.showMessageDialog(null, avalia(expressao));
    }
}
