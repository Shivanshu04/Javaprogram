import java.util.* ;
import java.io.*; 
class componrinterst {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		int principal = scanner.nextInt();
		float rate = scanner.nextFloat();
		int time = scanner.nextInt();

		float SimpleInterest = (principal * rate * time) / 100;

		System.out.println((int)SimpleInterest);
		
	}
}