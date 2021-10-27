/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula36;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author Dante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static Lista gerar(int tam){
        if(tam <=0)
            return null;
        else
            return new Lista(
                    new Point(1 + (int) (Math.random()*400),
                    1 + (int) (Math.random()*400)),
                    gerar(tam -1)
                    );
    }
    public static ListaDeLista gerarL(int tam){
        if(tam<=0)
            return null;
        else
            return new ListaDeLista(gerar(0),
                                                 new Color(
                                                                 (int)(Math.random()*256),
                                                                 (int)(Math.random()*256),
                                                                 (int)(Math.random()*256)
                                                                 )
                                                 ,
                                                 gerarL(tam-1)
                                                 );
    }
    public static Lista pegaPrimeiros(Lista a, ListaDeLista l){
        while(l!=null){
            Lista aux = new Lista(a.info);
            l.info = aux;
            a = a.prox;
            l = l.prox;
        }
        return a;
    }


    public static void main(String[] args) {
        Lista a = gerar(6);
        System.out.println(a);
        System.out.println(a.centroide().x + " " + a.centroide().y);
        System.out.println(a.somaDeDistancias());
        ListaDeLista l = gerarL(3);
        System.out.println(l);
        a = pegaPrimeiros(a,l);
        System.out.println(l);
        System.out.println(a);
        //deslocaPontos(a,l);
    }

}
