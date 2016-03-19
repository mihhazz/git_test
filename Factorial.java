package factorials;

public  class Factorial {
	
public int result= 1;

public int calc(int factor) {
	for (int i = 1 ; i<=factor; i++)  {
	result = result * i;	
	}
	return result;
	
	
	}	
	
	
}