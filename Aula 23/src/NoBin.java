/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class NoBin {
    Object info;
    NoBin esq, dir;
    public NoBin(Object x) {
        info = x;
        esq = dir = null;
    }
}
