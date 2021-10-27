/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Tabuleiro {

    char[][] t;

    public Tabuleiro(int tamanho) {
        t = new char[tamanho][tamanho];
        for(int i=0; i<t.length; i++)
            for(int j=0; j<t.length; j++)
                t[i][j] = ' ';
    }
    public char[] pegaLinha(int x) {
        char[] r = new char[t.length];
        for(int i=0; i<t.length; i++)
            r[i] = t[x][i];
        return r;
    }
    public char[] pegaColuna(int x) {
        char[] r = new char[t.length];
        for(int i=0; i<t.length; i++)
            r[i] = t[i][x];
        return r;
    }
    public char[] pegaDiagonalPrincipal() {
        char[] r = new char[t.length];
        for(int i=0; i<t.length; i++)
            r[i] = t[i][i];
        return r;
    }
    public char[] pegaDiagonalSecundaria() {
        char[] r = new char[t.length];
        for(int i=t.length-1; i>=0; i--)
            r[i] = t[i][i];
        return r;
    }
    @Override
    public String toString() {
        String r = "";
        for(int i=0; i<t.length; i++)
            for(int j=0; j< t[i].length; j++) {
                r += t[i][j] + "     ";
                if(j == t.length - 1)
                    r += "\n\n";
            }
        return r;
    }
}
