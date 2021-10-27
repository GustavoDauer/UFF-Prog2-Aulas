/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Aula39.Main;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DanCastellani
 */
public class Testes {

    public Testes() {
    }

    @Test
    public void testaArquivosVazios() throws Exception {
        String s = Main.lerArquivosTexto("arquivo1", "arquivo2");
        assertEquals("", s);
    }

    @Test
    public void testaArquivoVazioEComUmElemento() throws Exception {
        String s = Main.lerArquivosTexto("arquivo1", "arquivo3");
        assertEquals("1", s);
    }

    @Test
    public void testaArquivoUmElementoEVazio() throws Exception {
        String s = Main.lerArquivosTexto("arquivo3", "arquivo1");
        assertEquals("1", s);
    }
    @Test
    public void testaArquivoIgual() throws Exception {
        String s = Main.lerArquivosTexto("arquivo3", "arquivo4");
        assertEquals("1", s);
    }

    @Test
    public void testaArquivos2Em1E1EmOutro() throws Exception {
        String s = Main.lerArquivosTexto("arquivo4", "arquivo5");
        assertEquals("1 2", s);
    }

    @Test
    public void testaArquivos1Em1E2EmOutro() throws Exception {
        String s = Main.lerArquivosTexto("arquivo5", "arquivo4");
        assertEquals("1 2", s);
    }
    @Test
    public void testaArquivos3Em1E2EmOutro() throws Exception {
        String s = Main.lerArquivosTexto("arquivo6", "arquivo7");
        assertEquals("1 2 3 7", s);
    }


}
