import java.util.HashMap;
import java.util.Map;
public class OOPSBannerApp8{
    public static Map<Character, String[]> buildPatternMap() {
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
            " * * * ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " * * * "
        });

        patternMap.put('P', new String[]{
            "* * * ",
            "*     *",
            "*     *",
            "* * * ",
            "*      ",
            "*      ",
            "*      "
        });

        patternMap.put('S', new String[]{
            " * * * ",
            "*      ",
            "*      ",
            " * * * ",
            "      *",
            "      *",
            " * * * "
        });

        return patternMap;
    }
    public static void displayBanner(String word, Map<Character, String[]> patternMap) {
        for (int line = 0; line < 7; line++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                String[] pattern = patternMap.get(c);
                if (pattern != null) {
                    sb.append(pattern[line]);
                    sb.append("  ");
                }
            }
            System.out.println(sb.toString());
        }
    }
    public static void main(String[] args) {
        Map<Character, String[]> patternMap = buildPatternMap();
        displayBanner("OOPS", patternMap);
    }
}