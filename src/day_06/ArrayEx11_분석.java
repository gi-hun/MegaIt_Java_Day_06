package day_06;

import java.util.Random;

public class ArrayEx11_�м� {
	public static void main(String[] args) {

		Random ran = new Random();
		
		
		int[] check = new int[5];
		int[] arr = new int[5];
		
		int count = 0;
		
		for(int i=0; i<5; i++) {
			
			int r = ran.nextInt(5);
			arr[i] = r;
			System.out.println(count +") "+arr[i] +" ��");
			System.out.println(count +") "+ ""+check[r]+" ��");
			System.out.println(count +") "+ check[r]+" ��");
			System.out.println(count +") "+ i+" ��");
			count++;
			if(check[r] == 0) {
				check[r] = 1;
				System.out.println(count +") "+arr[i] +" ��");
				System.out.println(count +") "+ ""+check[r]+" ��");
				System.out.println(count +") "+ check[r]+" ��");
				System.out.println(count +") "+ i+" ��");
				count++;
			}else {
				i -= 1;
				System.out.println(count +") "+arr[i] +" ��");
				System.out.println(count +") "+ ""+check[r]+" ��");
				System.out.println(count +") "+ check[r]+" ī");
				System.out.println(count +") "+ i+" Ÿ");
				count++;
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}

}
