package Getter_Setter;
public class Rectangle_UD8{

public static void main (String[] args)
{
Rectangle rectangle1 = new Rectangle(1,3,1,4);
Rectangle rectangle2 = new Rectangle(5,8,6,9);


System.out.println("Coordenades del rectangle 1 (" + rectangle1.getx1() + "," + rectangle1.gety1() + ") y (" +  rectangle1.getx2() + "," + rectangle1.gety2() + ")");
System.out.println("Coordenades del rectangle 2 (" + rectangle2.getx1() + "," + rectangle2.gety1() + ") y (" +  rectangle2.getx2() + "," + rectangle2.gety2() + ")");

Rectangle rectangle3 = new Rectangle(5,7,6,9);
Rectangle rectangle4 = new Rectangle(5,8,6,9);

rectangle3.setx1(4);
rectangle3.setx2(9);
rectangle3.sety1(3);
rectangle3.sety2(2);

rectangle4.setx1(5);
rectangle4.sety1(8);
rectangle4.setx2(9);
rectangle4.sety2(14);



System.out.println("Coordenades del rectangle 3 (" + rectangle3.getx1() + "," + rectangle3.gety1() + ") y (" +  rectangle3.getx2() + "," + rectangle3.gety2() + ")");
System.out.println("Coordenades del rectangle 4 (" + rectangle4.getx1() + "," + rectangle4.gety1() + ") y (" +  rectangle4.getx2() + "," + rectangle4.gety2() + ")");


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
