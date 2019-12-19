

import java.util.Arrays;
import java.util.Scanner;

public class JavaScanner {

	public static void main(String[] args) {

		// ScanInteger();
		 ScanArray();
//		Scanner_();

	}

	private static void Scanner_() {

		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		double d = scan.nextDouble();
		
		String s = scan.next();
		s += scan.nextLine();
		// Write your code here.

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
		
		scan.close();

	}

	private static void ScanInteger() {

		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		int b;
		b = in.nextInt();
		int sum;
		sum = a + b;
		System.out.println(sum);

	}

	private static void ScanArray() {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}

		int sum = 0;
		for (int arr_i = 0; arr_i < n; arr_i++) {
			sum += arr[arr_i];
		}

		System.out.println(sum);

//		 sort array
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
