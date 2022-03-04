package baitap1;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			int num1,num2,num3,max;
			System.out.print("Nhap so thu 1: ");
			num1 = input.nextInt();
			System.out.print("Nhap so thu 2: ");
			num2 = input.nextInt();
			System.out.print("Nhap so thu 3: ");
			num3 = input.nextInt();
			max = num1;
			if (max<num2) {
				max=num2;
			}
			if (max<num3) {
				max=num3;
			}
			System.out.println("So lon nhat la: "+ max);
		}catch(Exception e) { 
			System.out.println("Nhap sai du lieu");
		}
	}
}
