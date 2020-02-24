/*
 * # OMR카드
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */
//12:51-12:59

package day_06;

import java.util.Random;

public class ArrayEx08 {
	public static void main(String[] args) {
		
		Random ran = new Random();
				
		int[] answer = {1, 3, 4, 2, 5};
		int[] hgd = new int[5];
		
		System.out.println("answer answer = {1 3 4 2 5};");
		
		System.out.print("hgd = {");
		for(int i=0; i<5; i++)
		{
			int num = ran.nextInt(5)+1;
			hgd[i] = num;
			System.out.print(hgd[i]+" ");
		}
		System.out.println("}");
		
		int count = 0;
		System.out.print("정오표 = {");
		for(int i=0; i<5; i++)
		{
			if(answer[i] == hgd[i])
			{
				System.out.print("O ");
				count++;
			}
			else
			{
				System.out.print("X ");
			}
		}
		System.out.println("}");
		
		System.out.println("성적 = "+count*20+"점");
	}
}
