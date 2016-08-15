package ngoaile;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		int[] arrInt = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap vi tri cua phan tu trong mang");
		int index = input.nextInt();
		try{
		System.out.println("arrInt["+ index+"] = ");
			arrInt[index] = input.nextInt();
		}catch(IndexOutOfBoundsException e) {
			if(index<0 && index>9) {
			System.out.println("vi tri ban can nhap nam ben ngoai mang, vui long nhap lai.");
			}
		}
		
	}

}
