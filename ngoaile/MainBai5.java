package ngoaile;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainBai5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double side1, side2, side3;
		try {
			System.out.println("Nhap do dai canh thu nhat: ");
			side1 = input.nextDouble();
			System.out.println("Nhap do dai canh thu hai: ");
			side2 = input.nextDouble();
			System.out.println("Nhap do dai canh thu ba: ");
			side3 = input.nextDouble();
			try {
				TriangleB5 trg = new TriangleB5(side1, side2, side3);
			} catch (IllegalTriangleException e) {
				System.out.println(e.getMessage());
			}

		} catch (InputMismatchException e) {
			System.out.println("Do dai cua 1 canh la so");
		}

	}

}
