import java.util.Scanner;
import java.util.TreeSet;


public class HackerRank_TheHurdleRace {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int k = in.nextInt();
	    int count=0;
	    int val=0;
	    TreeSet<Integer> arr=new TreeSet<Integer>();
	    for(int i=0;i<n;i++)
	        {
	        val=in.nextInt();
	        arr.add(val);
	    }
	    if(k<arr.last())
	        count=arr.last()-k;
	    System.out.println(count);

	    in.close();
	}

}
