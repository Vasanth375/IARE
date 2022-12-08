import java.util.Scanner;
import java.util.Random;
public class Java{
	public static void main(String[] args){
		Random r = new Random();
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a number");
		int k = s.nextInt();

		int randomNum = r.nextInt(k);

		while(true){
			System.out.println("Enter your guess");
			int num = s.nextInt();

			if(num < randomNum){
				System.out.println("Too Low!! Try again");
			}
			else if(num > randomNum){
				System.out.println("Too High!! Try again");
			} else{
				System.out.println("Yeah!! You got it and You Won!");
				break;
			}
		}
			
	}
}
