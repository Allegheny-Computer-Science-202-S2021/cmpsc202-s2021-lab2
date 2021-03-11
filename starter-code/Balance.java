import java.util.*;
public class Balance{
	private static int calls = 0, limit = 2;
	public static int[] generate(int[] balls) {
		Random rand = new Random();
		int genuine_weight = rand.nextInt(6)+19;
		int defective_weight = rand.nextInt(6)+30;
		int defective_position = rand.nextInt(balls.length);
		for (int i = 0; i < balls.length; i++){
			if (i != defective_position )
				balls[i] = genuine_weight;
		}
		balls[defective_position] = defective_weight;
		return balls;
	}
	public static int balance(int[] balls, Map<String, Integer> left, Map<String, Integer> right) {
		if (calls == limit){
        	System.out.println("The program is quitting because balance is called more than " + limit + " times ...");
        	System.exit(0);
        }
	    else
	        calls += 1;
	    
	    int lsum = 0;
	    for(int i = left.get("start"); i < left.get("end")+1; i++)
	    	lsum += balls[i];
	    
	    int rsum = 0;
	    for(int i = right.get("start"); i < right.get("end")+1; i++)
	        rsum += balls[i];

	    if (lsum == rsum)
	        return 0;
	    else if (lsum > rsum)
	        return -1;
	    else
	        return 1;
	}
	public static int puzzle(int[] balls){
		int result = 0;
		// add your logic here ....
		return result;
	}
	public static void main(String[] args) {
		int[] ball_weights = new int[9]; // a set of coins and their respective weights.
		/* does a random distribution of weights, while still
		making sure to be within the scope of the problem definition,
		that is, all values except one will be the same.
		the number of balls is fixed to 9.
		*/
		int[] balls = generate(ball_weights);
		System.out.println(Arrays.toString(balls));	
		System.out.println(puzzle(balls));
    	
		
	
	}	
}
