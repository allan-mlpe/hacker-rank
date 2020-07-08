import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRank_JavaRegex2DuplicateWords {

    public static void main(String[] args) {
        // referência útil: http://tutorials.jenkov.com/java-regex/matcher.html

        /*
            \b -> é um delimitador (boundary) da palavra que queremos capturar
            \1 -> é o grupo da palavra que já foi capturada antes (nesse caso o (\\w+)
         */
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            while (m.find()) {
                /*
                    m.group() -> é o match "completo" (n vezes que palavra se repetiu)
                    m.group(1) -> é o primeiro grupo da regex (nesse caso, o (\\w+)
                 */
                input = input.replaceAll(m.group(), m.group(1));
            }
            System.out.println(input);
        }

        in.close();
    }
}