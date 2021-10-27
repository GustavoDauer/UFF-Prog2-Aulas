
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
public class Questao2VS {
    public static void criaArquivo(String n) {
        Formatter a;
        String[] palavras = { "Estudo", "Programacao", "Teste", "UFF", "Teste", "Programacao" };
        try {
            a = new Formatter(new File(n));
            int l = (int) (100 * Math.random());
            int r;
            for(int i=0; i<l; i++) {
                r = (int) ((palavras.length + 1) * Math.random());                        
                a.format("%s\n", palavras[r]);
            }
            a.close();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }        
    public static String contaLinha(String l) throws Exception {
        int c = 0;
        String p = " ", p2;
        Scanner a = new Scanner(new File("palavras.txt"));
        if(l != null) {            
            while(a.hasNextLine()) {
                p2 = a.nextLine();
                if(l.equals(p2))
                    c++;
            }
            p += l + " " + c + "\n";
        }
        a.close();
        return p;
    }
    public static void main(String args[]) throws Exception {
        String r = "";
        Scanner a = new Scanner(new File("palavras.txt"));
        while(a.hasNextLine()) {
            r += contaLinha(a.nextLine());
        }
        JOptionPane.showMessageDialog(null, r);
        String[] v = r.split("\n");
        for(int i=0; i<v.length; i++)
            for(int j=1; j<v.length && j!=i; j++)
                if(v[i].equals(v[j]))
                    v[j] = "";
        r = "";
        for(int i=0; i<v.length; i++)
            r += v[i] + "\n";
        JOptionPane.showMessageDialog(null, r);        
    }
}
