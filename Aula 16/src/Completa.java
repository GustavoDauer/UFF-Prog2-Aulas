/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Completa extends Incompleta {
    String placa, modelo;
    int ano;    
    public Completa(String p, String m, int a, int pp) {
        super (pp);
        placa = p;
        modelo = m;
        ano = a;        
    }
    public boolean menor(Incompleta a) {
        return (((Completa)a).placa.compareTo(placa) >= 0);
    }
    @Override
    public String toString() {
        return placa + " " + modelo + " " + ano + " " + potencia + "\n";
    }
}
