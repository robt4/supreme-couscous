package drone2022;

import java.util.ArrayList;

public class Sharp {
    private static ArrayList num1(ArrayList num) {
    	int xyz=0;
    	num.add(77);
    	num.add(90);
    	return num;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList num = new ArrayList();boolean h=true;
		 num.add(78);
		 System.out.println("starting now1: "+num);
		 num1(num);
         System.out.println("starting now 2"+num);
         numbers();
         falseTrue(h);
         
	}public static  int numbers() {
		int checker=9;
		return checker;
	}
	
	public static  boolean falseTrue(boolean h) {
		int numbrs = 90;int utis=numbers();
		//this.utis=numbrs;
		Flying num=new Flying();
		num.nameIt="Razor";
		num.canfly();
		
	    if(h==true) {
	    	System.out.println("Ystem works: ");
	    }else {
	    	System.out.println("Ystem doesnt work: ");
	    }
		return h;
		
	}

}
