package ly_thuyet;

import java.util.Scanner;
  // Cách gắn dữ liệu 
public class bai_tap5 {
      public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		    float a;
		    System.out.println("Nhập vào số a = ");
		    // Các phép gắn
		    a = sc.nextFloat();
		    System.out.println("a = "+ a);
		    a+=3;  // a = a + 3;
		    System.out.println("a+=3 : " + a);
		    a-=2;   // a = a - 2;
		    System.out.println("a-=2 :" + a);
		    a*=4;  // a = a * 4;
		    System.out.println("a*=4 :" + a);
		    a/=4;   // a = a / 4;
		    System.out.println("a/=4 :" + a);
		    a%=4;   // a = a % 4;
		    System.out.println("a%=4 :" + a);
	}
}
