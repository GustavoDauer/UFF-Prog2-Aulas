
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
public class P3Q3 {
    public static void main(String[] args) {
        int[][] m;
        geraPontos();
        mostraPontos();
        m = pegaPontos();
        mostra(m);
    }
    public static void mostra(int[][] m) {
        String r = "";
        for(int i=0; i<m.length; i++)
            for(int j=0; j<m[i].length; j++) {
                r += m[i][j] + " ";
                if(j == m[i].length - 1)
                    r += "\n";
            }
        JOptionPane.showMessageDialog(null, r, "Matriz", -1);
    }
    public static int[][] pegaPontos() {
        Scanner s;
        File f = new File("pontos.txt");
        int maiorX = 0, maiorY = 0;
        int[][] m;
        try {
            s = new Scanner(f);            
            while(s.hasNextInt()) {
                int y = s.nextInt();
                int x = s.nextInt();
                if(x > maiorX)
                    maiorX = x;
                if(y > maiorY)
                    maiorY = y;                
            }
            s.close();            
            if(maiorX <= 0 && maiorY <= 0)
                return null;
            maiorX++;
            maiorY++;
            m = new int[maiorY][maiorX];
            s = new Scanner(f);
            while(s.hasNextInt()) {
                int x = s.nextInt();
                int y = s.nextInt();                
                m[x][y]++;
            }
            s.close();
            return m;
        } catch(Exception e) {
            System.out.println(e);
            return null;
        }
    }
    public static void geraPontos() {
        Formatter s;
        File f = new File("pontos.txt");
        int nPontos = (int) (25 * Math.random()), maiorX = 7, maiorY = 7;
        try {
            s = new Formatter(f);
            for(int i=0; i<nPontos; i++)
                s.format("%d %d\n", (int) (maiorY * Math.random()), (int) (maiorX * Math.random()));
            s.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public static void mostraPontos() {
        Scanner s;
        File f = new File("pontos.txt");
        String r = "";
        try {
            s = new Scanner(f);
            while(s.hasNextLine())
                r += s.nextLine() + "\n";
            JOptionPane.showMessageDialog(null, r, "Pontos", -1);
            s.close();            
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
