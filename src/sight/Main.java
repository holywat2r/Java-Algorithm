package sight;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n�� �Է¹ޱ�
		int count = 0; // 3�� ������ count�� ���� count
		
		for(int i = 0; i <= n; i++) // �Է¹��� n�� ��ŭ �ݺ�(�ð�) 
		{
			for(int j = 0; j <= 59; j++) // �� ��
			{
				for(int k =0; k <=59; k++) // �� ��
				{
					int div2 = i / 10; // �ð��� �����ڸ��� �����ڸ��� �����Ͽ� 3�� ���� ���
					int mod2 = i % 10;

					
					int div1 = j / 10;
					int mod1 = j % 10; // ���� �����ڸ��� �����ڸ��� �����Ͽ� 3�� ���� ���

					
					int div = k / 10;
					int mod = k % 10; // �ʸ� �����ڸ��� �����ڸ��� �����Ͽ� 3�� ���� ���
					if(div2 ==3 || mod2 == 3 || div1 ==3 || mod1 == 3 ||div == 3 || mod == 3)
						count++; // ��, ��, �ʿ� �� �ϳ��� 3�� ���ԵǾ� �ִ°�� count ����
				}
				
			}
		}
		System.out.println(count);
	}

}
