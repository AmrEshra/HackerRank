
import java.io.IOException;
import java.util.Scanner;

public class JumpingOnClouds {

	// Complete the sockMerchant function below.
    static int jumpingOnClouds(int[] arr) {
    	
    	int count = 0 ;
    	int i = 0;
    	while (i < arr.length) {
    		if(i+2 < arr.length && arr[i] == arr[i+2]) {
    			i = i + 2;
    			count ++;
    		}
    		else if(i+1 < arr.length && arr[i] == arr[i+1]) {
    			i = i + 1;
    			count ++;
    		}
    		else
    			i++;
    	}
        
    	return count;

    }
    
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = jumpingOnClouds(ar);
        System.out.println(result);
        scanner.close();
    }

}
