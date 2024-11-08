package digid_ios;

import java.util.Scanner;

public class Digid_ios {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double percentage = input.nextDouble();

		int X = (int) (percentage * 10);
		int o = 10 - X;

		for (int i = 0; i < X; i++) {
			System.out.print("X");

		}

		for (int i = 0; i < o; i++) {
			System.out.print("0");
		}

    }

}