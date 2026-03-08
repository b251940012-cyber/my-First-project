package lab2;
import java.util.Scanner;
public class lab2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double p = 3.14, toirog, rad, perimeter;
		System.out.printf("Radiusaa oruulna uu?");
		rad = input.nextDouble();
		perimeter = 2 * p * rad;
		System.out.printf("Sum is %f", perimeter);
		input.close();
	}
}