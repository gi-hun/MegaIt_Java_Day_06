// 문제) 학번을 입력받아 성적 출력
// 		단, 없는학번 입력 시 예외처리
// 예)
// 학번 입력 : 1002		성적 : 11점
// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
//12:35-12:42

package day_06;

import java.util.Scanner;

public class ArrayEx06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] id = {1001, 1002, 1003, 1004, 1005};
		int[] score  = {  87,   11,   45,   98,   23};
		
		while(true)
		{
			System.out.println("학번 입력:");
			int num = sc.nextInt();
			
			int count = -1;
			for(int i=0; i<5; i++)
			{
				if(id[i] == num)
				{
					System.out.println("성적"+score[i]);
					count++;
					//count = i;
				}
			}
			
			if(count == -1)
			{
				System.out.println("해당 학번이 존재 하지 않습니다.");
				break;
			}
			/*else
			{
				System.out.println(score[count]+"점");
			}*/
		}
	}
}
