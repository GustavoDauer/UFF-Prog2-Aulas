/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula11;

import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class ManipulaArquivoDeAcessoDireto {
    public static char menu() {
        return JOptionPane.showInputDialog("----------- Menu ---------------\n(d) Define nome\n(c) Cria\n(m) Mostra\n(o) Ordena\n(t) Termina\n").charAt(0);
    }
    public static String defineNome() {
        return JOptionPane.showInputDialog("Nome: ");
    }
    public static void criaArquivo(String nome) throws Exception {
        RandomAccessFile arq = new RandomAccessFile(nome, "rw");
        arq.setLength(0);
        int n = Integer.parseInt(JOptionPane.showInputDialog("Registros: "));
        int k;
        for(int i=0; i<n; i++) {
            k = (int) (1001 * Math.random());
            arq.writeInt(k);
        }
        arq.close();
    }
    public static void mostra(String nome) throws Exception {
        RandomAccessFile arq = new RandomAccessFile(nome, "rw");
        String r = "";
        for(int i=0; i<arq.length()/4; i++)
            r += arq.readInt() + "\n";
        arq.close();
        JOptionPane.showMessageDialog(null, r);
    }
    public static void ordenaArquivo(String nome) throws Exception {
        RandomAccessFile arq = new RandomAccessFile(nome, "rw");
        String r = "";
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
        arq.close();
    }
    public static void main(String args[]) throws Exception {
        char opcao; String nome = "Teste.bin";
        do {
            opcao = menu();
            switch(opcao) {
                case 'd': nome = defineNome(); break;
                case 'c': criaArquivo(nome); break;
                case 'm': mostra(nome); break;
                case 'o': ordenaArquivo(nome); break;
            }
        } while(opcao != 't');
    }
}
