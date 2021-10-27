/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20931131
 */
package aula07;

import javax.swing.JOptionPane;

public class Menu {
    public static void inserir(Agenda a) {
        String n = JOptionPane.showInputDialog("Nome: ");
        String f = JOptionPane.showInputDialog("Fone: ");
        String e = JOptionPane.showInputDialog("Endereco: ");
        String em = JOptionPane.showInputDialog("Email: ");
        int i = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
        double al = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
        double pe = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
        Pessoa p = new Pessoa(n, f, e, em, i, al, pe);
        a.insere(p);
    }
    public static void remover(Agenda a) {
        String n = JOptionPane.showInputDialog("Nome: ");
        a.remove(n);
    }
    public static void salvar(Agenda a) {
        String n = JOptionPane.showInputDialog("Nome: ");
        a.salvar(n);
    }
    public static void carregar(Agenda a) {
        String n = JOptionPane.showInputDialog("Nome: ");
        a.carregar(n);
    }
    public static void main(String args[]) {
        Agenda a = new Agenda(5);
        Pessoa p = new Pessoa("Gustavo", "1234567", "", "gustavodauer@globo.com", 22, 1.80, 90.0);
        Pessoa p2 = new Pessoa("Gustavo2", "1234567", "", "gustavodauer@globo.com", 22, 1.80, 90.0);
        Pessoa p3 = new Pessoa("Gustavo3", "1234567", "", "gustavodauer@globo.com", 22, 1.80, 90.0);
        Pessoa p4 = new Pessoa("Gustavo4", "1234567", "", "gustavodauer@globo.com", 22, 1.80, 90.0);        
        a.insere(p);
        a.insere(p2);
        a.insere(p3);
        a.insere(p4);        
    }


}
