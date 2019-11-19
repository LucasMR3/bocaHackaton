package exercises;

import java.util.Scanner;

public class Bomba {
	public static void main(String[] args) {
		int xA, yA, xB, yB, reps = 0, actualX, actualY = 0, alarms = 0, safe = 0;
		Scanner sc = new Scanner(System.in);

		xA = sc.nextInt();
		yA = sc.nextInt();
		xB = sc.nextInt();
		yB = sc.nextInt();

		reps = sc.nextInt();

		for (int aux = 0; aux != reps; aux++) {
			actualX = sc.nextInt();
			actualY = sc.nextInt();

			if (actualX <= xA && actualY >= yA && actualX >= xB && actualY <= yB)
				alarms++;
			else
				safe++;
		}

		if (safe == reps)
			System.out.print("SAFE");
		else
			System.out.printf("ALARM\n%d", alarms);

		sc.close();
	}
}