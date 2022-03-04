package baitap1;
import java.util.Scanner;
public class bai4 {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Nhap so: ");
			int a = input.nextInt();
			if (7<a || a<1) {
				System.out.print("Khong co ngay trong tuan");
			}else if (a==7) {
				System.out.print("Sunday");
			}else if (a==1) {
				System.out.print("Monday");
			}else if (a==2) {
				System.out.print("Tuesday");
			}else if (a==3) {
				System.out.print("Wednesday");
			}else if (a==4) {
				System.out.print("Thursday");
			}else if (a==5) {
				System.out.print("Friday");
			}else if (a==6) {
				System.out.print("Saturday");
			}
		}catch(Exception e) { 
			System.out.println("Nhap sai du lieu");
		}
	}
}
