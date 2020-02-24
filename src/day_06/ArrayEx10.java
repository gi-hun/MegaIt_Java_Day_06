/*
 * # 즉석복권
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 * 2. 아래 3종류의 복권의 당첨여부를 출력한다.
 */
//01:36-01:48

package day_06;

import java.util.Scanner;

public class ArrayEx10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] lotto1 = { 0, 0, 7, 7, 7, 0, 0, 0 }; // int[7]
		int[] lotto2 = { 7, 0, 7, 7, 0, 0, 0, 0 };
		int[] lotto3 = { 7, 0, 7, 7, 7, 0, 7, 0 };

		int count = 0;

		while (true) {
			System.out.println("[1]번복권 결과확인");
			System.out.println("[2]번복권 결과확인");
			System.out.println("[3]번복권 결과확인");
			System.out.println("[4]종료");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				for (int i = 2; i < 9; i++) {
					if ((lotto1[i - 2] == 7) && (lotto1[i - 1] == 7)) {
						count++;
						if ((lotto1[i - 1] == 7) && (lotto1[i] == 7)) {
							count++;
						}
					}
				}
				if (count == 3) {
					System.out.println("당첨");
				} else {
					System.out.println("꽝!");
				}
			} else if (sel == 2) {
				count = 0;
				for (int i = 2; i < 9; i++) {
					if ((lotto2[i - 2] == 7) && (lotto2[i - 1] == 7)) {
						count++;
						if ((lotto2[i - 1] == 7) && (lotto2[i] == 7)) {
							count++;
						}
					}
				}
				if (count == 3) {
					System.out.println("당첨");
				} else {
					System.out.println("꽝!");
				}
			} else if (sel == 3) {
				count = 0;
				for (int i = 2; i < 9; i++) {
					if ((lotto3[i - 2] == 7) && (lotto3[i - 1] == 7)) {
						count++;
						if ((lotto3[i - 1] == 7) && (lotto3[i] == 7)) {
							count++;
						}
					}
				}
				if (count == 3) {
					System.out.println("당첨");
				} else {
					System.out.println("꽝!");
				}
			} else if (sel == 4) {
				System.out.println("종료");
				break;
			}

		}
	}
}
