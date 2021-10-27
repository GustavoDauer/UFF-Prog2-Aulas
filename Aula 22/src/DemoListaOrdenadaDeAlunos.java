/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class DemoListaOrdenadaDeAlunos extends ListaOrdenada {
    public static void main(String args[]) {
        ListaOrdenadaDeAlunos lis = new ListaOrdenadaDeAlunos();
        lis.insere(new Aluno("Chico", "1", 18));
        lis.insere(new Aluno("Maria", "2", 19));
        lis.insere(new Aluno("Jose", "3", 20));
        lis.incializaCursor();
        Aluno a = (Aluno) lis.consultar("Chico");
        while(a != null) {
            System.out.println(a.nome);
            lis.avancaCursor();
            a = (Aluno) lis.consultar(a);
        }
    }

    @Override
    boolean menor(Object x, Object y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
