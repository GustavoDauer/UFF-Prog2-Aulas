/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class ArvoreOrdenadaDeAlunos extends ArvoreOrdenada {
    public boolean menor(Object x, Object y) {
        Aluno aX = (Aluno) x;
        Aluno aY = (Aluno) y;
        return aX.nome.compareTo(aY.nome) < 0;
    }
}
