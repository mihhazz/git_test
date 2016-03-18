package triangle;

public  class Triangl {
	
public int square = 0;


public boolean TriangleCheck (Point pointOne, Point pointTwo, Point pointThree ) {

// проверка условий 



if ( pointOne.x == pointOne.y && pointTwo.x == pointTwo.y && pointThree.x ==pointThree.y ||  pointOne.x == pointTwo.x && pointTwo.x == pointThree.x 
||  pointOne.y == pointTwo.y && pointTwo.y == pointThree.y  || pointOne.x == 0 && pointOne.y ==0 || 
 pointTwo.x == 0 && pointTwo.y ==0  || pointThree.x == 0 && pointThree.y ==0 ) {	
	
 

	
 System.out.println("Прямая линия либо введены нулевые координаты! Это не треугольник.  ");
 
 return false;
 }		


	
}
public  int   TriangleCalc (int a, int h) {
	
  square = a*h/2;
  
return square;
	
		
	
}

      
   }


//**/ площадь   
// double square = ((pointTwo.y - pointOne.y) * (pointThree.x - pointOne.x)) / 2;    
   

   	
	
	
	
	
	
	
	
	
