/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
import java.io.Serializable;    	
public class Ponto implements Serializable {
    private int centroX, centroY, raio;
    public Ponto(int x, int y, int r){
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
    public static void salvar(String nomeDoArquivo, int quantidadeDePontos) {
        //que gera um arquivo serializ疱el, cujo nome nomeDoArquivo, de quantidadeDePontos
        // pontos com valores x, y e raio aleatios, entre 0 e 499
    }
    public static void mostrar(String nomeDoArquivo){
        //que mostra na tela o conte棈o do arquivo serializ疱el, cujo nome   nomeDoArquivo.
    }
}
