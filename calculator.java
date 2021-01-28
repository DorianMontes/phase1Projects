package Calculator;

import java.util.Scanner;

public class calculator {
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int calc_On = 1;
		while(calc_On == 1) {
			System.out.println("Enter a Number Value: \n");
			int x = a.nextInt();
			System.out.println("Do you wish to: [1] add, [2] subtract, [3] multiply, or [4] divide? \n");
			int operation = a.nextInt();
			System.out.println("Enter a Second Number Value: \n");
			int y= a.nextInt();
			
			
			int result= 0;
			boolean recheck = false;
			while(recheck == false) {
				if(operation == 1) {
					result = x+y;
					recheck = true;
				} else if(operation == 2) {
					result = x-y;
					recheck = true;
				} else if(operation == 3) {
					result = x*y;
					recheck = true;
				} else if(operation == 4) {
					result = x/y;
					recheck = true;
				} else {
					System.out.println("Invalid operation. Do you wish to: [1] add, [2] subtract, [3] multiply, or [4]divide the two numbers? \n");
					operation = a.nextInt();
				}
			}
			
			System.out.println("result:"+result);
			System.out.println("Do you wish to continue?: [1] No / [2] Yes \n");
			int cont_Calc = a.nextInt();
			if(cont_Calc == 1) {
				calc_On = 0;
				System.out.println("Thank you, have a nice day! \n");
			}
		}
	}
}
