/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Lista {
    public String nome;
    public int pontos;
    public Lista prox;
    public Lista(String n) {
        nome = n;
        pontos = 0;
        prox = null;
    }
    public Lista(String n, Lista l) {
        nome = n;
        pontos = 0;
        prox = l;
    }
    public void adiciona(Lista l) {
        if(this.prox == null)
            this.prox = l;
        else
            this.prox.adiciona(l);
    }
    public void remove(Lista l) {
        if(this == l) {
            if(this.prox != null) {
                this.nome = this.prox.nome;
                this.pontos = this.prox.pontos;
                this.prox = this.prox.prox;
            }
            else {
                this.nome = null;
                this.pontos = 0;
                this.prox = null;
            }
        }
        else
            if(this.prox != null)
                this.prox.remove(l);                            
    }
    public Lista removeRepeticoes(Lista l) {
        Lista aux = l;
        if(l != null) {
            aux = aux.prox;
            if(aux != null)
                aux.remove(l);
        }
        return l = removeRepeticoes(l.prox);
    }
    @Override
    public String toString() {
        if(prox != null)
            return nome + " " + pontos + "\n" + prox;
        else
            return nome + " " + pontos + "\n";
    }
}
