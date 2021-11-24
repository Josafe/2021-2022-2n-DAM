package Funcions;


public class mayores{
public static int gran(int vector, int x)
{

  int majors = 0;

  for (int i = 0; i < vector.length; i++)
  {
  if (vector[i] >= x)
  {
    majors++;

  }
  }
  return majors;

}
}
