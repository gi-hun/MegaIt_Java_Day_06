// 문제1) 인덱스를 입력받아 성적 출력
// 정답1) 인덱스 입력 : 1	성적 : 11점
		
// 문제2) 성적을 입력받아 인덱스 출력
// 정답2) 성적 입력 : 11		인덱스 : 1

// 문제3) 학번을 입력받아 성적 출력
// 정답3) 학번 입력 : 1003	성적 : 45점
//12:26-12:33

package day_06;

import java.util.Scanner;

public class ArrayEx05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {87, 11, 45, 98, 23};
		int[] id = {1001, 1002, 1003, 1004, 1005};
		int[] score  = {  87,   11,   45,   98,   23};
		
		System.out.println("인덱스를 입력: ");
		int input = sc.nextInt();
		
		
		for(int i=0; i<5; i++)
		{
			if(i == input)
			{
				System.out.println("성적: "+arr[i]);
			}
		}
		
		System.out.println("성적을 입력: ");
		input = sc.nextInt();
		
		for(int i=0; i<5; i++)
		{
			if(input == score[i])
			{
				System.out.println("인덱스: "+i);
			}
		}
		
		System.out.println("학번을 입력: ");
		input = sc.nextInt();
		
		for(int i=0; i<5; i++)
		{
			if(input == id[i])
			{
				System.out.println("성적: "+arr[i]);
			}
		}

	}
}
