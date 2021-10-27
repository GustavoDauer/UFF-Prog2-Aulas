/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class DemoFila {
    public static void main(String args[]) {
        Fila f = new Fila();
        f.enfila(13);
        f.enfila(26);
        f.enfila(39);
        f.enfila(52);
        while(!f.vazia()) {
            System.out.println(f.naFrente());
            System.out.println(f.noFinal());
            f.desenfila();
        }
    }
}
