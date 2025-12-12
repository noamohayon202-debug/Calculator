import java.util.Scanner;
import java.util.Stack;
public class App {
    
    static Scanner scanner = new Scanner(System.in);

public static void add () { 
    
    System.out.print("enter first num ");
    double a =scanner.nextDouble();

    System.out.print("enter second num ");
    double b =scanner.nextDouble();

    System.out.print("result: "+(a+b));


    } 
      
    public static void subtract () { 
    
    System.out.print("enter first num ");
    double a =scanner.nextDouble();

    System.out.print("enter second num ");
    double b =scanner.nextDouble();

    System.out.print("result: "+(a-b));
    }
      
public static void multi() {

System.out.print("enter first num ");
    double a =scanner.nextDouble();

    System.out.print("enter second num ");
    double b =scanner.nextDouble();

    System.out.println("the result are: "+(a*b));

}


public static void divide() {
    System.out.print("enter first num ");
    double a =scanner.nextDouble();

    System.out.print("enter second num ");
    double b =scanner.nextDouble();

    System.out.println("the result are: "+(a/b));

}

public static void power() {
    System.out.print("enter first num ");
    double a =scanner.nextDouble();

    System.out.print("enter second num ");
    double b =scanner.nextDouble();

    System.out.println("the result are: "+Math.pow(a, b));

}

public static void sqt() {
    System.out.print("enter num ");
    double a =scanner.nextDouble();

    System.out.println("the result are: "+Math.sqrt(a));

}



public static void pitagoras() {
    System.out.print("enter first side ");
    double a =scanner.nextDouble();

    System.out.print("enter second side ");
    double b =scanner.nextDouble();

    System.out.println("the result are: "+Math.sqrt(a*2 +b*2));

}
public static void circlearea() {
    System.out.print("enter radius: ");
    double radius =scanner.nextDouble();

    System.out.println("the result are: "+3.14*(radius*radius));

}

public static void avrage(){
    Stack<Double> stack = new Stack<>();
   Double x=0.0;
   
    System.out.print("how much numbers ");
    int a =scanner.nextInt();

    for(int i=1;i<=a;i++){
    System.out.print("enter numbers  ");
      stack.push(scanner.nextDouble());
    
      x += stack.pop();
    }
System.out.println("the avrage is: "+(x/a));
}

    public static void main(String[] args) {
        System.out.println("1.add");
        System.out.println("2.subtract");
        System.out.println("3.multi");
        System.out.println("4.divide");
        System.out.println("5.power");
        System.out.println("6.square root");
        System.out.println("7.circle area");

       
       
       
       
       
        int choice = scanner.nextInt();

        if (choice == 1) add();
        else if (choice == 2) subtract();
        else if (choice == 3) multi();
        else if (choice == 4) divide();
        else if (choice == 5) power();
        else if (choice == 6) sqt();
        else if (choice == 7) circlearea();

    }
  }
