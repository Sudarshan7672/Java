// import java.util.*; importing package

public class Variablesanddatatypes {
    public static void main(String[] args) {

        //Output in java
        // 1. System.out.print();
        // 2. System.out.println();
        // 3. \n

        //Print a pattern
        // ****
        // ***
        // **
        // *
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // int a = 10; here a is variable name & int is datatype

        // primitive datatypes
        // byte(1byte), short(2bytes), char(2bytes), boolean(1bytes)
        // int(4bytes), long(8bytes), float(4bytes), double(8bytes)
        // Non-Primitive datatypes
        // string, array, class, object, interface

        // sum of two numbers
        // int a = 10;
        // int b = 20;
        // int sum = a+b;
        // System.out.println(sum);

        //This is Comment.

        //input in java
        // next
        // nextLine
        // nextInt
        // nextByte
        // nextFloat
        // nextDouble
        // nextBoolean
        // nextShort
        // nextLong
        // Scanner sc = new Scanner(System.in);  creating a object for scanner class
        // int a = sc.nextInt();  Taking input

        // Sum of a & b by user input
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value of a:-");
        // int a = sc.nextInt();
        // System.out.println("Enter the value of b:-");
        // int b = sc.nextInt();
        // int sum = a+b;
        // int product = a*b;
        // System.out.println("The sum of a&b = " +sum);
        // System.out.println("The product of a&b = " +product);

        // Area of circle
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Radius of Circle r = ");
        // int r = sc.nextInt();
        // int area = 2*3.142*r;
        // System.out.println("The area of circle = " +area);

        // Type Conversion/Implicit/Widening in java
        // byte->short->int->float->long->double(destination type>source type)
        // float number = sc.nextInt();  
        // Here, Int can be stored in Float vice versa not possible because of thier sizes.

        // Type Casting/explicit/lossy conversion/narrowing Conversion
        // int a = (int)(99.99);
        // Here double value 99.99 is converted into int loosing digits after decimal.

        //Type Promotion in Expression
        // 1.Java automatically promotes each byte, short or char operand to int while evaluating an expression.
        // char A = 'a';
        // char B = 'b';
        // System.out.println(B-A);
        // Here b and a are evaluated to int and then expression is evaluated.
        // 2.If one operand is long, float or double the whole expression is promoted to long,float or double respectively.
        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // double d = 30;
        // double ans  = a+b+c+d;
        // System.out.println(ans);
        // Here The whole expression will evaluated to double because of double d.

        

    }
}