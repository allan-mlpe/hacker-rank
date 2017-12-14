import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HackerRank_JavaSubstringComparisons {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String text = br.readLine();
			int substringSize = Integer.parseInt(br.readLine());
			
			String regex = "\\w{%d}";
			
			Pattern pattern = Pattern.compile(String.format(regex, substringSize));
			List<String> dict = new ArrayList<String>();
			
			for(int i = 0; i <= text.length() - substringSize; i++) {
				Matcher matcher2 = pattern.matcher(text.substring(i));
				matcher2.find();
				dict.add(matcher2.group());		
			}
			
			Comparator<String> comparator = new Comparator<String>() {
				
				@Override
				public int compare(String o1, String o2) {
					return o1.compareTo(o2);
				}
			};
			
			dict.sort(comparator);
			
			/*dict.forEach(str -> 
				System.out.println(str)
			);*/
			
			System.out.println(dict.get(0));
			System.out.println(dict.get(dict.size() -1));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
