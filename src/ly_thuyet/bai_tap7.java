package ly_thuyet;
// Toán tử điều kiện
import java.util.Scanner;

public class bai_tap7 {
    public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Nhập a: ");
		  int a = sc.nextInt();
		  
		  String ketQua = (a%2==0)?"số chẵn":"số lẻ";
		  System.out.println(a + " là "+ ketQua);
	}
}
