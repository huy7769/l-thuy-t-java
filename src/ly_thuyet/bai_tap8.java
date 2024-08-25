package ly_thuyet;

import java.util.Scanner;
 // Lớp Math và các hàm toán học  
public class bai_tap8 {
     public static void main(String[] args) {
	     double a, b;
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Nhập vào số a: ");
	     a = sc.nextDouble();
	     System.out.println("Nhập vào số b: ");
	     b = sc.nextDouble();
	     
	   
	     // Hàm trị tuyệt đối 
	     System.out.println("|a|= " +Math.abs(a));
	     
	     // Hàm tìm max
	     System.out.println("max(a, b)= " +Math.max(a, b));
	     
	     // Hàm tìm min
	     System.out.println("min(a, b)= "+Math.min(a, b));
	     
	     //Hàm ceil
	     System.out.println("ceil(a)= "+Math.ceil(a));
	     
	     //Hàm floor
	     System.out.println("floor(a)= "+Math.floor(a));
	     
	     //Hàm căn bậc hai sqrt
	     System.out.println("sqrt(a)= "+Math.sqrt(a));
	     
	     //Hàm tính a^b
	     System.out.println("a^b = " +Math.pow(a, b));
  }
}
