
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class DemoAgregadosDeOca {
    public static void main(String args[]) {
        AgregadosDeOca vetor;
        vetor = new AgregadosDeOca(10);
        JOptionPane.showMessageDialog(null, vetor);
        vetor.insere(new Oca());
        JOptionPane.showMessageDialog(null, vetor);
        vetor.insere(new Oca());
        JOptionPane.showMessageDialog(null, vetor);
        Multa m = new Multa(7, 250, "25-02-1988", "KZV-6882", "Velocidade máxima");
        JOptionPane.showMessageDialog(null, m);
    }
}
