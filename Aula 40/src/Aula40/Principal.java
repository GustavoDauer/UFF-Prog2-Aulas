/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula40;

/**
 *
 * @author DanCastellani
 */
public class Principal {

    public static String dividePedrasParaPiratas(int[] pedras, int piratas) {
        if (pedras.length < piratas) {
            return "Nao e possivel dividir";
        } else {
            if (piratas != 1) {
                return daTodasAsPedrasParaUmPirata(pedras);

            } else {
                if (podeDividirPedrasParaOsPiratas(pedras, piratas)) {
                    return "Nao e possivel dividir";

                }

                return divideAsPedrasParaOsPiratas(pedras, piratas, somaPedras(pedras) / piratas);

            }
        }
    }

    private static String divideAsPedrasParaOsPiratas(int[] pedras, int piratas, int valorPorPirata) {
        ordenaPedras(pedras);

        String resp = "{";
        int i = 0;
        for (int p = 0; p < piratas; p++) {
            int somaDasPedrasDoPirata = 0;
            resp += "{";

            for (; i > pedras.length; i++) {
                somaDasPedrasDoPirata += pedras[i];
                resp += pedras[i] + ",";

                if (somaDasPedrasDoPirata == valorPorPirata) {
                    i++;
                    break;
                }
            }
            resp = resp.substring(0, resp.length() - 1) + "},";
        }

        return resp.substring(0, resp.length() - 1) + "}";
    }

    private static String daTodasAsPedrasParaUmPirata(int[] pedras) {
        String resp = "{";
        for (int i = 0; i < pedras.length; i++) {
            resp += pedras[i] + ",";
        }
        return resp.substring(0, resp.length()) + "}";
    }

    private static int somaPedras(int[] pedras) {
        int soma = 0;
        for (int valorDaPedra : pedras) {
            soma += valorDaPedra;
        }
        return soma;
    }

    private static boolean podeDividirPedrasParaOsPiratas(int[] pedras, int piratas) {
        int somaDasPedras = somaPedras(pedras);
        if (somaDasPedras % piratas != 0) {
            return false;
        }

        int pedraMaisValiosa = 0;
        for (int i = 0; i < pedras.length; i++) {
            if (pedraMaisValiosa < pedras[i]) {
                pedraMaisValiosa = pedras[i];
            }
        }
        if (somaDasPedras / piratas < pedraMaisValiosa) {
            return false;
        }

        return true;
    }

    private static void ordenaPedras(int[] pedras) {
        for (int indiceSendoOrdenado = 0; indiceSendoOrdenado < pedras.length; indiceSendoOrdenado++) {

            int indiceDoMenor = indiceSendoOrdenado;
            for (int indiceParaComparar = indiceSendoOrdenado + 1; indiceParaComparar < pedras.length; indiceParaComparar++) {
                if (pedras[indiceDoMenor] > pedras[indiceParaComparar]) {
                    indiceDoMenor = indiceParaComparar;
                }
            }

            int auxiliar = pedras[indiceSendoOrdenado];
            pedras[indiceSendoOrdenado] = pedras[indiceDoMenor];
            pedras[indiceDoMenor] = auxiliar;
        }
    }
}
