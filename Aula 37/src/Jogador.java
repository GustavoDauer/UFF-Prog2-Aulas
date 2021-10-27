/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Jogador {
    char letra;
    int vitorias;
    public Jogador(char n) {
        letra = n;
        vitorias = 0;
    }
    @Override
    public String toString() {
        return "" + letra;
    }
}
