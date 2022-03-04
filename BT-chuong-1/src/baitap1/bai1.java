package baitap1;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Nhap so: ");
			float a = input.nextFloat();
			if(a<0) {
				System.out.print("Negative");
			}else {
				System.out.print("Positive");
			}
		}catch(Exception e) { 
			System.out.println("Nhap sai du lieu");
	}
	}
}
