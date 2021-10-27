/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula36;

import java.awt.Point;

/**
 *
 * @author Freichos
 */
public class Lista {
    Point info;
    Lista prox;
    public Lista(Point p, Lista l){
        info = p;
        prox = l;
    }

    public Lista(Point p){
        info = p;
        prox = null;
    }

    public int somaDeDistancias() {
        Lista l = this;
        int soma = 0;
        Point c = l.centroide();
        while(l != null) {
            soma += l.info.distance(c);
            l = l.prox;
        }
        return soma;
    }


    public Point centroide() {
        Lista l = this;
        if(l == null)
            return new Point(0, 0);
        else {
            double sX = 0;
            double sY = 0;
            int c = 0;
            while(l != null) {
                sX += l.info.getX();
                sY += l.info.getY();
                l = l.prox;
                c++;
            }
            return new Point( (int) (sX / c), (int) (sY / c));
        }
    }

    @Override
    public String toString(){
        if(this==null)return "";
        else{
            if(prox==null)return "("+ info.x +","+ info.y+")";
            else
                return "("+ info.x +","+ info.y+")" + prox;
        }
    }
}
