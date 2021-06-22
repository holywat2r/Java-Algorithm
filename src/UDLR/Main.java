package UDLR;
import java.util.*;

public class Main {
	

	public static void main(String[] args) {
		int[] dx = {0,0,-1,1}; // L , R, U, D �� ��ǥ
		int[] dy = {-1,1,0,0}; // L, R, U, D �� ��ǥ
		char[] moveTypes = {'L','R','U','D'}; // x y ��ǥ�� Ÿ�� ���� ����
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine(); // ���� ����
		int x = 1, y= 1; // ���� ��ǥ
		String str = sc.nextLine(); // L R U D �Է� �ޱ�
		str = str.replaceAll(" ",  ""); // ���ڿ� ���� ����
		char[] tmp = str.toCharArray(); // �Է¹��� ���ڿ��� char�� ��ȯ
		for(int i = 0; i < tmp.length;i++) // �Է¹��� ���ڿ� ����
		{
			int nx = -1, ny = -1;
			for(int j = 0; j < moveTypes.length; j++)
			{
				if(tmp[i] == moveTypes[j])
				{
					nx = x + dx[j];
					ny = y + dy[j];
					
				}
			}
			if(nx < 1 || ny < 1 || nx > n || ny > n) continue;
			
			x = nx;
			y = ny;

		} 
		System.out.println(x +"," +y);
	}
	
}
