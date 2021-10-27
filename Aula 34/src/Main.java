
import java.io.File;
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
public class Main {
    public static void atualiza(String tA, int gA, String tB, int gB, Selecao[] c) {
        for(int i=0; i<c.length; i++) {
            if(c[i].nome.equals(tA)) {
                c[i].golsPro += gA;
                c[i].golsContra += gB;
                if(c[i].golsPro > c[i].golsContra) {
                    c[i].vitorias++;
                    c[i].pontos += 3;
                }
                c[i].jogos++;
            }
            if(c[i].nome.equals(tB)) {
                c[i].golsPro += gB;
                c[i].golsContra += gA;
                if(c[i].golsPro > c[i].golsContra) {
                    c[i].vitorias++;
                    c[i].pontos += 3;
                }
                c[i].jogos++;
            }
        }
    }
    public static Selecao[] pegaResultados() throws Exception {
        String[] s = pegaClassificadas();
        Selecao[] c = new Selecao[s.length];
        for(int i=0; i<s.length; i++)
            c[i] = new Selecao(s[i]);                    
        Scanner le = new Scanner(new File("resultados.txt"));
        String tA, tB;
        int gA, gB;
        int i = 0;
        while(le.hasNextLine()) {
            tA = le.nextLine();
            gA = Integer.parseInt(le.nextLine());
            tB = le.nextLine();
            gB = Integer.parseInt(le.nextLine());
            atualiza(tA, gA, tB, gB, c);
        }
        le.close();
        return c;
    }
    public static String[] pegaClassificadas() throws Exception {
        int n = 0;
        String[] s;
        Scanner le = new Scanner(new File("classificadas.txt"));
        if(le.hasNextLine())
            n = Integer.parseInt(le.nextLine());
        s = new String[n];
        int i = 0;
        while(le.hasNextLine() && i < n) {
            s[i] = le.nextLine();
            i++;
        }
        return s;
    }
    public static void mostra(Selecao[] s) {
        String r = "";
        for(int i=0; i<s.length; i++)
            r += s[i].toString() + "\n";
        JOptionPane.showMessageDialog(null, r);
    }
    public static void main(String args[]) throws Exception {
        Selecao[] c = pegaResultados();
        mostra(c);
    }
}
