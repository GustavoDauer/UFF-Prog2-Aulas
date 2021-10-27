/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Aula40.Principal;
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

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void daPedraDeValor1Para1Pirata() {
        int[] pedras = {1};
        int qtdPiratas = 1;
        String resp = Principal.dividePedrasParaPiratas(pedras, qtdPiratas);
        assertEquals("{1}", resp);

    }

    @Test
    public void testa1Pirata1Pedra() {
        int[] pedras = {2};
        int qtdPiratas = 1;
        String resp = Principal.dividePedrasParaPiratas(pedras, qtdPiratas);
        assertEquals("{2}", resp);

    }

    @Test
    public void testa2Pirata1Pedra() {
        int[] pedras = {2};
        int qtdPiratas = 2;
        String resp = Principal.dividePedrasParaPiratas(pedras, qtdPiratas);
        assertEquals("Nao e possivel dividir", resp);

    }

    @Test
    public void testa3Pedras1Pirata() {
        int[] pedras = {1, 1, 1};
        int qtdPiratas = 1;
        String resp = Principal.dividePedrasParaPiratas(pedras, qtdPiratas);
        assertEquals("{1,1,1}", resp);
    }

    @Test
    public void testa2PedrasComValoresDiferentesPara2Piratas() {
        int[] pedras = {1, 2};
        int qtdPiratas = 2;
        String resp = Principal.dividePedrasParaPiratas(pedras, qtdPiratas);
        assertEquals("Nao e possivel dividir", resp);
    }

    @Test
    public void testa2Pedras2Piratas() {
        int[] pedras = {1, 1};
        int qtdPiratas = 2;
        String resp = Principal.dividePedrasParaPiratas(pedras, qtdPiratas);
        assertEquals("{{1},{1}}", resp);
    }

    @Test
    public void divideTresPedrasDeValoresDiferentesParaDoisPiratasComSucessoPorqueSomaDasPedrasEhDivisivelPeloNumeroDePiratasConcidentemente() {
        int[] pedras = {1, 2, 3};
        int qtdPiratas = 2;
        String resp = Principal.dividePedrasParaPiratas(pedras, qtdPiratas);
        assertEquals("{{1,2},{3}}", resp);
    }

    @Test
    public void divideTresPedrasDeValoresDiferentesDesordenadasParaDoisPiratasComSucessoPorqueSomaDasPedrasEhDivisivelPeloNumeroDePiratasConcidentemente() {
        int[] pedras = {1, 3, 2};
        int qtdPiratas = 2;
        String resp = Principal.dividePedrasParaPiratas(pedras, qtdPiratas);
        assertEquals("{{1,2},{3}}", resp);
    }

    @Test
    public void divideTresPedrasDeValoresDiferentesParaTresPiratasSemSucesso() {
        int[] pedras = {1, 2, 3};
        int qtdPiratas = 3;
        String resp = Principal.dividePedrasParaPiratas(pedras, qtdPiratas);
        assertEquals("Nao e possivel dividir", resp);
    }

    @Test
    public void divideQuatroPedrasParaTresPiratasComSucesso() {
        int[] pedras = {2, 2, 4, 4};
        int qtdPiratas = 3;
        String resp = Principal.dividePedrasParaPiratas(pedras, qtdPiratas);
        assertEquals("{{2,2},{4},{4}}", resp);
    }
//==============================================================================
//    @Test
//    public void dividePedrasParaPiratasComSucesso() {
//        int[] pedras = {2, 4, 2, 4, 6};
//        int qtdPiratas = 3;
//        String resp = Principal.dividePedrasParaPiratas(pedras, qtdPiratas);
//        assertEquals("{{2,4},{2,4},{6}}", resp);
//    }
}
