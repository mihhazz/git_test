package cubeFunction;
public class CubeFunctionInit {

public static void main (String[] args) {
float result;
int x1=0;
int x2=0;

CubeFunction c = new CubeFunction(5,7,12);
  
 for(String arg : args) {
	 
	x1 = Integer.parseInt(args[0]);  
    x2 = Integer.parseInt(args[1]);
 }
for (int i = x1; i<=x2; i++) {
result = c.calculate(i);
System.out.println("x = "+i +"  y = " + result );
}



}

}
