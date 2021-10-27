/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Produto {
    public int cod;
    public double qtd, valor;
    public Produto(int c, double v, double q) {
        cod = c;
        valor = v;
        qtd = q;
    }
    @Override
    public String toString() {
        return cod + " " + valor + " " + qtd + "\n";
    }
}
