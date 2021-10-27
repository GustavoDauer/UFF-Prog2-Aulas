
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Cidades {
    static int n;
    static int[][] m;
    static String[] c;

    // Pergunter o n de cidades;
    // Pergunte o nome da cidade;
    // Pergunte custo de conexao;
    // Encontre caminhos entre duas cidades;
    // salve;
    // Carrega;
    public static void salvar(int n, String[] c, int[][] m) {
        Formatter a;
        try {
            a = new Formatter(new File("cidades.txt"));
            a.format("%d\n", n);
            for(int i=0; i<c.length; i++)
                a.format("%s\n", c[i]);
            for(int i=0; i<c.length; i++)
                for(int j=0; j<m[i].length; j++) {
                    a.format("%d ", m[i][j]);
                    if(j == m[i].length - 1)
                        a.format("\n");
                }
            a.close();
        } catch(Exception e) {}
    }
    public static void carregar() {
        Scanner a;
        try {
            a = new Scanner(new File("cidades.txt"));
            n = a.nextInt();
            c = new String[n];
            m = new int[n][n];
            for(int i=0; i<c.length; i++)
                c[i] = a.nextLine();
            for(int i=0; i<c.length; i++)
                for(int j=0; j<m[i].length; j++) {
                    m[i][j] = a.nextInt();
                }
            a.close();
        } catch(Exception e) {}
    }
    public static void custos(int[][] m) {
        for(int i=0; i<m.length; i++)
            for(int j=0; j<m[i].length; j++)
                m[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Posicao " + i + " " + j));
    }
    public static void nomes(String[] c) {
        for(int i=0; i<c.length; i++)
            c[i] = JOptionPane.showInputDialog("Cidade " + i);
    }
    public static void encontraCaminhos(String c1, String c2) {
        int i1, i2;
        for(int i=0; i<c.length; i++)
            if(c[i].equals(c1))
                i1 = i;
        //for(int i=0; i<m.length; i++)
            //for(int j=0; j<m[i].length; j++)
    }
    public static void main(String args[]) {
        if(JOptionPane.showConfirmDialog(null, "Deseja carregar?") == 0)
            carregar();
        else {
            n = Integer.parseInt(JOptionPane.showInputDialog("Qual o número de cidades?"));
            c = new String[n];
            m = new int[n][n];
            custos(m);
            nomes(c);
            salvar(n, c, m);
        }
        String r = "";
        for(int i=0; i<c.length; i++)
            r += c[i] + "\n";
        encontraCaminhos(JOptionPane.showInputDialog("Encontrar caminho de \n " + r + "\n"), JOptionPane.showInputDialog("Para \n " + r + "\n"));
    }
}
