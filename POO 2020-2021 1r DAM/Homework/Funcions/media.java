package Funcions;

public class media{
  public static double mitja(int vector[]){

    int mitja = 0;

    for (int i = 0; i < vector.length; i++)
    {
      mitja += vector[i];
    }
    return mitja;
  }
}
