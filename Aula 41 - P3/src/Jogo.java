
import java.io.Serializable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Jogo implements Serializable {
    public String timeA, timeB;
    public int golsA, golsB;
    public Jogo(String a, String b, int gA, int gB) {
        timeA = a;
        timeB = b;
        golsA = gA;
        golsB = gB;
    }
}
