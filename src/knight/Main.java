package knight;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String location = sc.nextLine(); // ��ǥ �Է¹ޱ�
		int row = location.charAt(1) - '0'; // ���� int�� ��ȯ
		int column = location.charAt(0) - 'a' + 1; // ���� int�� ��ȯ
		int count = 0; // �̵� ���� �� ��ǥ ���� ���ϱ�
		int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2}; 
		int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1}; // knight�� �̵��� �� �ִ� 8���� ����� ��
		
		
		for(int i = 0; i < 8; i++) // �� ��ǥ�� �̵��� �� �ִ� ����� ���� 8�����̹Ƿ�
		{
			int x = row + dx[i];
			int y = column + dy[i];
			if(x < 1 || y < 1 || x > 8 || y > 8) continue; // ���� ���� ���� ��� count�� ���� �ʾƾ� �ϹǷ�
			count++;
		}
		System.out.println(count);
	}

}
