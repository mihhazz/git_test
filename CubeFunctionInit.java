package cubeFunction;
public class CubeFunctionInit {

public static void main (String[] args) {
float result;
CubeFunction c = new CubeFunction(5,7,12);

for (int x=0;x<= 10; x++) {
result = c.calculate(x);
System.out.println("x = "+x +"  total = " + result );
}



}

}