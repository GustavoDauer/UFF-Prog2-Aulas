/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Exercicio_String {

    public static void main(String[] args) {
        String p = "Gustavo";
        contaLetras(p);
    }    

    public static void contaLetras(String p) {
        int t = 0;
        for(int i=0; i<p.length(); i++) {
            for(int j=0; j<p.length(); j++) {
                if(p.charAt(i) == p.charAt(j))
                    t++;
            }
            System.out.println(p.charAt(i) + " " + t);
            t = 0;
        }
    }
}
