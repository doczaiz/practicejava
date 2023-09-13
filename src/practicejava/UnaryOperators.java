package practicejava;

import java.util.Scanner;

public class UnaryOperators {
	
	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);
	 
    // for user inputs here is the code.

     System.out.print("Enter a number: ");
     int num = input.nextInt();
   
//	int num = 10;

    int result = +num;//When placed after the variable name, the value of the operand is incremented but 
    //the previous value is retained temporarily until the execution of this statement and it gets updated 
    //before the execution of the next statement. 
    System.out.println(
        "The value of result after unary plus is: "
        + result);

    result = -num;
    System.out.println(
        "The value of result after unary minus is: "
        + result);

    result = ++num; // When placed before the variable name, the operand’s value is incremented instantly.
    System.out.println(
        "The value of result after pre-increment is: "
        + result);

    result = num++;
    System.out.println(
        "The value of result after post-increment is: "
        + result);

    result = --num;//value is decremented before execution of next statement
    System.out.println(
        "The value of result after pre-decrement is: "
        + result);

    result = num--;//Value will be decremented before execution of next statement.
    System.out.println(
        "The value of result after post-decrement is: "
        + result);
}
	
	
	
	

}
