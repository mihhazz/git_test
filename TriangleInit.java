package triangle;

public class TriangleInit {

	
public static void main (String[] args) {
	
Point pointOne = new Point(1,1);

 
Point pointTwo = new Point(4,3);


Point pointThree = new Point(1,5);	
	
// проверка условий

if ( pointOne.x == pointOne.y && pointTwo.x == pointTwo.y && pointThree.x ==pointThree.y ||  pointOne.x == pointTwo.x && pointTwo.x == pointThree.x 
||  pointOne.y == pointTwo.y && pointTwo.y == pointThree.y  || pointOne.x == 0 && pointOne.y ==0 || 
 pointTwo.x == 0 && pointTwo.y ==0  || pointThree.x == 0 && pointThree.y ==0 ) {	
	
 

	
 System.out.println("Ïðÿìàÿ ëèíèÿ ëèáî ââåäåíû íóëåâûå êîîðäèíàòû! Ýòî íå òðåóãîëüíèê.  ");
 
 
 }	
	


	
	

//вычисление площади 
int h=0;
int dlina = 0;
int result =0;

h = pointTwo.x - pointOne.x;
dlina = pointThree.y - pointOne.y;


result = Square.squareCalc(dlina,h);
 
System.out.println("Ïëîùàäü òðåóãîëüíèêà =   "+ result  + "  óñëîâíûõ åäèíèö");		
}
	
}	
