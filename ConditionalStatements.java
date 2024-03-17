// import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String[] args) {
        // // 1. if-else statement used for Bicondition.
        // int age = 22;
        // if(age==22){System.out.println("Age is 22");}
        // else{System.out.println("Age is not 22");}

        // // Print the largest Number
        // int a = 25;
        // int b = 26;
        // if(a>b){System.out.println("A is greater than B");}
        // else{System.out.println("B is greater than A");}

        // // Even or odd
        // int num = 22;
        // if(num%2==0){System.out.println("Num is Even");}
        // else{System.out.println("Num is Odd");}

        // // 2. else if statement
        // // if(condition 1){}
        // // else if(condition 2){} check's only if above condition became fasle.
        // // else{}
        // int age = 13;
        // if(age>18){System.out.println("Adult");}
        // else if(age>=13 & age<=18){System.out.println("Teenager");}
        // else{System.out.println("Child");}

        // // Income Tax Calculator
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your income : ");
        // int income = sc.nextInt();
        // int tax = 0;
        // if(income<500000){
        //     tax = 0;
        // }else if(income>=500000 && income<=1000000){
        //     tax = (int)(income*0.2);
        // }else{
        //     tax = (int)(income*0.3);
        // }
        // System.out.println("Your Tax is " + tax);

        // // Largest of 3 Number
        // int a = 25;
        // int b = 26;
        // int c = 27;
        // if(a>b && b>c){System.out.println("A is Largest.");}
        // else if(b>c){System.out.println("B is Largest");}
        // else{System.out.println("C is Largest.");}

        // 3. Ternary Operator
        //  variable = condition?statement1:statement2;
        // statement 1 = true condition & statement 2 = false condition
        // if the statements are returning some value then it is stored in variable.
        // int num = 4;
        // String type = ((num%2)==0)?"even":"odd";
        // System.out.println(type);

        // 4. Switch Statement
        // switch(choice){
            // case choice:
            // statement;
            // break;

            // default: executed if no any case matches.
            // statements;}

        // int num = 3;
        // switch(num){
        //     case 1: System.out.println("Bubrger"); break;
        //     case 2: System.out.println("Samosa"); break;
        //     case 3: System.out.println("Potato"); break;
        //     default:System.out.println("Invalid Choice");
        // }

        // // Calculator
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // char operator = sc.next().charAt(0);
        // int b = sc.nextInt();
        
        // switch(operator){
        //     case '+':
        //     System.out.println(a+b);
        //     break;
        //     case '-':
        //     System.out.println(a-b);
        //     break;
        //     case '*':
        //     System.out.println(a*b);
        //     break;
        //     case '/':
        //     System.out.println(a/b);
        //     break;

        //     default:
        //     System.out.println("Invalid Choice");
        // }
    }
}
