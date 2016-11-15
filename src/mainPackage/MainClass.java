package mainPackage;

import java.util.Scanner;

import geomethricalFigures.Circle;
import geomethricalFigures.Rectangle;
import geomethricalFigures.Triangle;

public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean continueGame = true;
		while (continueGame) {

			System.out.println("Please choose a figure (triangle, rectangle or circle):");
			String figureName = scanner.nextLine();

			if (figureName.equalsIgnoreCase("triangle")) {
				Triangle t = new Triangle();
				t.playGame();
			}

			else if (figureName.equalsIgnoreCase("circle")) {
				Circle c = new Circle();
				c.playGame();
			}

			else if (figureName.equalsIgnoreCase("rectangle")) {
				Rectangle r = new Rectangle();
				r.playGame();
			} else {
				System.out.println("input error");
			}
			System.out.println("Would you like to continue? yes / no");
			String a = scanner.nextLine();
			if (a.equalsIgnoreCase("no")) {
				continueGame = false;
				System.out.println("Thank you for play!");
			} else if (a.equalsIgnoreCase("yes")) {

			}
		}
	}
}
