package Question3;

	class Rectangle extends Shape
	{
	     private double length,breadth;
	      //provide parameterized constructor
	      Rectangle(double length,double breadth)
	      {
	          this.length=length;
	          this.breadth=breadth;
	      }
	     // override area() ;
	     @Override double area()
	     {
	         return length*breadth;
	     }
	     
}
