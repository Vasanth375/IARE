// Fibonacci Series 100 values
import java.math.BigInteger;
public class Java
{
	public static void main (String[] args) {
  /*Here We have used BigInterger Class to represent numbers which is larger than the Primitive Datatype long*/
	BigInteger a = new BigInteger( "0" );
	BigInteger b = new BigInteger( "1" );
	BigInteger c;
	for ( int i = 0 ; i < 100 ; i++) {
		System.out.print(a + " " );
		c = a.add(b);
		a = b;
		b = c;
	}
}
}
