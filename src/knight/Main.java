package knight;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String location = sc.nextLine(); // 좌표 입력받기
		int row = location.charAt(1) - '0'; // 행을 int형 변환
		int column = location.charAt(0) - 'a' + 1; // 열을 int형 변환
		int count = 0; // 이동 가능 한 좌표 개수 구하기
		int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2}; 
		int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1}; // knight가 이동할 수 있는 8가지 경우의 수
		
		
		for(int i = 0; i < 8; i++) // 한 좌표당 이동할 수 있는 경우의 수가 8가지이므로
		{
			int x = row + dx[i];
			int y = column + dy[i];
			if(x < 1 || y < 1 || x > 8 || y > 8) continue; // 정원 밖을 나갈 경우 count를 세지 않아야 하므로
			count++;
		}
		System.out.println(count);
	}

}
