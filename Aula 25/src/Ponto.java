/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Ponto {
    private int centroX, centroY, raio;
    public Ponto(int x, int y, int r) {
        centroX = x;
        centroY = y;
        raio = r;
    }
    public int pegaX() {
        return centroX;
    }
    public int pegaY() {
        return centroY;
    }
    public int pegaR() {
        return raio;
    }
    public void deslocaDir() {
        centroX++;
    }
    public void deslocaEsq() {
        centroX--;
    }
    public void deslocaCima() {
        centroY--;
    }
    public void deslocaBaixo() {
        centroY++;
    }
    public void crescRaio() {
        raio++;
    }
    public void diminuiRaio() {
        raio--;
    }
}
