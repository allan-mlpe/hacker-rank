import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HackerRank_CountingValleys {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			br.readLine();
			
			int valleyNum = 0;
			int position = 0;
			String stepSequence = br.readLine();
			
			for (int i = 0; i < stepSequence.length(); i++) {
				char step = stepSequence.charAt(i);
				
				position = step == 'U' ? ++position : --position;
				
				if(position == 0 && step == 'U') ++valleyNum;
			}
			
			System.out.println(valleyNum);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
