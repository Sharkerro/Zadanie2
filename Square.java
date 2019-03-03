public class Square extends Figure implements Print {
    public double a;
    public Square(double a)
    {
        this.a=a;
    }

    @Override
    public double calculatePerimeter() {
        return 4*a;
    }

    @Override
    public double calculateArea() {
        return a*a;
    }

    @Override
    public void print() {

        System.out.println("Square with dimensions:"+" "+" Side A:"+a);

        System.out.println("The Square Area is:"+ calculateArea());

        System.out.println("The Square Perimeter is:"+ calculatePerimeter());
    }
}
