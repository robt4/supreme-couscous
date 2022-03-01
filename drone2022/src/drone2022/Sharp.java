package drone2022;
//use import statemtnt to import another class from a diff package
import java.util.ArrayList;
import java.util.Scanner;

public class Sharp {
    private static ArrayList num1(ArrayList num) {                       //playing with arraylist
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
         System.out.println("starting now 2"+num);                 //tip Syso cltr+spacebar
         numbers();
         falseTrue(h);                                             //calling to start checking password/username
                  
	}public static  int numbers() {
		int checker=9;
		return checker;
	}
	
	public static  boolean falseTrue(boolean h) {
		int numbrs = 90;int utis=numbers();
		                                                   //creating num object to fill in the class flying with values plus calling e.t.c
		Flying num=new Flying();
		Scanner input=new Scanner(System.in);               //Scanner object
		System.out.println("Enter your name: ");
		num.nameIt=input.nextLine();                        //Reading input and assigning it 
		num.canfly();                                       //object to access function in flying java
		System.out.println("Enter your password: ");
	    passWord();
	    System.out.println("Succesfully login: ");
		return h;
		
	}public static int passWord() {
		int y=0;
		Scanner input2=new Scanner(System.in); 
		y=input2.nextInt();
		Flying num=new Flying();
		num.call(y);
		return y;
	}

}
