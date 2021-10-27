
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Questao3P1 {
    static RandomAccessFile a;
    static String nome;    
    public static String defineNome() {
        String n = JOptionPane.showInputDialog("Qual o nome do arquivo?");
        return n;
    }
    public static int geraConteudo() throws Exception {
        int q = (int) (7 * Math.random() + 5);
        a = new RandomAccessFile(nome, "rw");
        for(int i=0; i<=q; i++)
            a.writeInt((int) (100 * Math.random()));
        a.close();
        return q;
    }
    public static void mostra() {
        String r = "";
        try {
            a = new RandomAccessFile(nome, "rw");        
            for(int i=0; i<a.length()/4 - 1; i++)
                System.out.print(a.readInt() + " ");
            a.close();
            System.out.println();
        }        
        catch (Exception e) {}
    }    
    public static void inserir(int n) throws Exception {
        int aux, temp, atual;
        a = new RandomAccessFile(nome, "rw");
        aux = a.readInt();
        a.seek(0);
        a.writeInt(n);
        temp = a.readInt();
        a.seek(4);
        a.writeInt(aux);
        atual = temp;
        for(int i=2; i<a.length()/4 - 1; i++) {
            aux = a.readInt();
            a.seek(i*4);
            a.writeInt(atual);
            temp = a.readInt();
            a.seek((i+1)*4);
            a.writeInt(aux);
            atual = temp;
        }
        a.close();
    }
    public static void remover(int n) throws Exception {
        int aux, atual, removidos = 0;
        a = new RandomAccessFile(nome, "rw");
        for(int i=0; i<a.length()/4; i++) {
            atual = a.readInt();
            if(atual == n) {
                removidos++;
                aux = a.readInt();
                a.seek(i*4);
                a.writeInt(aux);
                for(int j=i; j<a.length()/4 - 1; j++) {
                    aux = a.readInt();
                    a.seek((i+1)*4);
                    a.writeInt(aux);                 
                }
            }
        }
        a.setLength(a.length() - removidos * 4);
        a.close();
    }
    public static void removerProfessor(int n) throws Exception {
        int atual;
        a = new RandomAccessFile(nome, "rw");
        for(int i=0; i<a.length()/4; i++) {
            a.seek(i*4);
            atual = a.readInt();
            if(atual == n) {
                for(int j=i+1; j<a.length()/4 - 1; j++) {
                    a.seek(i*4);
                    atual = a.readInt();
                    a.seek((i-1)*4);
                    a.writeInt(atual);
                }
                a.setLength(a.length() - 4);
            }
        }
        a.close();
    }
    public static void removerProfessorCorrigido(int n) throws Exception {
        int i = 0;
        a = new RandomAccessFile(nome, "rw");
        while(i < a.length()/4) {
            a.seek(i*4);
            int atual = a.readInt();
            int conta = 0;
            if(n == atual)
                for(int j=i+1; j<a.length()/4; j++) {
                    a.seek(j*4);
                    int prox = a.readInt();
                    a.seek(j*4);
                    a.writeInt(prox);
                    conta++;
                }
            if(conta == 0)
                i++;
            else
                a.setLength(a.length() - 4 * conta);
        }
        a.close();        
    }
    public static void main(String args[]) {        
        int n;
        nome = defineNome();
        try {
            a = new RandomAccessFile(nome, "rw");
            geraConteudo();
            mostra();
            n = Integer.parseInt(JOptionPane.showInputDialog("Qual numero você deseja inserir?"));        
            inserir(n);
            mostra();
            n = Integer.parseInt(JOptionPane.showInputDialog("Qual numero você deseja remover?"));
            remover(n);
            //removerProfessor(n);
            mostra();
            a.close();
        }
        catch(Exception e) {
        }
    }
}
