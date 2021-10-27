/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Selecao {
    String nome;
    int vitorias, empates, derrotas, golsPro, golsContra, jogos, pontos;
    public Selecao(String n) {
        nome = n;
        vitorias = empates = derrotas = jogos = golsPro = golsContra = pontos = 0;
    }
    @Override
    public String toString() {
        return nome + "\nJogos: " + jogos + "\nVitorias: " + vitorias + "\nEmpates: " + empates + "\nDerrotas: " + derrotas + "\nGols pro: " + golsPro + "\nGols contra: " + golsContra + "\n";
    }
}
