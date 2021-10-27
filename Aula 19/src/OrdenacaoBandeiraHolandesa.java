

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class OrdenacaoBandeiraHolandesa extends Ordenacao {    
    public static void ordenaDutchFlag(char[] v) {
        int ib = 0;
        int iv = 0;
        char temp;
        for(int i=0; i<v.length; i++) {
            mostra(v);
            if(v[i] == 'A') {
                temp = v[i];
                v[i] = v[iv];
                v[iv] = v[ib];
                v[ib] = temp;
                ib++;
                iv++;
            }
            if(v[i] == 'B') {
                temp = v[i];
                v[i] = v[iv];
                v[iv] = temp;
                iv++;
            }
        }
    }
    public static void main(String args[]) {
        char[] v = { 'B', 'V', 'A', 'V', 'B', 'A', 'A', 'B' };
        mostra(v);
        ordenaDutchFlag(v);
        mostra(v);
    }
}
