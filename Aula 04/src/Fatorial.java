/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Fatorial {
    public static int fatora(int x) {
        if(x == 1)
            return 1;
        return x * fatora(x - 1);
    }
    public static void main(String args[]) {
        System.out.println(fatora(5));
    }
}
