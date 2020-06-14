public class matriz{
  public static void main(String[] args){
    int matriz[][]= new int[9][9];
    for(int i=0;i<matriz.length;i++){
      for(int j=0;j<matriz[0].length;j++){
        matriz[i][j]=generaNumAleatorio(0,9);
        System.out.print(matriz[i][j]+" ");
      }
      System.out.println("");
    }
  }
  public static int generaNumAleatorio(int minimo, int maximo){
  return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
  }
}
