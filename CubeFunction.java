
package cubeFunction;
public class CubeFunction {
	
public int a, b, c;
public float result;
 
 public CubeFunction(int aa,int bb,int cc) {
	a = aa;
	b = bb;
	c = cc;
  	 
 }
 
  public float calculate(int x) {
	  result = (a*x*x)+(b*x)+c;
	  return result;
  }
	
	
	
}
