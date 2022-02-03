// Make a Calculator.
// Take 2 numbers(a&b)from the user and an operation as follows:
// 1:+(Addition)a+b 
// 2:-(Subtraction)a-b 
// 3:*(Multiplication)a*b 
// 4:/(Division)a/b 
// 5:%(Modulo or remainder)a%b 
// Calculate the result according to the operation given and display it to the user.


import java.util.Scanner;

class Calculator{
    public static void main(String[] st)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();

        System.out.println("Enter Second Number");
        int b=sc.nextInt();

        System.out.println("Enter Operation");
        System.out.println("1:+(Addition)a+b\n2:-(Subtraction)a-b\n3:*(Multiplication)a*b\n4:/(Division)a/b\n5:%(Modulo or remainder)a%b");
        int op=sc.nextInt();
        System.out.println();8
        switch(op){
            case 1 :System.out.println(a+b);
            break;
            case 2 :System.out.println(a-b);
            break;
            case 3 :System.out.println(a*b);
            break;
            case 4 :System.out.println(a/b);
            break;
            case 5 :System.out.println(a%b);
            break;
            default :System.out.println("Invalid Operation");
        }
        sc.close();
    
    }
}