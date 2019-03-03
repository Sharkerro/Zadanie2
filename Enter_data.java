
    import java.io.IOException;
    import java.util.InputMismatchException;

    import java.util.Scanner;
    public class Enter_data {
        int number;
        double a,b,c,h,r;
        double help;
        Scanner scanner=new Scanner(System.in);


        public void triangle()
        {
            System.out.println("Enter data.");
            System.out.println("Enter side a");
              a=error_support(1);

            System.out.println("Enter side b");
            b=error_support(2);
            System.out.println("Enter side c");
            c=error_support(3);
            System.out.println("Enter side h");
            h=error_support(4);



        }

        public void square()
        {
            System.out.println("Enter data.");
            System.out.println("Enter side a");
            a=error_support(1);


        }

        public void circle() {
            System.out.println("Enter data.");
            System.out.println("Enter side r");
            r=error_support(5);

        }
        public Triangle method1()
        {
            Triangle t = new Triangle(a, b, c, h);
            return t;
        }
        public Square method2()
        {
            Square s = new Square(a);
            return s;
        }
        public Circle method3()
        {
            Circle co = new Circle(r);
            return co;
        }

        public double error_support(int number) {

            if (number == 1) {
                try {
                    a = scanner.nextDouble();

                } catch (Exception e) {
                    System.out.println("you gave an incorrect size");
                    scanner.nextLine();
                    error_support(1);
                }
                return a;
            } else if (number == 2) {

                try {
                    b = scanner.nextDouble();

                } catch (Exception e) {
                    System.out.println("you gave an incorrect size");
                    scanner.nextLine();
                    error_support(2);
                }
                return b;
            }
            if (number == 3) {
                try {
                    c = scanner.nextDouble();

                } catch (Exception e) {
                    System.out.println("you gave an incorrect size");
                    scanner.nextLine();
                    error_support(3);
                }
                return c;
            }
            if (number == 4) {
                try {
                    h = scanner.nextDouble();

                } catch (Exception e) {
                    System.out.println("you gave an incorrect size");
                    scanner.nextLine();
                    error_support(4);
                }
                return h;
            } else
            {       try {
                    r = scanner.nextDouble();

                } catch (Exception e) {
                    System.out.println("you gave an incorrect size");
                    scanner.nextLine();
                    error_support(5);
                }


            return r;
        }

        }
    }
