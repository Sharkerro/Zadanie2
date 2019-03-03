public class Circle extends  Figure implements Print {
    public double r;
     public  double  pi=3.14;
public Circle (double r)
{
    this.r=r;

}
    @Override
    public double calculateArea() {
        return pi*r*r;
    }

    @Override
    public double calculatePerimeter() {
        return 2*pi*r;
    }

    @Override
    public void print() {

        System.out.println("Circle with dimensions:"+" "+"Radius R:"+r);

        System.out.println("The Circle Area is:"+ calculateArea());

        System.out.println("The Circle Perimeter is:"+ calculatePerimeter());

    }
}
