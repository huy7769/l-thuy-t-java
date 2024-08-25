package ly_thuyet;

import java.util.Scanner;

public class bai_tap1 {
/*
 * Cách nhập xuất dữ liệu từ 
 * bàn phím trong Java
 */
	private static Scanner sc;
	 public static void main(String[] args) {
		 sc = new Scanner(System.in);
		 System.out.println("Nhập họ và tên: ");
		 String hoVaTen = sc.nextLine();
		 
		 System.out.println("Nhập mã sinh viên");
		 long maSinhVien = sc.nextLong();
		 
		 System.out.println("Nhập điểm thi: ");
		 float diemThi = sc.nextFloat();
		 
		 System.out.println("-------");
		 System.out.println("Họ và tên: " +hoVaTen);
		 System.out.println("Mã sinh viên: " +maSinhVien);
		 System.out.println("Điểm thi: " +diemThi);
	}

	
	
}
