/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class P3Q1 {
    public static int maiorSequenciaCrescente(ListaNums lis) {
        if(lis == null)
            return 0;
        int t = 1, maior = 0;
        double anterior = lis.x;
        lis = lis.prox;
        while(lis != null) {                        
            if(anterior < lis.x)
                t++;
            else
                if(t > maior) {
                    maior = t;
                    t = 1;
                }
            anterior = lis.x;
            lis = lis.prox;
        }
        return maior;
    }
    public static void main(String[] args) {
        ListaNums l = new ListaNums(1, new ListaNums(2, new ListaNums(3, new ListaNums(4, new ListaNums(5, new ListaNums(2.5, new ListaNums(7)))))));
        System.out.println(maiorSequenciaCrescente(l));
    }
}
