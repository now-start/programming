package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		while (true) { // Was it a cat I saw? 가 나올때 까지 계속 입력
			String a = sc.nextLine();
			if (a.equals("Was it a cat I saw?")) {
				break;
			}
			System.out.println(a);
		}
	}

}
