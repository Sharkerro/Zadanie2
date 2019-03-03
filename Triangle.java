public class Triangle extends Figure implements Print {
  public double a,b,c,h;
   public Triangle( double a,double b,double c,double h)
   {

       this.a=a;
       this.b=b;
       this.c=c;
       this.h=h;

   }
   @Override
   public double calculateArea() {
    return ((h*a)/2);

   }

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }

    @Override
    public void print()
   {
       System.out.println("Triangle with dimensions:"+" "+"Side A:"+a+" "+"Side B"+b+" "+"Side C"+c+" "+"Height"+h);

       System.out.println("The triangle Area is:"+ calculateArea());

       System.out.println("The triangle Perimeter is:"+ calculatePerimeter());
   }
}
