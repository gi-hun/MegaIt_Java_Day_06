// 문제1) arr배열에 1~100점 사이의 정수를 5개 저장
// 예   1) 87, 11, 92, 14, 47
		
// 문제2) 전교생의 총점과 평균 출력
// 예   2) 총점(251) 평균(50.2)
		
// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
// 예   3) 2명
//12:18

package day_06;

import java.util.Random;

public class ArrayEx04 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++)
		{
			int score = ran.nextInt(100)+1;
			arr[i] = score;
			System.out.println(arr[i]);
		}
		
		int total = 0;
		
		for(int i=0; i<5; i++)
		{
			total = total + arr[i];
		}
		
		System.out.println("");
		
		double avg = total/5.0;
		System.out.println("총점=" + total);
		System.out.println("평균+"+ avg);
		
		int count = 0;
		for(int i=0; i<5; i++)
		{
			if(arr[i] >= 60)
			{
				count++;
			}
		}
		
		System.out.println("합격자수= "+count);
	}
}
