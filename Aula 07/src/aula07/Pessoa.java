/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20931131
 */
package aula07;
import java.io.Serializable;
public class Pessoa implements Serializable {
    String nome, fone, endereco, email;
    int idade;
    double altura, peso;
    public Pessoa(String n, String f, String e, String em, int i, double a, double p) {
        nome = n;
        fone = f;
        endereco = e;
        email = em;
        idade = i;
        altura = a;
        peso = p;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + "\nFone: " + fone + "\n" + "Endereco: " + endereco + "\nEmail: " + email + "\nIdade: " + idade + "\nAltura: " + altura + "\nPeso: " + peso + "\n";
    }
}
