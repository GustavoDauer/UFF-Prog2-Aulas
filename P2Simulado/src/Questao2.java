
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Formatter;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Questao2 {
    static RandomAccessFile r;
    static Scanner e;
    static Formatter s;
    public static void geraTexto() {
        try {
            s = new Formatter(new File("numeros.txt"));
            for(int i=0; i<25; i++)
                s.format("%d\n", (int) (5 * Math.random() + 1));
            s.close();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static int quantos(int n) {
        int c = 0;
        try {
            Scanner e2 = new Scanner(new File("numeros.txt"));
            while(e2.hasNextInt())
                if(e2.nextInt() == n)
                    c++;
            e2.close();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        return c;
    }
    public static boolean jaEscrito(int x) {
        try {
            RandomAccessFile r2 = new RandomAccessFile("numeros", "rw");
            for(int i=0; i<r2.length()/8; i++) {
                int n = r2.readInt();
                int q = r2.readInt();
                if(n == x)
                    return true;
            }
            r2.close();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
    public static void geraTipado() {
        try {
            r = new RandomAccessFile("numeros", "rw");
            e = new Scanner(new File("numeros.txt"));
            r.setLength(0);
            while(e.hasNextInt()) {
                int n = e.nextInt();
                int q = quantos(n);
                if(!jaEscrito(n)) {
                    r.writeInt(n);
                    r.writeInt(q);
                }
            }
            r.close();
            e.close();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void mostraTexto() {
        try {
            e = new Scanner(new File("numeros.txt"));
            while(e.hasNextInt())
                System.out.print(e.nextInt() + " ");
            System.out.println();
            e.close();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void mostraTipado() {
        try {
            r = new RandomAccessFile("numeros", "rw");
            for(int i=0; i<r.length()/8; i++)
                System.out.print(r.readInt() + " tem " + r.readInt() + "\n");
            System.out.println();
            r.close();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String args[]) {
        geraTexto();
        mostraTexto();
        geraTipado();
        mostraTipado();
    }
}
