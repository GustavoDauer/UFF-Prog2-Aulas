
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class EncontrarCaminhos {
    public static void mostra(char[][] m) {
        String r = "";
        for(int i=0; i<m.length; i++)
            for(int j=0; j<m[i].length; j++) {
                r += m[i][j] + "     ";
                if(j == m.length - 1)
                    r += "\n";
            }
        JOptionPane.showMessageDialog(null, r);
    }
    public static void encontraCaminhos(char[][] m) {
        boolean solucao = false;
        for(int i=0; i<m.length; i++)
            for(int j=0; j<m[i].length; j++) {
                if(m[i][j] == ' ') {
                    if(i+1 < m.length)
                        if(m[i+1][j] == ' ' || m[i+1][j] == 'O')
                            m[i][j] = 'O';
                    if(j+1 < m[i].length)
                        if(m[i][j+1] == ' ' || m[i][j+1] == 'O')
                            m[i][j] = 'O';
                }
                if(j == m[i].length - 1)
                    if(m[i][j] == 'O')
                        solucao = true;
            }
        if(solucao = true)
            JOptionPane.showMessageDialog(null, "Caminho encontrado");
        else
            JOptionPane.showMessageDialog(null, "Sem caminho");
    }
    public static void gera(char[][] m) {                
        m = new char[5][5];        
    }
    public static void main(String[] args) {
        char[][] mapa = {
            { ' ', 'X', ' ', ' ', ' ' },
            { ' ', 'X', ' ', 'X', 'X' },
            { ' ', 'X', ' ', 'X', 'X' },
            { ' ', 'X', ' ', 'X', 'X' },
            { ' ', ' ', ' ', 'X', ' ' }
        };
        //gera(mapa);
        mostra(mapa);
        encontraCaminhos(mapa);
        mostra(mapa);
    }
}
