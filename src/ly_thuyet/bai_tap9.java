package ly_thuyet;

import java.util.Scanner;
   // Các câu lệnh điều kiện if... else
public class bai_tap9 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n;
	  System.out.println("Nhập số  nguyên n: ");
	    n = sc.nextInt();
	    
	    if(n % 2 == 0) {
	    	System.out.println(n +" Là số chẵn");
	    	
	    }else {
	    	System.out.println(n +" Là số lẻ");
	    }
}
}
