package triangle;

public class TriangleInit {

	
public static void main (String[] args) {
	
Point pointOne = new Point(1,1);

 
Point pointTwo = new Point(4,3);


Point pointThree = new Point(1,5);	
	

	
TriangleCheck (pointOne, pointTwo, pointThree);

	
	

//вычисление площади
int h=0;
int dlina = 0;
int result =0;

h = pointTwo.x - pointOne.x;
dlina = pointThree.y - pointOne.y;


result = TriangleArea.TriangleCalc(dlina,h);
 
System.out.println("Площадь треугольника =   "+ result  + "  условных единиц");		
}
	
}	
