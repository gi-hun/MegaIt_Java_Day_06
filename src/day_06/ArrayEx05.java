// ����1) �ε����� �Է¹޾� ���� ���
// ����1) �ε��� �Է� : 1	���� : 11��
		
// ����2) ������ �Է¹޾� �ε��� ���
// ����2) ���� �Է� : 11		�ε��� : 1

// ����3) �й��� �Է¹޾� ���� ���
// ����3) �й� �Է� : 1003	���� : 45��
//12:26-12:33

package day_06;

import java.util.Scanner;

public class ArrayEx05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {87, 11, 45, 98, 23};
		int[] id = {1001, 1002, 1003, 1004, 1005};
		int[] score  = {  87,   11,   45,   98,   23};
		
		System.out.println("�ε����� �Է�: ");
		int input = sc.nextInt();
		
		
		for(int i=0; i<5; i++)
		{
			if(i == input)
			{
				System.out.println("����: "+arr[i]);
			}
		}
		
		System.out.println("������ �Է�: ");
		input = sc.nextInt();
		
		for(int i=0; i<5; i++)
		{
			if(input == score[i])
			{
				System.out.println("�ε���: "+i);
			}
		}
		
		System.out.println("�й��� �Է�: ");
		input = sc.nextInt();
		
		for(int i=0; i<5; i++)
		{
			if(input == id[i])
			{
				System.out.println("����: "+arr[i]);
			}
		}

	}
}
