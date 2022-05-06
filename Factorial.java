package factorials ;




public  class Factorial {
	
	public int result= 2;
		public Factorial(int factor) {
				if (factor == 1) {
				result = 1; 
				}
				else 
					for (int i = 1 ; i<=factor; i++)  
					result = result * i;	
				
				System.out.println("factorial = "  +result);
				}
				

	
	
	}	
	
	


