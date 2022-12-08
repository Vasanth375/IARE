// finding the power of a number without using Inbuilt Methods

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt();	

		System.out.println("Enter the power number");
		int b = s.nextInt();

		int c = 1;
		for(int i = 0; i<b; i++){
			c *= a;
		}
		System.out.println(c);
	}
}
