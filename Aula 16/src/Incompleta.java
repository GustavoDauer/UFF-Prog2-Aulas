/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public abstract class Incompleta {
    int potencia;
    public abstract boolean menor(Incompleta outra);
    public Incompleta(int p) {
        potencia = p;
    }
}
