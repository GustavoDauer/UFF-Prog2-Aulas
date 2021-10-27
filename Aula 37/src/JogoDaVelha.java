

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gustavo
 */
public class JogoDaVelha {
    
    Tabuleiro mesa;
    Jogador jogador1, jogador2, velha;

    public JogoDaVelha(Jogador j1, Jogador j2, Jogador v) {
        mesa = new Tabuleiro(3);
        jogador1 = j1;
        jogador2 = j2;
        velha = v;
    }

    public char verificaJogo() {
        char[] linha, coluna, diagonalPrincipal, diagonalSecundaria;        
        diagonalPrincipal = mesa.pegaDiagonalPrincipal();
        if (vencedorEm(diagonalPrincipal))
            return diagonalPrincipal[0];        
        diagonalSecundaria = mesa.pegaDiagonalSecundaria();
        if (vencedorEm(diagonalSecundaria))
            return diagonalSecundaria[0];        
        for (int i = 0; i < mesa.t.length; i++) {
            linha = mesa.pegaLinha(i);
            if (vencedorEm(linha))
                return linha[0];            
            coluna = mesa.pegaColuna(i);
            if (vencedorEm(coluna))
                return coluna[0];            
        }
        return ' ';
    }

    public boolean vencedorEm(char[] l) {
        if (l[0] == l[1] && l[0] == l[2])            
            return true;        
        return false;
    }
    // Usando essa função poderá haver 2 vencedores e o programa mostrará o encontrado
    // primeiro levando em consideração a ordem da função verificaJogo()
    public void GeraJogadasAleatoriasEmQualquerPosicao(Jogador j1, Jogador j2) {
        for(int i=0; i<mesa.t.length; i++)
            for(int j=0; j<mesa.t[i].length; j++) {
                double p = Math.random();
                if(p < 0.5)
                    mesa.t[i][j] = j1.letra;
                else
                    mesa.t[i][j] = j2.letra;
            }
    }

    public void GeraJogadasAleatorias(Jogador j1, Jogador j2) {
        mesa = new Tabuleiro(3);
        int totalJogadas = 9;
        char vez = j1.letra, vencedor = ' ';
        while (totalJogadas > 0) {
            int x = (int) (3 * Math.random()), y = (int) (3 * Math.random());            
            if (mesa.t[x][y] != j1.letra && mesa.t[x][y] != j2.letra) {
                mesa.t[x][y] = vez;                
                if (vez == j1.letra)
                    vez = j2.letra;
                else
                    vez = j1.letra;                
                totalJogadas--;
                vencedor = verificaJogo();
                if(vencedor == j1.letra || vencedor == j2.letra) // Ja temos um vencedor
                    break;
            }            
        }
        if(vencedor == jogador1.letra)
            jogador1.vitorias++;
        else
            if(vencedor == jogador2.letra)
                jogador2.vitorias++;
            else
                velha.vitorias++;
    }
}
