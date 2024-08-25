package ly_thuyet;
    // Cách bắt lỗi ngoại lệ bằng try catch 
import java.util.Scanner;

public class bai_tap16 {
       public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		     int n = 0;
		     try {
		     System.out.println("Nhập số nguyên");
		     n = sc.nextInt();
		     }catch (Exception e) {
		    	 System.out.println("Nhập dữ liệu không đúng");
		     }finally {
		    	 System.out.println("Finally!");
		     }
		     System.out.println("Giá trị nhập là "+ n);
		     System.out.println("Kết thúc chương trình");
	}
}
