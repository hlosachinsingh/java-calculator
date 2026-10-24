import java.util.Scanner;
public class Calculator {
    //  1 .  adding method
    public static void addTwo(double a , double b) {
        System.out.println("ADDITION  IS : "  +(a + b));
    }

    // 2.   subtract method
    public static void subTwo(double a , double b){
        System.out.println("SUBTRATION IS : " + (a-b));
    }

    // 3 . multiply method
    public static void  mulTwo(double a , double b ){
        System.out.println("MULTIPICATION IS :   " + ( a*b)) ;
    }

    // 4 . divsion method

    public static void divTwo(double a , double b){

        if(b==0){
            System.out.println("THE DIVISIOR SHOULD NOT BE ZERO");
        }
        else{

            System.out.println("DIVISION IS :  "  + (a/b));
        }
    }



    // 5 .  power method

    public static void  powTwo(double a , double b  ){
        System.out.println(" ANS IS  : " + Math.pow(a,b));
    }



// CALCULATOR MAIN METHOD

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ch =0;
        do {
            System.out.println("=======BASIC       CALCULATOR===============");
            System.out.println("1.ADD TWO  NUMBERS");
            System.out.println("2. SUBTRACT TWO  NUMBERS");
            System.out.println("3.MUTIPLY TWO  NUMBERS");
            System.out.println("4.DIVIDE  TWO  NUMBERS");
            System.out.println("5.POWER OF THE TWO  NUMBERS");
            System.out.println("6.EXIT ");
            System.out.print("ENTER THE CHOICE WHAT YOU WANT  TO DO : ");
            ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.println("Enter the first number : ");
                    double  a = sc.nextDouble();
                    System.out.println("Enter the second number ");
                    double  b = sc.nextDouble();
                    addTwo(a, b);
                }
                case 2 -> {
                    System.out.println("Enter the first number : ");
                    double  a = sc.nextDouble();
                    System.out.println("Enter the second number ");
                    double b = sc.nextDouble();
                    subTwo(a, b);

                }


                case 3 -> {
                    System.out.println("Enter the first number : ");
                    double a  = sc.nextDouble();
                    System.out.println("Enter the second number ");
                    double b  = sc.nextDouble();
                    mulTwo(a,b);

                }

                case 4-> {
                    System.out.println("Enter the first divident : ");
                    double  a = sc.nextDouble();
                    System.out.println("Enter the divisor :");
                    double b = sc.nextDouble();
                    divTwo(a,b);
                }


                case  5->{


                    System.out.println("Enter the  base number: ");
                    double a  = sc.nextDouble();
                    System.out.println("Enter the power number ");
                    double b   = sc.nextDouble();;
                    powTwo(a,b);

                }

                case 6 -> {
                    System.out.println("GOOD BYE SEE YOU LATER ........................");
                }

                default -> {
                    System.out.println("invalid choice try again ! ! ! ");
                }


            }
        } while (ch != 6);


    }
}
