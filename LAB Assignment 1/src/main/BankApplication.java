import banking.*;
import util.*;


import java.util.Scanner;
import java.io.Console;
public class BankApplication{
	public static void main(String[] args){
		Console passwordReader = System.Console();
		Scanner input = new Scanner(System.in);
		System.out.printf("%s","Enter Account Number: ");
		String accCode=input.next();
		System.out.printf("%s","Enter 4 digit Pin ");
		String tempPin = "0000";
		if (BankingSystem.LoginProcessor.authenticate(accCode , tempPin)) {
			System.out.println("Access Granted!");
       	 	} 
		else {
           		 System.out.println("Invalid credentials!");
        		}

		
	}
}
