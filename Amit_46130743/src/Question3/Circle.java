package Question3;
class Circle extends Shape
{
       private double radius;
       Circle(double radius)
       {
           this.radius=radius;
       }
       //provide parameterized constructor.
      //override  area() ;
      @Override double area()
      {
          return 3.14*radius*radius;
      }
}