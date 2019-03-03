import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Writting_Out writting_out=new Writting_Out();
        Choose_Figure choose_figure=new Choose_Figure();
        Enter_data enter_data=new Enter_data();
        int choose1;
        int choose2=0;
        int choose3=0;


        System.out.println("Hello, Welcome to the calculator");
        System.out.println();
        System.out.println();
        while(choose3!=1) {

            System.out.println("1.Choose figure.");
            System.out.println("2.Enter data");
            System.out.println("3.Show");
            System.out.println("4.Exit");
            choose1 = scanner.nextInt();
            switch (choose1) {
                case 1:
                    System.out.println("1.Triangle.");
                    System.out.println("2.Square.");
                    System.out.println("3.Circle");
                    choose2 =scanner.nextInt();
                     choose_figure.choose(choose2);


                    break;
                case 2:
                    choose_figure.choose(choose2);
                    if (choose2==1)
                    {
                             enter_data.triangle();
                    }
                    else
                        if(choose2==2) {

                           enter_data.square();
                        }
                        else
                            if(choose2==3)
                            {
                                enter_data.circle();
                            }

                    break;
                case 3:
                    choose_figure.choose(choose2);
                    if(choose2==1) {
                        writting_out.writting1(enter_data.method1());

                    }
                    else
                        if(choose2==2) {
                            writting_out.writting2(enter_data.method2());
                        }
                        else
                            if(choose2==3) {
                                writting_out.writting3(enter_data.method3());
                            }
                        break;
                case 4:
                    System.out.println("Bye");
                    choose3=1;break;
                default:
                    System.out.println("You choose wrong number try again.");
                    break;

            }


        }
    }


}