package ly_thuyet;
   // break, continue, return
public class bai_tap15 {
 //      public static void main(String[] args) {
    	   // BREAK	
//		  int out, in = 0;
//		outer:  for(out = 0; out < 10; out++) {
//			  for(in = 0; in < 20; in++) {
//				  if(in > 10)
//					  break outer;
//			  }
//			  System.out.println("Bên trong vòng lặp out = " + out +" in = " + in);
//		  }
//		  System.out.println("Bên ngoài  vòng lặp out = "+ out +" in = " + in);
//	}
//	
//
	
//    	public static void main(String[] args) {
//	         CONTINUE
//          int max = 100;
//          for(int i = 0; i < max; i++) {
//        	  if(i < 50)
//        		  continue;
//        	  System.out.println(i);
//          }
//       }   
	
//	     public static void main(String[] args) {
//	  outer: for(int i = 2; i <= 9; i++) {
//				 for(int j = 1; j <= 10; j++) {
//					 if(i < 5)
//						  continue outer;
//					 System.out.println(i+ " x " + j +" = "+(i*j));
//				 }
//				 System.out.println("---------");
//			 }
	
	        public static void main(String[] args) {
	        	//RETURN
	        	
	        	for(int i = 2; i <= 9; i++) {
	   			   for(int j = 1; j <= 10; j++) {
	   				   if(i < 5)
	   					   return;
	   				 System.out.println(i+ " x " + j +" = "+(i*j));
	   			 }
	   			  
	   			 System.out.println("---------");
	   		  }
			}
	            
	    	
	    	
	    	
	    	}
	
	
	
	
	
