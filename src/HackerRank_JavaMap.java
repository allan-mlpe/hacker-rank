import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HackerRank_JavaMap {

    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            Integer entriesNum = Integer.parseInt(br.readLine());

            while(entriesNum-- > 0) {
                phoneBook.put(br.readLine(), br.readLine());
            }

            String query;
            while((query = br.readLine()) != null && !query.equals("")) {
                if(phoneBook.containsKey(query)) {
                    System.out.println(String.format("%s=%s", query, phoneBook.get(query)));
                } else {
                    System.out.println("Not found");
                }
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
