package ly_thuyet;

public class bai_tap0 {
        int x, y, z;
        bai_tap0(){
        	x=y=z=0;
        	 this.outData();
        }
	  bai_tap0(int x, int y, int z){
		  this.x=x; this.y=y; this.z=z;
		  this.outData();
	  }
	  void outData() {
		  System.out.println(""+ x +", "+ y +", "+ z);
	  }
	  public static void main(String[] args) {
		bai_tap0 b1= new bai_tap0(6,9,0);
		bai_tap0 b2= new bai_tap0(5,6,7);
	}
}
 