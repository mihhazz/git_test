package triangle;

public class TriangleInit {

	
public static void main (String[] args) {
	
Point pointOne = new Point(1,1);

 
Point pointTwo = new Point(4,3);


Point pointThree = new Point(1,5);	
	

	
Triangle T = new Triangle(pointOne, pointTwo, pointThree );    

if (T.check())   {
	
//���������� �������
 
System.out.println("������� ������������ =   "+ T.calc()  + "  �������� ������");		
}
	
}	
}