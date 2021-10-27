/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula35;

import java.awt.Point;

/**
 *
 * @author gustavo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void mostrar(int n) {
        System.out.println(n);
    }
    public static void mostrar(Point p) {
        System.out.println("(" + p.getX() + "," + p.getY() + ")");
    }
    public static void mostrar(Point[] ps) {
        for(int i=0; i<ps.length; i++)
            System.out.println("(" + ps[i].getX() + "," + ps[i].getY() + ")");
    }
    public static void gerar(Point[] ps) {
        for(int i=0; i<ps.length; i++)
            ps[i] = new Point( (int) (25 * Math.random()), (int) (25 * Math.random()));
    }
    public static Point centroide(Point[] ps) {
        int sX, sY;
        sX = sY = 0;
        for(int i=0; i<ps.length; i++) {
            sX += ps[i].getX();
            sY += ps[i].getY();
        }
        sX /= ps.length;
        sY /= ps.length;
        return new Point(sX, sY);
    }
    public static int somaDeDistancias(Point[] ps) {
        int s = 0;
        Point c = centroide(ps);
        for(int i=0; i<ps.length; i++)
            s += ps[i].distance(c);                
        return s;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Point[] pontos;
        int n = 1 + (int) (25 * Math.random());
        pontos = new Point[n];
        gerar(pontos);
        mostrar(pontos);
        mostrar(centroide(pontos));
        mostrar(somaDeDistancias(pontos));
    }

}
