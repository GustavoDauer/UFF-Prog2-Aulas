/*
 * Classe que cria polinomios
 *
 * @autor M. Vítor Carmezim
 */
public class Polinomio {

  public int[] itIndiceCoeficiente;
  protected static String stSinais="";

  /*
   * Método construtor
   */
  public Polinomio(String stPolinomio){
    _arquivaSinais(stPolinomio);
    String[] arFatores = stPolinomio.split("[+|-]");
    int itGrau = _capturaGrauPolinomio(arFatores[0]);
    _arquivaIndiceCoeficientes(arFatores, itGrau);
  }

  /*
   * Verifica e armazena os índices e coeficientes do polinomio
   *
   * @param String[] arFatores -> Os fatores do polinomio desejado
   * @param int itGrauPolinomio -> O grau do polinomio desejado (o maior índice)
   *
   * @return VOID
   */
  private void _arquivaIndiceCoeficientes(String[] arFatores, int itGrauPolinomio){
    this.itIndiceCoeficiente = new int[itGrauPolinomio+1];
    String[] arIterator;
    int itCoef, itExp;
    for(int i=0; i<arFatores.length; i++){
      arIterator = arFatores[i].toLowerCase().split("x=>");
      if(arIterator.length != 2)  continue;
      itCoef = Integer.parseInt(arIterator[0].toString().trim());
      itExp = Integer.parseInt(arIterator[1].toString().trim());
      this.itIndiceCoeficiente[ itExp ] = itCoef;
    }
  }

  /*
   * Método que verifica o grau do polinomio
   *
   * @param String stFator1 -> Primeiro fator do polinomio
   *
   * @return int
   */
  private static int _capturaGrauPolinomio(String stFator1){
    String[] arCoeficientes = stFator1.toLowerCase().split("x=>");
    if(arCoeficientes.length == 0)
      return 0;
    else if(arCoeficientes.length == 2)
      return Integer.parseInt(arCoeficientes[1].trim());
    else
      return 0;
  }

  /*
   * Método que armazena na classe a ordem dos sinais do polinomio
   *
   * @param String stPolinomio -> Polinomio desejado
   *
   * @return VOID
   */
  private static void _arquivaSinais(String stPolinomio){
    for(int i=0; i<stPolinomio.length(); i++){
      if(stPolinomio.charAt(i) == '+' || stPolinomio.charAt(i) == '-'){
        stSinais += stPolinomio.charAt(i);
      }
    }
  }

  /*
   * Método toString convencional
   */
  @Override
  public String toString(){
    String stReturn = "";
    for(int i=this.itIndiceCoeficiente.length-1, itSinalIndice=0; i>=0; i--){
      if(this.itIndiceCoeficiente[i] != 0){
        stReturn += itIndiceCoeficiente[i] + "x=>" + i ;//+ stSinais.charAt(itSinalIndice);
        if(stSinais.length()-1>=itSinalIndice){
          stReturn += " " + stSinais.charAt(itSinalIndice) + " ";
          itSinalIndice++;
        }
      }
    }
    return stReturn;
  }

}