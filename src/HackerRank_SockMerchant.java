import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class HackerRank_SockMerchant {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			Map<String, Integer> map = new HashMap<String, Integer>();
			
			while(st.hasMoreTokens()) {
				String sock = st.nextToken();
				if(map.containsKey(sock)) {
					Integer oldValue = map.get(sock);
					map.replace(sock, ++oldValue);
				} else {
					map.put(sock, 1);
				}
			}
			
			int count = 0;
			
			for(Integer value : map.values()) { //o método values retorna uma coleção com os valores do map (sem considerar as chaves)
				count += Math.floorDiv(value, 2); //floorDiv retorna o maior inteiro que é menor que o resultado da divisão
			}
			
			System.out.println(count);
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
