package ly_thuyet;

import java.util.Scanner;
  // Vòng lặp while 
public class bai_tap12 {
         public static void main(String[] args) {
        	 int x = 1;
        	 Scanner sc = new Scanner(System.in);
  	         while(x!=0){
  	        	 System.err.println("Nhập x = 0 để thoát; Nhập ký tự khác để tiếp tục");
  	        	 x = sc.nextInt();
  	         }
  	   
  	         int i = 0;
  	         while(true) {
  	        	 System.out.println(i);
  	        	 i++;
  	        	 if(i==10)
  	        		 break;
  	         }
   }
}
