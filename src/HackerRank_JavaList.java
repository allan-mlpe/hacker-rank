import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRank_JavaList {

    private static List<String> list;

    public static void removeElement(int index) {
        list.remove(index);
    }

    public static void addElement(int index, String value) {
        list.add(index, value);
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            br.readLine();
            list = new ArrayList<String>(Arrays.asList(br.readLine().split(" ")));

            int queries = Integer.parseInt(br.readLine());

            while(queries-- > 0) {
                String operation = br.readLine();

                if(operation.equals("Insert")) {
                    String[] aux = br.readLine().split(" ");
                    int index = Integer.parseInt(aux[0]);

                    addElement(index, aux[1]);
                } else {
                    int index = Integer.parseInt(br.readLine());
                    removeElement(index);
                }
            }

            System.out.println(String.join(" ", list));

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
