package bridgelabz;

import java.util.Scanner;

public class perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("length and width of rectangle: ");
		int l = sc.nextInt();
		int w = sc.nextInt();
		int p = 2 * (l + w);
		System.out.println(p);
	}

}
