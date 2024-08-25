package ly_thuyet;
// Các phép toán cơ bản
import java.util.Scanner;
public class bai_tap3 {
       public static void main(String[] args) {
		  // Khai báo biến 
    	   int a, b;
    	   
    	   // Nhập dữ liệu 
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("Nhập a = ");
    	   a = sc.nextInt();
    	   System.out.println("Nhập b = ");
    	   b = sc.nextInt();
    	   
    	   int tong = a + b;
    	   System.out.println(a+" + "+ b + " = "+tong);
    	   int hieu = a - b;
    	   System.out.println(a+" - "+b+" = "+hieu);
    	   int nhan = a * b;
    	   System.out.println(a+" * "+b+" = "+nhan);
    	   float thuong = (float)a / b;
    	   System.out.println(a+" / "+b+" = "+thuong);
    	   int soDu = a % b;
    	   System.out.println(a+" % "+b+" = "+soDu);
    	   
    	   
	}
}
