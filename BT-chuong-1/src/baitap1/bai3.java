package baitap1;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Nhap so: ");
			float a = input.nextFloat();
			if(a==0) {
				System.out.print("Zero");
			}else if (a<-1000000) {
				System.out.print("Small");
			}else if (a>1) {
				System.out.print("Positive");
			}else if(a>1000000) {
				System.out.print("Large");
			}else {
				System.out.print("Negative");
			}
			
		}catch(Exception e) { 
			System.out.println("Nhap sai du lieu");
		}
	}
}
