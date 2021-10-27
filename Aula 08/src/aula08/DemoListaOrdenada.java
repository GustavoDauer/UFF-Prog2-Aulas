/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula08;

/**
 *
 * @author 20931131
 */
public class DemoListaOrdenada {
    public static void main(String args[]) {
        Carro c = new Carro("Clio", "Marca", "1.0", "Prata", "KZV-6882", 2007, 142000);
        Carro c2 = new Carro("Clio", "Marca", "1.0", "Prata", "KZV-6882", 2007, 142000);
        Carro c3 = new Carro("Clio", "Marca", "1.0", "Prata", "KZV-6882", 2007, 142000);
        Carro c4 = new Carro("Clio", "Marca", "1.0", "Prata", "KZV-6882", 2007, 142000);
        Carro c5 = new Carro("Clio", "Marca", "1.0", "Prata", "KZV-6882", 2007, 142000);
        ListaOrdenadaDeCarros lo = new ListaOrdenadaDeCarros();
        ListaDeCarros lc = new ListaDeCarros(c, new ListaDeCarros(c2, new ListaDeCarros(c3, new ListaDeCarros(c4, new ListaDeCarros(c5)))));
        lo.insere(c);
        lo.insere(c2);
        lo.insere(c3);
        lo.insere(c4);
        //lo.insere(c5);
        System.out.println(lo.consultar(c4));
    }
}
