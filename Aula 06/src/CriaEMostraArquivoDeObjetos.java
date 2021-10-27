/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20931131
 */
import java.io.*;
public class CriaEMostraArquivoDeObjetos {
    public static void main(String args[]) {
        ObjectOutputStream arq;
        try {
            arq = new ObjectOutputStream(new FileOutputStream("teste.obj"));
            arq.writeObject(new Jogador(100, 70, 185, 90, "Ronaldo", "Atacante", 100000));
            arq.close();
        }
        catch(Exception e) {
            System.out.println("Erro na criação ou escrita" + e);
        }
        ObjectInputStream arqE;
        try {
            arqE = new ObjectInputStream(new FileInputStream("teste.obj"));
            Jogador x = (Jogador)arqE.readObject();
            System.out.println(x);
            arqE.close();
        }
        catch(Exception e) {
            System.out.println("Erro na criação ou escrita" + e);
        }     
    }
}
