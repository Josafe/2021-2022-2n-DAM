package POO.Constructors;
public class Rectangle_UD8{

public static void main (String[] args)
{
Rectangle rectangle1 = new Rectangle(1,3,0,2);
Rectangle rectangle2 = new Rectangle(5,8,6,9);


System.out.println("Coordenades del rectangle 1 (" + rectangle1.x1 + "," + rectangle1.y1 + ") y (" +  rectangle1.x2 + "," + rectangle1.y2 + ")");
System.out.println("Coordenades del rectangle 2 (" + rectangle2.x1 + "," + rectangle2.y1 + ") y (" +  rectangle2.x2 + "," + rectangle2.y2 + ")");


/*JAUME HA VALORAT POSITIVAMENT QUE DOMINE ESTOS CONEIXEMENTS.
int vector[][];
vector = new int[10][10];

rectangle1.x1 = 1;
rectangle1.y1 = 1;
rectangle2.x2 = 2;
rectangle2.y2 = 2;

for (int i = 0; i < vector.length; i++)
{
  for (int j = 0; j < vector[i].length; j++)
  {
    vector[0][0] = rectangle1.x1;
    vector[5][5] = rectangle1.y1;

    vector[7][9] = rectangle2.x2;
    vector[2][3] = rectangle2.y2;

    System.out.print(vector[i][j]);
    System.out.print(" ");
  }
  System.out.println("");
}
*/
}
}
