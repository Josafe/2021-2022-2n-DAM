public class Rectangle_UD8{

int x1;
int y1;
int x2;
int y2;

public static void main (String[] args)
{
Rectangle rectangle1 = new Rectangle();
Rectangle rectangle2 = new Rectangle();

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
}
}
