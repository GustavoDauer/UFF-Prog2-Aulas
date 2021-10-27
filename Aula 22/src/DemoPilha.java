/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class DemoPilha {
    public static void main(String args[]) {
        Pilha p = new Pilha();
        p.empilha(13);
        p.empilha(25);
        p.empilha(39);
        p.empilha(52);
        while(!p.vazia()) {
            System.out.println(p.topo());
            p.desempilha();
        }
    }
}
