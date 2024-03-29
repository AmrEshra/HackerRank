
import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

	// Complete the sockMerchant function below.
    static int countingValleys(int n, String s) {
    	
        int valleysCount = 0 ;
        int countU = 0;
        int countD = 0;
        for (int i = 0 ; i < n ; i++) {
            if(s.charAt(i) == 'U') {
                countU ++;
            }
            else
                countD ++;
            
            if(countU == countD && s.charAt(i) == 'U')
                valleysCount++;
        }

        return valleysCount ;

    }
    
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    	int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);
        System.out.println(result);
        scanner.close();
    }

}
