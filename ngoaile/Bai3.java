package ngoaile;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = 0,number2 = 0;
		try{
		System.out.println("Nhap toan hang 1:");
		number1 = input.nextInt();
		System.out.println("Nhap toan hang 2:");
		number2 = input.nextInt();
		}catch(InputMismatchException ex) {
			System.out.println("Ban da nhap sai toan hang, xin vui long chi nhap so");
			
		}
		
		input.nextLine();
		System.out.println("Nhap toan tu");
		String str = input.nextLine();
		switch(str) {
		case"+": {
			System.out.print(number1+" + "+number2+"= "+(number1+number2));
		}
		break;
		case"-": {
			System.out.print(number1+" - "+number2+"= "+(number1-number2));
		}
		break;
		case"x": {
			System.out.print(number1+" + "+number2+"= "+(number1*number2));
		}
		break;
		case"/": {
			System.out.print(number1+" + "+number2+"= "+(number1+number2));
		}
		break;
		default: {
			System.out.println("Ban da nhap sai toan tu xin vui long nhap lai");
		}
		}
	}

}
