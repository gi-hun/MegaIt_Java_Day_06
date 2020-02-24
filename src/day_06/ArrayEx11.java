/*
 * # 중복숫자 금지[1단계]
 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
 * 2. 단, 중복되는 숫자는 없어야 한다.
 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
 * 
 * 예)
 * 랜덤숫자 : 1
 * check = {0, 1, 0, 0, 0}
 * arr   = {1, 0, 0, 0, 0}
 * 랜덤숫자 : 3
 * check = {0, 1, 0, 1, 0}
 * arr   = {1, 3, 0, 0, 0}
 * 랜덤숫자 : 2
 * check = {0, 1, 1, 1, 0}
 * arr   = {1, 3, 2, 0, 0}
 */
//01:55-

package day_06;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx11 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.숫자확인");
			System.out.println("2.종료");
			int menu = sc.nextInt();
			
			if(menu == 1)
			{
				int[] arr = new int[5];
				int[] check = new int[5];
				
				int num = ran.nextInt(5);					
				
				for(int i=0; i<5; i++)
				{
					arr[i] = num;
					System.out.print(arr[i]+" ");
				}
			}
			else if(menu == 2)
			{
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println(" ");
		}
	}
}
