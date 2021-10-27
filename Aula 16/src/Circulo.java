/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Circulo implements ObjetoGeometrico {
    Ponto2D central;
    double raio;
    public Circulo(int a, int b, double r) {
        central = new Ponto2D(a, b);
        raio = r;
    }
    public Ponto2D centro() {
        return central;
    }
    public double calculaArea() {
        return (Math.PI * raio * raio);
    }
    public double calculaPerimetro() {
        return (2 * Math.PI * raio);
    }
}
