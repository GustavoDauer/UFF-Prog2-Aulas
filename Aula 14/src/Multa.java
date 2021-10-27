
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Multa extends Oca {
    int pontos;
    double valor;    
    String data, placa, motivo;
    public Multa(int p, double v, String d, String pl, String m) {
        pontos = p;
        valor = v;
        data = d;
        placa = pl;
        motivo = m;
    }
    public Multa (String p) {
        placa = p;
    }
    /*@Override
    public String toString() {
        return "Pontos: " + pontos + "\nValor: R$ " + valor + "\nData: " + data + "\nPlaca: " + placa + "\nMotivo: " + motivo + "\n";
    }*/
    @Override
    public String toString() {
        String r = "";
        if(pontos > 0)
            r  += " " + pontos;
        if(valor > 0)
            r += " " + valor;
        if(data != null)
            r += " " + data;
        if(placa != null)
            r += " " + placa;
        if(motivo != null)
            r += " " + motivo + "\n";
        return r;
    }
}
