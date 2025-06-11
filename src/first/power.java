package first;

import java.util.Scanner;

public class power {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int base = sc.nextInt();
		int exponent = sc.nextInt();
		double power= Math.pow(base,exponent);
		System.out.println(power);

	}

}
