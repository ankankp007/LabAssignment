package Lab;

import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int total_water_adviced = 5000;
		System.out.println("Enter quantity of water Alice drank today : ");
		int water_drank = obj.nextInt();
		
		if(water_drank >= total_water_adviced) { 
			System.out.println("\"Yes, Alice is following doctor's advice\"");
		} else {
			System.out.println("\"No, Alice is not following doctor's advice\"");
		}
		
		obj.close();
	}
}
