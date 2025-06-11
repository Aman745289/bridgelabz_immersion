package bridgelabz;

import java.util.*;
public class Areacircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("radius of circle");
		int r = sc.nextInt();
		double area = Math.PI * r*r;
		System.out.println("area:" + area);
	}
}
