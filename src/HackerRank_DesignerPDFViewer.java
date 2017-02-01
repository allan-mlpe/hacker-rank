import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class HackerRank_DesignerPDFViewer {
	public static void main(String[] args) {
		//este map vai conter um mapeamento das letras de a-z e suas respectivas alturas
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			//97 corresponde ao caractere 'a' na tabela ASCII
			//ao passo que 122 corresponde ao caractere 'z'
			for(int i= 97; i < 123; i++) {
				map.put((char)i, Integer.parseInt(st.nextToken()));
			}
			
			String s = br.readLine();
			int width = s.length();
			int maxHeight = 0;
			for (int i = 0; i < s.length(); i++) {
				int charHeight = map.get(s.charAt(i)); 
				maxHeight = charHeight > maxHeight ? charHeight : maxHeight;
			}
			
			System.out.println(maxHeight * width);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
