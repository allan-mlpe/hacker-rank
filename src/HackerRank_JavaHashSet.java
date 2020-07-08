import java.util.HashSet;
import java.util.Scanner;

public class HackerRank_JavaHashSet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String> pairSet = new HashSet<>();
        int i = 0;

        while (i < t) {
            pairSet.add(String.format("%s %s", pair_left[i], pair_right[i]));
            System.out.println(pairSet.size());
            i++;
        }
        s.close();
    }
}
