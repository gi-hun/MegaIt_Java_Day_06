// ����1) arr�迭�� 1~100�� ������ ������ 5�� ����
// ��   1) 87, 11, 92, 14, 47
		
// ����2) �������� ������ ��� ���
// ��   2) ����(251) ���(50.2)
		
// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
// ��   3) 2��
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
		System.out.println("����=" + total);
		System.out.println("���+"+ avg);
		
		int count = 0;
		for(int i=0; i<5; i++)
		{
			if(arr[i] >= 60)
			{
				count++;
			}
		}
		
		System.out.println("�հ��ڼ�= "+count);
	}
}
