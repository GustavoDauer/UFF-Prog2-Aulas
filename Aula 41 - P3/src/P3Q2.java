
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class P3Q2 {
    public static Lista constroi(String nomeArq) {
        Lista resp = null;
        try {
            ObjectInputStream a = new ObjectInputStream(new FileInputStream(nomeArq));
            Jogo j = (Jogo) a.readObject();
            resp = new Lista(j.timeA);
            resp.adiciona(new Lista(j.timeB));            
            while(true) {
                j = (Jogo) a.readObject();
                Lista tA = new Lista(j.timeA);
                Lista tB = new Lista(j.timeB);                                
                if(j.golsA == j.golsB) {
                    tA.pontos++;
                    tB.pontos++;
                }
                else
                    if(j.golsA > j.golsB)
                        tA.pontos += 3;
                    else
                        tB.pontos += 3;
                System.out.println(j.timeA + " " + j.golsA + " x " + j.golsB + " " + j.timeB);
                resp.adiciona(tA);
                resp.adiciona(tB);
            }                        
        } catch(EOFException e) {
            return resp;
        } catch(Exception e) {
            return null;
        }        
    }
    public static String sorteado(String[] t) {
        String s, aux = "";
        String[] nt;
        int total = t.length;
        int n = (int) (total * Math.random());
        s = t[n];
        for(int i=0; i<t.length; i++) {
            if(!t[i].equals(s))
                aux += t[i];
            if(i != t.length - 1)
                aux += "&";
        }
        nt = aux.split("&");
        t = nt;
        return s;
    }
    public static void geraJogos(String nomeArq) {
        try {
            ObjectOutputStream a = new ObjectOutputStream(new FileOutputStream(nomeArq));
            String[] times = {
                "Brasil",
                "Argentina",
                "Alemanha",
                "Itália",
                "Inglaterra",
                "Espanha",
                "Holanda",
                "África do sul",
                "Gana",
                "Costa do marfim",
                "Camarões",
                "Nigéria",
                "Uruguai",
                "Paraguai",
                "Chile",
                "Estados Unidos",
                "Austrália"
            };
            int t = 5;
            while(t > 0) {
                int gA = (int) (5 * Math.random());
                int gB = (int) (5 * Math.random());
                Jogo j = new Jogo(sorteado(times), sorteado(times), gA, gB);
                a.writeObject(j);
                t--;
            }
        } catch(Exception e) {
        }
    }
    public static void mostra(Lista l) {
        if(l == null)
            System.out.println("Vazia");
        while(l != null) {
            System.out.println(l.nome + " " + l.pontos);
            l = l.prox;
        }
    }
    public static void main(String[] args) {
        String n = "jogos";
        Lista l;
        geraJogos(n);
        l = constroi(n);
        mostra(l);
    }
}
