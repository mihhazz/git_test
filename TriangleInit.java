package triangle;

public class TriangleInit {

	
public static void main (String[] args) {
	
Point pointOne = new Point(1,1);

 
Point pointTwo = new Point(6,1);


Point pointThree = new Point(3,3);	
	

	
Triangle t = new Triangle(pointOne, pointTwo, pointThree );    

if (t.check())   {
	
//вычисление площади
 
System.out.println("площадь треугольника =   "+ t.calc()  + "  условных единиц");		
}
	
}	
}