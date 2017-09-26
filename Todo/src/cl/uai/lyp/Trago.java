package cl.uai.lyp;

public class Trago {
  
  // cantidad de calorias cada 200 ML
  protected Double calorias200Ml;

  public Trago(){
    this.calorias200Ml= 33d;

  }





  /**
   * Los datos de las calorias son los siguientes:
        AGUA TÓNICA	33.0 KCAL
        CHAMPAÑA/ESPUMANTE 93.3 KCAL
        CERVEZA	100.0 KCAL
        VINO TINTO 109.3 KCAL
        VINO BLANCO 116.0 KCAL
        PISCO 420.0 KCAL
        WHISKY 480.0 KCAL 
        RON 610.0 KCAL
   * 
   **/

  // método que calcula la cantidad de alcohol a tomar para llegar a las calorias
  public Double calculaCantidad(Double calorias) {
    return (calorias * 200)/calorias200Ml;
  }
}