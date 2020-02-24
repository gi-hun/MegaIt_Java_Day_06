/*
 * # 영화관 좌석예매
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
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
			System.out.println("==롯데시네마==");
			System.out.println("1. 좌석 선택");
			System.out.println("2. 예매 가격");
			System.out.println("3. 종료");
			System.out.println("메뉴를 선택하세요");
			int menu = sc.nextInt();
			
			if(menu == 1)
			{
				System.out.print("seat = ");
				for(int i=0; i<7; i++ )
				{
					System.out.print(seat[i]+" ");
				}
				System.out.println(" ");
				
				System.out.println("좌석을 선택하세요:");
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
							System.out.println("이미 예매가 완료된 자리입니다.");
							break;
						}
						
					}
					System.out.print(seat[i]+" ");
				}
				
				System.out.println(" ");
				
			}

			else if(menu == 2)
			{
				System.out.println("예매 가격은" + 12000*count + "원");
			}
			
			else if(menu == 3)
			{
				System.out.println("종료");
				break;
			}
			
		}
		
	}
}
