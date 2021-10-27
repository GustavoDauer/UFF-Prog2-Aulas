/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula12;

/**
 *
 * @author gustavo
 */
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;
public class BuscaBinaria {
    public static void mostra(RandomAccessFile arq) throws Exception {
        arq.seek(0);
        String r = "";
        for(int i=0; i<arq.length()/4; i++)
            r += arq.readInt() + "\n";
        arq.close();
        JOptionPane.showMessageDialog(null, r);
    }
    public static void produzNumeros(int n, String nome) throws Exception {
        RandomAccessFile arq = new RandomAccessFile(nome,"rw");
        int k;
        for(int i=0; i<n; i++) {
            k = (int) (Math.random() * 100);
            arq.writeInt(k);
        }
        mostra(arq);
    }
    public static void ordenaArquivo(String nome) throws Exception {
        RandomAccessFile arq = new RandomAccessFile(nome, "rw");
        int posMenor, valMenor, valAtual;
        for(int i=0; i<(arq.length()/4)-1; i++) {
            posMenor = i;
            arq.seek(i*4);
            valMenor = arq.readInt();
            for(int j=i+1; j<arq.length()/4; j++) {
                valAtual = arq.readInt();
                if(valAtual < valMenor) {
                    posMenor = j;
                    valMenor = valAtual;
                }
            }
            arq.seek(i*4);
            int temp = arq.readInt();
            arq.seek(i*4);
            arq.writeInt(valMenor);
            arq.seek(posMenor*4);
            arq.writeInt(temp);
        }
        mostra(arq);
        arq.close();
    }
    public static void busca(long elem, String nome) throws Exception {
        RandomAccessFile arq = new RandomAccessFile(nome,"r");
        if(buscaBinaria(arq, 0, (arq.length()/4)-1, elem))
            JOptionPane.showMessageDialog(null, "Achei");
        else
            JOptionPane.showMessageDialog(null, "Nao achei");
        arq.close();
    }
    public static boolean buscaBinaria(RandomAccessFile a, long i, long f, long e) throws Exception {
        if(i>f)
            return false;
        else {
            long meio = (i+f)/2;
            a.seek(meio*4);
            long atual = a.readInt();
            if(atual == e)
                return true;
            else
                if(atual > e)
                    return buscaBinaria(a, i, meio-1, e);
                else
                    return buscaBinaria(a, meio+1, f, e);
        }
    }
    public static void main(String args[]) throws Exception {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros?"));
        String nome = JOptionPane.showInputDialog("Nome");
        produzNumeros(n, nome);
        ordenaArquivo(nome);
        long e = Long.parseLong(JOptionPane.showInputDialog("Procurar"));
        busca(e, nome);
    }
}
