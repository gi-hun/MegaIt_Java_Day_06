package day_06;

import java.util.Random;

public class ArrayEx11_분석 {
	public static void main(String[] args) {

		Random ran = new Random();
		
		
		int[] check = new int[5];
		int[] arr = new int[5];
		
		int count = 0;
		
		for(int i=0; i<5; i++) {
			
			int r = ran.nextInt(5);
			arr[i] = r;
			System.out.println(count +") "+arr[i] +" 가");
			System.out.println(count +") "+ ""+check[r]+" 나");
			System.out.println(count +") "+ check[r]+" 다");
			System.out.println(count +") "+ i+" 라");
			count++;
			if(check[r] == 0) {
				check[r] = 1;
				System.out.println(count +") "+arr[i] +" 마");
				System.out.println(count +") "+ ""+check[r]+" 바");
				System.out.println(count +") "+ check[r]+" 사");
				System.out.println(count +") "+ i+" 아");
				count++;
			}else {
				i -= 1;
				System.out.println(count +") "+arr[i] +" 자");
				System.out.println(count +") "+ ""+check[r]+" 차");
				System.out.println(count +") "+ check[r]+" 카");
				System.out.println(count +") "+ i+" 타");
				count++;
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}

}
