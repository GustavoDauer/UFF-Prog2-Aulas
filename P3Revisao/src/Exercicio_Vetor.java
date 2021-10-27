/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Exercicio_Vetor {

    public static void main(String[] args) {
        int[] v = new int[5];
        gera(v);
        menor(v);
        maior(v);
        proximoMedia(v);
    }

    public static void gera(int[] v) {        
        for(int i=0; i<v.length; i++) {
            v[i] = (int) (100 * Math.random());
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static void menor(int[] v) {
        int menor = v[0];
        for(int i=0; i<v.length; i++)
            if(v[i] < menor)
                menor = v[i];
        System.out.println("Menor: " + menor);
    }

    public static void maior(int[] v) {
        int maior = v[0];
        for(int i=0; i<v.length; i++)
            if(v[i] > maior)
                maior = v[i];
        System.out.println("Maior: " + maior);
    }

    public static void proximoMedia(int[] v) {
        int pMedia = v[0], media = 0;
        for(int i=0; i<v.length; i++)
            media += v[i];
        media /= v.length;
        for(int i=0; i<v.length; i++)
            if(v[i] > pMedia && v[i] < media)
                pMedia = v[i];
        System.out.println("Próximo média: " + pMedia);
    }
}
