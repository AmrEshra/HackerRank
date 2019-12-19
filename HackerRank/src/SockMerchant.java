
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class SockMerchant {

	// Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	
    	HashMap<Integer, Integer> countMap = new HashMap<>();
    	int count ;
    	for (int i = 0 ; i < n ; i++) {
    		count = countMap.get(ar[i]) == null ? 0 : countMap.get(ar[i]);
    		countMap.put(ar[i], ++count);
    	}

    	int pairCount = 0 ;
    	for (Entry<Integer, Integer> me : countMap.entrySet()) {
    		pairCount += me.getValue() / 2;
    	}
        
    	return pairCount;

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

        int result = sockMerchant(n, ar);
        System.out.println(result);
        scanner.close();
    }

}
