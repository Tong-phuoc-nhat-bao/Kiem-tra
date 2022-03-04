package baitap1;

import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Nhap so thu 1: ");
			float a = input.nextFloat();
			System.out.print("Nhap so thu 2: ");
			float b = input.nextFloat();
			a = (Math.round(a)-a)*1000;
			b = (Math.round(b)-b)*1000;
			if (Math.round(a)==Math.round(b))
			{
				System.out.print("They are the same");
			}else {
				System.out.print("They are different");
			}
		}catch(Exception e) { 
			System.out.println("Nhap sai du lieu");
		}
	}
}
