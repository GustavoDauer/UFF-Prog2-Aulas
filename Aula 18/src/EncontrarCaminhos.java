
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
    static char[][] lab = {
        {'b', '*', 'b', 'b', '*', 'b', 'b', 'b'},
        {'b', '*', 'b', 'b', '*', 'b', 'b', 'b'},
        {'b', 'b', 'b', 'b', 'b', 'b', ' ', 'b'},
        {'b', '*', '*', '*', '*', 'b', '*', '*'},
        {'b', 'b', 'b', 'b', '*', 'b', 'b', 'b'},
        {'b', '*', 'b', 'b', '*', 'b', 'b', 'b'},
        {'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'},
    };
    public static void apresentar(char[][] l) {
        String r = "";
        for(int i=0; i<l.length; i++)
            for(int j=0; j<l.length; j++) {
                r += l[i][j] + " ";
                if(j == l.length - 1)
                    r += "\n";
            }
        //JOptionPane.showMessageDialog(null, r);
        System.out.println(r);
    }
    public static void encontraTodosOsCaminhos(int ox, int oy, int dx, int dy, char[][] l) {
        l[ox][oy] = '0';
        if(ox == dx && oy == dy) {
            JOptionPane.showMessageDialog(null, "Caminho encontrado");
            apresentar(l);
        }
        else {
            for(int x=ox-1; x<=ox+1; x++)
                for(int y=oy-1; y<oy+1; y++)
                    if((x >= 0) && (x < l.length) && (y >= 0) && (y < l[0].length) && (l[x][y] == 'b'))
                        encontraTodosOsCaminhos(x, y, dx, dy, l);            
        }
        l[ox][oy] = 'b';
    }
    public static String caminhoEscolhido(int x0, int y0, int xd, int yd, char[][] l, String atual) {
        l[x0][y0] = '0';
        apresentar(l);
        String r = "";
        if(x0 == xd && y0 == yd) {
            r = JOptionPane.showInputDialog(("Satisfeito com ("+ x0 + "," + y0 + ")" + atual));
            if(r.equals("sim"))
                r = "(" + x0 + ", " + y0 + ")" + atual;
            else
                r = "";
        }
        else {
            for(int x=x0-1; x<=x0+1; x++)
                for(int y=y0-1; y<y0+1; y++)
                    if((x >= 0) && (x < l.length) && (y >= 0) && (y < l[0].length) && (l[x][y] == 'b'))
                        r = caminhoEscolhido(x0, y0, xd, yd, l, atual + "(" + x0 + ", " + y0 + ")");
        }
        return r;
    }
    public static void main(String args[]) {
        apresentar(lab);
        encontraTodosOsCaminhos(0, 0, 6, 7, lab);
    }
}
