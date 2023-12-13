package Lab;
import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your marks: ");
		Scanner obj = new Scanner(System.in);
		int marks= obj.nextInt();
		switch(marks/10) {
		case 10:
		case 9:System.out.println("O");
		break;
		case 8:System.out.println("A");
		break;
		case 7:System.out.println("B");
		break;
		case 6:System.out.println("C");
		break;
		case 5:System.out.println("D");
		break;
		case 4:System.out.println("E");
		break;
		default:System.out.println("F");
		
		}
		
	}

}
