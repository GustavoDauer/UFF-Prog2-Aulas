/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class DemoArvoreOrdenadaDeAlunos {
    public static void main(String args[]) {
        ArvoreOrdenadaDeAlunos arv = new ArvoreOrdenadaDeAlunos();
        arv.inserir(new Aluno("Gustavo", "7", 22));
        arv.inserir(new Aluno("Gustavo", "7", 22));
        System.out.println(arv);
    }
}
