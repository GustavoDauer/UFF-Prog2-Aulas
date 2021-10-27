

/*
 *  Classe utilizada como auxiliadora para métodos repetitivos
 *
 *  @autor M. Vítor Carmezim
 */
public abstract class Utils {

  /*
   * Método para printar um vetor de inteiros qualquer
   *
   * @param int[] arInt -> Vetor de inteiros
   *
   * @return VOID
   */
  public static void printIntArray(int[] arInt){
    for(int i=0; i<arInt.length; i++){
      System.out.println(
        i + " -> " + arInt[i]
      );
    }
    System.out.println("\n");
  }

  /*
   * Método que printa um Object qqr
   *
   * @param Object objHandle - Objeto desejado
   *
   * @return VOID
   */
  public static void echo(Object objHandle){
    System.out.println(objHandle);
  }

}
