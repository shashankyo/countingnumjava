package numcount;

import java.util.Scanner;

public class counting {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number to count:");
	int num = scan.nextInt();
	int count =0;
	while(num != 0)
	{
		num = num / 10;
		count = count +1;
	}
	System.out.println("the number of digit is"+ count);
}
}
