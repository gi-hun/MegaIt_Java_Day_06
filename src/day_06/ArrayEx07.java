// 문제) 1등학생의 학번과 성적 출력
// 정답) 1004번(98점)
//12:45-12:49

package day_06;

public class ArrayEx07 {
	public static void main(String[] args) {
		
		int[] id = {1001, 1002, 1003, 1004, 1005};
		int[] score  = {  87,   11,   45,   98,   23};
		
		int max = 0;
		int count = 0;
		
		for(int i=0; i<5; i++)
		{
			if(max < score[i])
			{
				max = score[i];
				count++;
			}
		}
		System.out.println("정답)"+id[count+1]+" ("+max+")점");

	}
}
