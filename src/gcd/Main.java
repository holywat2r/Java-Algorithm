package gcd;
import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(gcd(a,b));
		sc.close();
	}
	
	public static int gcd(int a, int b)
	{
		int tmp;
		if(a < b)
		{
			tmp = a;
			a = b;
			b = tmp;
		}
		if(b == 0)
			return a;
		else {
			return gcd(b, a % b);
		}
	}
	

}
