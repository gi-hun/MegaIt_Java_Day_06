/*
 * # �ߺ����� ����[1�ܰ�]
 * 1. 0~4 ������ ���ڸ� arr�迭�� �����Ѵ�.
 * 2. ��, �ߺ��Ǵ� ���ڴ� ����� �Ѵ�.
 * ��Ʈ) ���� ���ڸ� check�迭�� �ε����� Ȱ���Ѵ�.
 * 
 * ��)
 * �������� : 1
 * check = {0, 1, 0, 0, 0}
 * arr   = {1, 0, 0, 0, 0}
 * �������� : 3
 * check = {0, 1, 0, 1, 0}
 * arr   = {1, 3, 0, 0, 0}
 * �������� : 2
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
			System.out.println("1.����Ȯ��");
			System.out.println("2.����");
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
				System.out.println("���α׷� ����");
				break;
			}
			System.out.println(" ");
		}
	}
}
