package triangle;

	public  class Triangle {
		public Point one;
		public Point two;
		public Point three;



	public Triangle(Point pointOne, Point pointTwo, Point pointThree) { 

		one =  pointOne;
		two = pointTwo;
		three = pointThree;

		System.out.println("передал  "); 

	}

	public boolean check() {
	
	
		if ( one.x == one.y && two.x == two.y && three.x ==three.y ||  one.x == two.x && two.x == three.x 
		||  one.y == two.y && two.y == three.y  || one.x == 0 && one.y ==0 || 
		two.x == 0 && two.y ==0  || three.x == 0 && three.y ==0 ) {	
	
 

	
	System.out.println("Straight line! This is not triangle!  ");
	return  false;
	} else 
	return  true; 
	}

	public double calc () {
		double a, a1, b1, c1 , a2, b2, c2, p;
		a1 = three.x - one.x;
		b1 = three.y - one.y;	
		c1 = Math.sqrt(a1*a1 + b1*b1);
		
		a2 = two.x - three.x;
		b2 = three.y - two.y;
		c2 = Math.sqrt(a2*a2 + b2*b2);
		
		a = two.x - one.x;
		p = ( a + c1 + c2) / 2;
		 
		return Math.sqrt(p*(p-a)*(p-c1)*(p-c2));
	
	}


}