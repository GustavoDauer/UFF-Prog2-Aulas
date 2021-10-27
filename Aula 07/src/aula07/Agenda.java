/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20931131
 */
package aula07;
import java.io.*;
public class Agenda {
    private Pessoa p[];
    int capacidade, usados;

    public Agenda(int c) {
        p = new Pessoa[c];
        capacidade = c;
        usados = 0;
    }
    public boolean insere(Pessoa pe) {
        if(usados < capacidade - 1){
            p[usados] = pe;
            usados++;
            return true;
        }
        return false;
    }
    public boolean remove(String nome) {
        for(int i=0; i<p.length; i++) {
            if(p[i].nome.equals(nome)) {
                p[i] = p[p.length -1];
                p[p.length - 1] = null;
                usados--;
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        String resultado = "";
        for(int i=0; i<p.length-1; i++)
            resultado += "\nNome: " + p[i].nome + "\nFone: " + p[i].fone + "\n" + "Endereco: " + p[i].endereco + "\nEmail: " + p[i].email + "\nIdade: " + p[i].idade + "\nAltura: " + p[i].altura + "\nPeso: " + p[i].peso + "\n---------------------------------------";
        return resultado;
    }
    public boolean salvar(String nome) {
        try{
            ObjectOutputStream ar = new ObjectOutputStream(new FileOutputStream(nome));
            for(int i=0; i<p.length; i++){
                ar.writeObject(p[i]);
            }
            ar.close();
            return true;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    public boolean carregar(String nome) {
        ObjectInputStream arq;
        try {
            arq = new ObjectInputStream(new FileInputStream(nome));
            usados =  0;
            while(true) {
                p[usados] = (Pessoa) arq.readObject();
                usados++;
            }
        } catch(EOFException e) {
            return true;
        } catch(Exception outra) {
            return false;
        }
    }    
}
