// ����) �й��� �Է¹޾� ���� ���
// 		��, �����й� �Է� �� ����ó��
// ��)
// �й� �Է� : 1002		���� : 11��
// �й� �Է� : 1000		�ش��й��� �������� �ʽ��ϴ�.
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
			System.out.println("�й� �Է�:");
			int num = sc.nextInt();
			
			int count = -1;
			for(int i=0; i<5; i++)
			{
				if(id[i] == num)
				{
					System.out.println("����"+score[i]);
					count++;
					//count = i;
				}
			}
			
			if(count == -1)
			{
				System.out.println("�ش� �й��� ���� ���� �ʽ��ϴ�.");
				break;
			}
			/*else
			{
				System.out.println(score[count]+"��");
			}*/
		}
	}
}
