package ly_thuyet;

import java.util.Scanner;
  // Các phép toán so sánh
public class bai_tap6 {
      public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		    int a, b;
		    System.out.println("Nhập a = ");
		    a = sc.nextInt();
		    System.out.println("Nhập b = ");
		    b = sc.nextInt();
		    
		    // Xuất kết quả so sánh
		    System.out.println(a +" == "+b+" : "+(a==b));
		    System.out.println(a +" != "+b+" : "+(a!=b));
		    System.out.println(a +" < "+b+" : "+(a<b));
		    System.out.println(a +" <= "+b+" : "+(a<=b));
		    System.out.println(a +" > "+b+" : "+(a>b));
		    System.out.println(a +" >= "+b+" : "+(a>=b));
		    System.out.println("==========");
		    System.out.println("Cả hai số là số chẵn: "+(a%2==0 && b%2==0));
		    System.out.println("Cả hai số là số chẵn: "+(a%2==0 || b%2==0));
	}
}
