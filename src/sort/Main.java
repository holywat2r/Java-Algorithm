package sort;
import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		char tmp;
		for(int i = 0; i < arr.size();i++)
		{
			if(str.charAt(i) >=65 && str.charAt(i) <=90)
			{
				if(str.charAt(i) > str.charAt(i+1))
				{
					tmp = str.charAt(i);
					
					
				}
			}
		}
	
	}

}
