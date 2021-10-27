/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class DemoJogoDaVelha {
    public static void main(String args[]) {        
        Jogador j1 = new Jogador('O');
        Jogador j2 = new Jogador('X');
        Jogador v = new Jogador(' ');
        JogoDaVelha jogo = new JogoDaVelha(j1, j2, v);
        new FormularioJogo(jogo, j1, j2, v).setVisible(true);
    }
}
