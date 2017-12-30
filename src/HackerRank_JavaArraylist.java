import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class HackerRank_JavaArraylist {

    private static ArrayList<ArrayList<String>> mainArrayList = new ArrayList<>();

    private static String executeQuery(String query) {
        String[] params = query.split(" ");

        int arrayChild = Integer.parseInt(params[0]) - 1;
        int position = Integer.parseInt(params[1]) - 1;

        ArrayList<String> child = mainArrayList.get(arrayChild);
        String result;

        try {
            result = child.get(position);
        } catch (Exception e) {
            result = "ERROR!";
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int mainArraySize = Integer.parseInt(br.readLine());

            while(mainArraySize-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();

                ArrayList<String> childArrayList = new ArrayList<>();

                while(st.hasMoreTokens()) {
                    childArrayList.add(st.nextToken());
                }

                mainArrayList.add(childArrayList);
            }

            int numQueries = Integer.parseInt(br.readLine());

            while(numQueries-- > 0) {
                System.out.println(executeQuery(br.readLine()));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
