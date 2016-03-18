package triangle;
import triangle.*;  // думаю что это лишнее
public  class TriangleCheck {
	
// проверка условий конструктором

 class TriangleCheck (Point pointOne, Point pointTwo, Point pointThree ) 
 {

 
if ( pointOne.x == pointOne.y && pointTwo.x == pointTwo.y && pointThree.x ==pointThree.y ||  pointOne.x == pointTwo.x && pointTwo.x == pointThree.x 
||  pointOne.y == pointTwo.y && pointTwo.y == pointThree.y  || pointOne.x == 0 && pointOne.y ==0 || 
 pointTwo.x == 0 && pointTwo.y ==0  || pointThree.x == 0 && pointThree.y ==0 ) {	
	
 

	
 System.out.println("Прямая линия либо введены нулевые координаты! Это не треугольник.  ");
 
    }		
   }
}