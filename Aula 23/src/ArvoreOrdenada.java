/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
abstract class ArvoreOrdenada {
    abstract public boolean menor(Object x, Object y);
        int total;
        NoBin raiz;
    public ArvoreOrdenada() {
        raiz = null;
        total = 0;
    }
    public boolean inserir(Object novo) {
        if(total == 0)
            raiz = new NoBin(novo);
        else
            coloca(novo, raiz);
        total++;
        return true;
    }

    private void coloca(Object n, NoBin pont) {
        if(menor(n, pont.info))
            if(pont.esq == null)
                pont.esq = new NoBin(n);
            else
                coloca(n, pont.esq);            
        else
            if(pont.dir == null)
                pont.dir = new NoBin(n);
            else
                coloca(n, pont.dir);            
    }
    @Override
    public String toString() {
        return toStringEmOrdem(raiz);
    }
    public String toStringEmOrdem(NoBin r) {
        if(r == null)
            return "";
        else
            return toStringEmOrdem(r.esq) + r.info.toString() + toStringEmOrdem(r.dir);
    }
}
