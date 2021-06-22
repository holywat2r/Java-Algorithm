package UDLR;
import java.util.*;

public class Main {
	

	public static void main(String[] args) {
		int[] dx = {0,0,-1,1}; // L , R, U, D 행 좌표
		int[] dy = {-1,1,0,0}; // L, R, U, D 열 좌표
		char[] moveTypes = {'L','R','U','D'}; // x y 좌표와 타입 같게 선언
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine(); // 버퍼 비우기
		int x = 1, y= 1; // 시작 좌표
		String str = sc.nextLine(); // L R U D 입력 받기
		str = str.replaceAll(" ",  ""); // 문자열 공백 제거
		char[] tmp = str.toCharArray(); // 입력받은 문자열을 char형 변환
		for(int i = 0; i < tmp.length;i++) // 입력받은 문자열 길이
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
