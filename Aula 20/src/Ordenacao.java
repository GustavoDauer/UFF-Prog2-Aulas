/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Ordenacao {
    public static void mostraP(String msg, int[] v, int inicio, int fim) {
        String espacos = "\n--------------------------------------------------------------------------------\n", r = espacos;
        r += msg + " " + inicio + " " + fim;
        for(int i=0; i<v.length; i++)
            r += v[i] + " ";
        //JOptionPane.showMessageDialog(null, r);
        r += espacos;
        System.out.println(r);
    }
    public static void mostra(int[] v) {
        String espacos = "\n--------------------------------------------------------------------------------\n", r = espacos;
        for(int i=0; i<v.length; i++)
            r += v[i] + " ";
        //JOptionPane.showMessageDialog(null, r);
        r += espacos;
        System.out.println(r);
    }
    public static void mostra(char[] v) {
        String espacos = "\n--------------------------------------------------------------------------------\n", r = espacos;
        for(int i=0; i<v.length; i++)
            r += v[i] + " ";
        //JOptionPane.showMessageDialog(null, r);
        r += espacos;
        System.out.println(r);
    }
    public static void gera(int[] v) {
        for(int i=0; i<v.length; i++)
            v[i] = (int) (Math.random() * 100);       
    }
}
