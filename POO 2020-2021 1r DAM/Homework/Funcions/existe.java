package Funcions;

public class existe{
public static boolean igual(int vector[], int x){

  boolean existe = false;

  for (int i = 0; i < vector.length; i++)
  {
    if(vector[i] == x)
    {
      existe = true;
    }
  }
  return existe;

}
}
