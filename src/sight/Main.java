package sight;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n을 입력받기
		int count = 0; // 3의 개수를 count할 변수 count
		
		for(int i = 0; i <= n; i++) // 입력받은 n값 만큼 반복(시간) 
		{
			for(int j = 0; j <= 59; j++) // 분 비교
			{
				for(int k =0; k <=59; k++) // 초 비교
				{
					int div2 = i / 10; // 시간을 십의자리와 일의자리로 구분하여 3이 각각 담기
					int mod2 = i % 10;

					
					int div1 = j / 10;
					int mod1 = j % 10; // 분을 십의자리와 일의자리로 구분하여 3이 각각 담기

					
					int div = k / 10;
					int mod = k % 10; // 초를 십의자리와 일의자리로 구분하여 3이 각각 담기
					if(div2 ==3 || mod2 == 3 || div1 ==3 || mod1 == 3 ||div == 3 || mod == 3)
						count++; // 시, 분, 초에 단 하나라도 3이 포함되어 있는경우 count 증가
				}
				
			}
		}
		System.out.println(count);
	}

}
