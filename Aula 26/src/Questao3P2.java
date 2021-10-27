
import javax.swing.JOptionPane;

 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Questao3P2 {
    public static No constroi(int totalDeProdutos) {
        if(totalDeProdutos == 0)
            return null;
        else {
            No inicio = new No(new Produto((int)(20 * Math.random()), 100 * Math.random(), 100 * Math.random()));
            No antes;
            for(int i=2; i<= totalDeProdutos; i++) {
                antes = new No(new Produto((int)(20 * Math.random()), (int)(100 * Math.random()), (int)(100 * Math.random())));
                antes.prox = inicio;
                inicio = antes;
            }
            return inicio;
        }
    }    
    public static void troca(No l, Produto atual, Produto sucessor) {        
        l.info = sucessor;
        l.prox.info = atual;
    }
    public static void ordenaPorCodigo(No lista) {
        boolean ordenado = false;
        Produto atual, sucessor;
        atual = lista.info;
        sucessor = lista.prox.info;
        if(atual.cod > sucessor.cod) {
            troca(lista, atual, sucessor);
            ordenado = false;
        }
        else {
            ordenaPorCodigo(lista.prox);
            if(sucessor == null)
                ordenado = true;
        }
        if(!ordenado)
            ordenaPorCodigo(lista.prox);
    }
    public static void ordenaPorQuantidade(No lista) {
    }
    public static void mostra(No lista) {
        String r = "";
        if(lista != null) {
            No aux = lista;
            while(aux != null) {
                r += aux.info + "\n";
                aux = aux.prox;
            }
        }
        JOptionPane.showMessageDialog(null, r, "Produtos", 2);
    }
    public static void main(String args[]) {
        No n = constroi(5);
        mostra(n);
        ordenaPorCodigo(n);
        mostra(n);
    }
}
