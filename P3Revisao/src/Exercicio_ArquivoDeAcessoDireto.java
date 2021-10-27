
import java.io.RandomAccessFile;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Exercicio_ArquivoDeAcessoDireto {
    public static void main(String[] args) {
        String nomeArq = "numeros";
        criarArquivo(nomeArq);
        mostra(nomeArq);
        int p = sortearPosicao(nomeArq);
        removerTodas(nomeArq, p);
        mostra(nomeArq);
    }
    public static void criarArquivo(String nome) {
        int n = (int) (25 * Math.random());
        RandomAccessFile a;
        try {
            a = new RandomAccessFile(nome, "rw");
            a.setLength(0);
            for(int i=0; i<n; i++)
                a.writeInt((int) (7 * Math.random()));
            a.close();
        } catch(Exception e) {            
        }
    }
    public static int sortearPosicao(String nome) {
        int n = 0;
        RandomAccessFile a;
        try {
            a = new RandomAccessFile(nome, "rw");
            n = (int) ((a.length() / 4) * Math.random());
            a.seek(n*4);
            System.out.println("Sorteado: " + a.readInt() + " Posicao: " + n);
            a.close();
            return n;
        } catch(Exception e) {
            return n;
        }
    }
    public static void removerTodas(String nome, int p) {        
        RandomAccessFile a;
        try {
            a = new RandomAccessFile(nome, "rw");            
            a.seek(p*4);
            int valor = a.readInt();
            a.seek(0);
            for(int i=0; i<a.length()/4; i++) {
                a.seek(i*4);
                int atual = a.readInt();
                if(atual == valor) {
                    for(int j=i; j<a.length()/4; j++) {
                        if(j != a.length()/4-1) {
                            a.seek((j+1)*4);
                            atual = a.readInt();
                            a.seek(i*4);
                            a.writeInt(atual);
                        }
                    }
                    a.setLength(a.length() - 4);
                }
            }
            a.close();            
        } catch(Exception e) {            
        }
    }
    public static void mostra(String nome) {                
        RandomAccessFile a;
        try {
            a = new RandomAccessFile(nome, "rw");
            for(int i=0; i<a.length()/4; i++)
                System.out.print(a.readInt() + " ");
            System.out.println();
            a.close();
        } catch(Exception e) {
        }    
    }
}
