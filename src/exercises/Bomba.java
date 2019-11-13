package exercises;

import java.util.Scanner;

public class Bomba {
	public static void main(String[] args) {
		int xa, ya, xb, yb, reps = 0, actualX, actualY = 0, alarms = 0;
		Scanner sc = new Scanner(System.in);

		xa = sc.nextInt();
		ya = sc.nextInt();
		xb = sc.nextInt();
		yb = sc.nextInt();

		reps = sc.nextInt();

		for (int aux = 0; aux != reps; aux++) {
			actualX = sc.nextInt();
			actualY = sc.nextInt();

			if (actualX <= xa) {
				if (actualY >= ya) {
					if (actualX >= xb) {
						if (actualY <= yb) {
							alarms++;
						}
					}
				}
			}
		}

		int safe = reps - alarms;
		if (safe == reps) {
			System.out.println("SAFE");
		} else {
			System.out.printf("ALARM\n%d", alarms);
		}
		sc.close();
	}
}