package Lab;
import java.util.Scanner;

public class Q08 {
			public static void main(String[] args) {
				float x, y;
				
				Scanner obj = new Scanner(System.in);
				System.out.println("(x ,y) coordinates of a point in the Cartesian plane.");
				System.out.println(" X-Coordinate : ");
				x = obj.nextFloat();
				System.out.println(" Y-Coordinate : ");
				y = obj.nextFloat();
				
				if(x > 0.0f && y > 0.0f) {
					System.out.println("( " + x + ", " + y + " ) is in Quadrant I");
				} else if(x < 0.0f && y > 0.0f){
					System.out.println("( " + x + ", " + y + " ) is in Quadrant II");
				} else if(x < 0.0f && y < 0.0f) {
					System.out.println("( " + x + ", " + y + " ) is in Quadrant III");
				} else if(x > 0.0f && y < 0.0f) {
					System.out.println("( " + x + ", " + y + " ) is in Quadrant IV");
				}  
				else if(x == 0.0f && y != 0.0f) {
						System.out.println("( " + x + ", " + y + " ) is on the y-axis ");
					} else if(x != 0.0f && y == 0.0f) {
						System.out.println("( " + x + ", " + y + " ) is on the x-axis ");
					} else {
						System.out.println("Something went Wrong.");
					}
		 		}
				
			}
		


