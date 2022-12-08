import java.util.Scanner;
public class Java{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String y;
		do{
		System.out.println("Enter A number: ");
		int a = s.nextInt();	
     
		System.out.println("Enter B number: ");
		int b = s.nextInt();
		
		int c = a+b;
		
		System.out.println("Sum: "+c);
		System.out.print("Do you wish to repeat the process (y/n): ");
		y = s.next();
		}while(y.equals("y"));
	}
}
