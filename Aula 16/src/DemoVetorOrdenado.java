/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class DemoVetorOrdenado {
    public static void main(String args[]) {
        VetorOrdenado vetOrd = new VetorOrdenado(10);
        System.out.println(vetOrd);
        vetOrd.insere(new Completa("XYZ-0025", "Fusca", 1965, 2));
        vetOrd.insere(new Completa("ILS-1425", "Ford Dodge", 1980, 2));
        vetOrd.insere(new Completa("LIS-2577", "Land Rover Defender", 1970, 2));
        vetOrd.insere(new Completa("KZV-6882", "Renault Clio", 2007, 2));
        vetOrd.insere(new Completa("LUZ-7007", "Troller T4", 2010, 2));
        System.out.println(vetOrd);
    }
}
