/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula08;

/**
 *
 * @author 20931131
 */
import java.io.Serializable;
public class Carro implements Serializable{
    String modelo, marca, potencia, cor, placa;
    int ano;
    long km;
    public Carro(String m, String ma, String p, String c, String pla, int a, long k) {
        modelo = m;
        marca = ma;
        potencia = p;
        cor = c;
        placa = p;
        ano = a;
        km = k;
    }
    @Override
    public String toString() {
        return marca + " " + modelo + " " + potencia + " " + km + " " + placa + " " + cor + " " + ano + "\n";
    }
}
