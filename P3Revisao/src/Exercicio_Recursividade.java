/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Exercicio_Recursividade {

    public static void inverteStringSemAux(String t, int p) {
        int i;
        if(p == -2)
            i = t.length() - 1;
        else
            i = p;
        if(i >= 0) {
            System.out.print(t.charAt(i));
            inverteStringSemAux(t, i-1);
            if(i - 1 == -1)
                System.out.println();
        }        
    }

    public static int fibonacci(int p) {
        if(p == 0)
            return 0;
        if(p == 1)
            return 1;
        else
            return fibonacci(p - 1) + fibonacci(p - 2);
    }

    public static void serieFibonacci(int l, int p) {
        if(p == l)
            System.out.println();
        else {
            System.out.print(fibonacci(p) + " ");
            serieFibonacci(l, p+1);
        }
    }

    public static double fatora(double n) {
        if(n <= 1)
            return 1;
        else
            return n * fatora(n-1);
    }

    public static void fatorial(double n) {
        System.out.println(fatora(n));
    }

    public static void main(String[] args) {
        String t = "Gustavo";
        inverteStringSemAux(t, -2);
        serieFibonacci(25, 0);
        fatorial(7.7);
    }
}
