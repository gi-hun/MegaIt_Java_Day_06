/*
 * # ��ȭ�� �¼�����
 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
 * 4. �� �¼��� ���� ������ 12000���̴�.
 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
 * ��)
 * seat = 0 0 0 0 0 0 0
 * 
 * �¼����� : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
 * ----------------------
 * ����� : 24000��
 */
//01:05-01:29

package day_06;

import java.util.Scanner;

public class ArrayEx09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] seat = new int[7];
		int count = 0;
		
		while(true)
		{
			System.out.println("==�Ե��ó׸�==");
			System.out.println("1. �¼� ����");
			System.out.println("2. ���� ����");
			System.out.println("3. ����");
			System.out.println("�޴��� �����ϼ���");
			int menu = sc.nextInt();
			
			if(menu == 1)
			{
				System.out.print("seat = ");
				for(int i=0; i<7; i++ )
				{
					System.out.print(seat[i]+" ");
				}
				System.out.println(" ");
				
				System.out.println("�¼��� �����ϼ���:");
				int sel = sc.nextInt();
				
				
				System.out.print("seat = ");
				for(int i=0; i<7; i++ )
				{
					if(i == sel)
					{
						if(seat[i] == 0)
						{
							seat[i]  = 1;
							count++;
						}
						else
						{
							System.out.println("�̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.");
							break;
						}
						
					}
					System.out.print(seat[i]+" ");
				}
				
				System.out.println(" ");
				
			}

			else if(menu == 2)
			{
				System.out.println("���� ������" + 12000*count + "��");
			}
			
			else if(menu == 3)
			{
				System.out.println("����");
				break;
			}
			
		}
		
	}
}
