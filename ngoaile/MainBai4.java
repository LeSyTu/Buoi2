package ngoaile;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainBai4 {

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
			Triangle triangle = new Triangle(side1, side2, side3);
			}catch(IllegalArgumentException e) {
				System.out.println("Do dai 3 canh khong thoa man: ");
			}
			
		} catch(InputMismatchException e) {
			System.out.println("Do dai cua 1 canh la so");
		}
		

	}

}
