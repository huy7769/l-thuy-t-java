package ly_thuyet;

import java.util.Scanner;
 // Câu lệnh switch....case
public class bai_tap_10 {
     public static void main(String[] args) {
    	    Scanner sc = new Scanner(System.in);
       int n;
       System.out.println("Nhập số nguyên từ 0 đến 8: ");
       n = sc.nextInt();
       
       switch(n) {
       case 2: {
    	   System.out.println("Thứ hai ");
    	   break;
    	 
       }
       case 3:{
    	   System.out.println("Thứ ba");
           break;
       }
       case 4:{
    	   System.out.println("Thứ tư");
           break;
       }
       case 5:{
    	   System.out.println("Thứ năm");
           break;
       }
       case 6:{
    	   System.out.println("Thứ sáu");
           break;
       }
       case 7:{
    	   System.out.println("Thứ bảy");
           break;
       }
       case 8:{
    	   System.out.println("Thứ chủ nhật");
           break;
       }
       default:
    	   System.out.println("Nhập dữ liệu sai!");
       }	   
    	    
    	    
}
}