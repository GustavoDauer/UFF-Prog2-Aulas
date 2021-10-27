

/*
 * Classe projetora de Polinomios
 *
 * @autor M. Vítor Carmezim
 */
public class DemoPolinomio extends Utils {

    /*
     * Método principal de execução
     *
     * @param String[] args -> Argumentos //Não utilizados
     *
     * @return VOID
     */
    public static void main(String[] args) {
        Polinomio poPolinomio = new Polinomio( "8x=>10 - 2x=>5 + 4x=>3 - 3x=>2 + 2x=>1" );
        echo(poPolinomio);
    }

}
