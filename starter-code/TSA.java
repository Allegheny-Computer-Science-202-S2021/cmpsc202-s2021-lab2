import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class TSA {
    public static int[] generate(int[] prices){
        /*
        Data is prepared by inserting random values 
        up to 100. Data items may be repeated. 
        Please refer to slides for the problem definiton.
        */
        Random rand = new Random(); 
        for (int i = 0; i < prices.length; i++){
                prices[i] = rand.nextInt(100);
        }
        return prices;
    }  
    public static int[] computeSpan(int[] prices){
        int[] span = new int[prices.length];
        /*
        Add your logic below to compute the Span for 
        all days and insert the values into the Span array.*/
        


        return span;
    }

    public static void main(String[] args) {
        System.out.println("Enter the no of days:");
        Scanner scan = new Scanner(System.in);
        int days = scan.nextInt();
        int[] prices_initialized = new int[days]; 
        int[] prices_populated = generate(prices_initialized);

        // a set of days and their respective prices. 
        /* does a random distribution of prices.
        */
        
        /* Implement the computeSpan method, so as to 
        get the correct results.*/
        int[] span = computeSpan(prices_populated);
        
        /* The two lines below will print the output. 
        Do not uncomment these lines.  */
        System.out.println("Prices:\t" + Arrays.toString(prices_populated));   
        System.out.println("Span:\t" + Arrays.toString(span));   
        
    }   
}
