package arrayAverage;
import java.util.Scanner;
public class ArrayIntro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students");
		int n = sc.nextInt();
		int[] marks = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter marks");
			marks[i] = sc.nextInt();
			
		}
		int avg = 0;
		for(int j = 0;j<n;j++)
		{
		avg += marks[j];	
		}
		avg /= n;
		System.out.println("Average of marks " +avg);

	}

}
