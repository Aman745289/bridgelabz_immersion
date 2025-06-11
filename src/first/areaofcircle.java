package first;
import java.util.*;

public class areaofcircle {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int radius = sc.nextInt();
	int height = sc.nextInt();
	double Volume = (Math.PI * radius*2 * height);
	System.out.println(Volume);
	}

}
