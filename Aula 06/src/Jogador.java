/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20931131
 */
import java.io.Serializable;
public class Jogador implements Serializable  {
    int forca, velocidade;
    int altura, peso;
    String nome, posicao;
    double preco;
    public Jogador(int f, int v, int a, int p, String n, String pos, double val) {
        forca = f;
        velocidade = v;
        altura = a;
        peso = p;
        nome = n;
        posicao = pos;
        preco = val;
    }
    public String toString() {
        return forca + "\t" + velocidade + "\t" + altura + "\t" + peso + "\t" + nome + "\t" + posicao + "\t" + preco + "\n";
    }
}
