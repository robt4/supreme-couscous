package drone2022;
import java.lang.*;
import java.util.Objects;
import java.util.Scanner;




public class Flying {
	
public int canfly() {                                             

	   System.out.println("Hello "+ num(nameIt));                                        //assigning nameIt as argument 
	                                                             //Checking if its the user name is true or false
	   //Scanner 
	   return 0;
	}
   public String nameIt;                                      //object to store myname
   
   private String num(String yours) {                      //checking to see if name matches the private data yours
	   int k=5;
	   
	   if((yours.equals("Robert"))||(yours.equals("robert"))){        //can use compareToIgnore() too
		   return yours;
	   }else {
		   throw new IllegalArgumentException();                        //shows error if the name doesnt match
	   }
	   
   }public int call(int x) {                                  //calls the private password checker assigns argument from sharp
	   
	  passWord2(x);
	   return 0;
   }
   private int passWord2(int y) {                          //private funtcion to check if password is 1 from sharp class"password can be anythting"
	   
	   int x=1;
	   System.out.println("testing : "+y);
	   if(x== y) {
		   return 0;
		   
	   }else {
		   throw new IllegalArgumentException();
		   
	   }
	   
   }
}
