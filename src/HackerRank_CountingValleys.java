import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HackerRank_CountingValleys {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			br.readLine();
			boolean downSeaLevel = false;
			int valleyNum = 0;
			int position = 0;
			String stepSequence = br.readLine();
			
			for (int i = 0; i < stepSequence.length(); i++) {
				char step = stepSequence.charAt(i);
				
				if(step == 'D' && position == 0) {
					downSeaLevel = true;
					--position;
				} else if(step == 'U' && position == -1) {
					downSeaLevel = false;
					++position;
					valleyNum++;
				} else {
					position = step == 'U' ? ++position : --position;
				}
			}
			
			System.out.println(valleyNum);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
