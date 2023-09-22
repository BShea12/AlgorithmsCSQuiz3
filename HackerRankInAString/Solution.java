import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    
    public static boolean hackerrankHelper(String s, int n){
        String h = "hackerrank";
        int pos = s.indexOf(h.charAt(n));
        if(pos != -1){
            if(n == 9){
                System.out.println(s);
                return true;
            }
            //System.out.println(s.substring(pos, s.length()));
            return hackerrankHelper(s.substring(pos, s.length()), n + 1);
        }
        return false;
    }
    public static String hackerrankInString(String s) {
    // Write your code here
        if(hackerrankHelper(s, 0)){
            //System.out.println("Y");
            return "YES";
        }
        //System.out.println("N");
        return "NO";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.hackerrankInString(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
