package practicejava;

import java.util.Scanner;

public class PracticeProject {
	
	public static Scanner input = new Scanner(System.in);
	public static int quantity,choice=1;
	public static String again;
	public static double total=0,pay;
	
	public static void menu() {
	
	System.out.println("-_-_-_-_-_-_-_-_-_-_-_-");
	System.out.println("Welcome to our store");
	System.out.println("Store Menu");
	System.out.println("1.Milk    $ 5.99");
	System.out.println("2.Soda    $ 1.99");
	System.out.println("3.water    $ 2.99");
	System.out.println("4.Cancel");
	
	}
	public static void order() {
		
		
		System.out.println("1 to Milk || 2 to Soda || 3 to Water");
		System.out.println("Press what you want to order");
		choice=input.nextInt();
		
		
		
		if(choice==1) {
			System.out.println("you choose Milk");
			
			System.out.println("please put your quantity");
			quantity=input.nextInt();
			total=total+(quantity*5.99);
			
			System.out.println("Would you like to continue shopping");
			System.out.println("Press Y to continue or N for NO");
			again=input.next();
			if (again.equalsIgnoreCase("Y"))
			order();
			
			else {
				System.out.println("enter a payment");
				pay=input.nextDouble();
				if(pay<total)
					System.out.println("Do you need more");
				else {
					System.out.println("Total = "+total);
					total=pay-total;
					System.out.println("Customer`s return = "+ total);
					
				}
			}
		
		}
	
			
			
		else if(choice==4){
			System.exit(0);
			
		}
		
		
		else {
			System.out.println("choose food items:");
			order();
		
		}
	}
	
	

	
	
	public static void main(String[] args) {
		
		menu();
		order();
		
	}
	}



