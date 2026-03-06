public class OPPSBannerApp7 {
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public char getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
    }
    public static String[] getPatternO() {
        return new String[]{
            " * * * ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " * * * "
        };
    }
    public static String[] getPatternP() {
        return new String[]{
            "* * * ",
            "*     *",
            "*     *",
            "* * * ",
            "*      ",
            "*      ",
            "*      "
        };
    }
    public static String[] getPatternS() {
        return new String[]{
            " * * * ",
            "*      ",
            "*      ",
            " * * * ",
            "      *",
            "      *",
            " * * * "
        };
    }
    public static String[] getCharacterPattern(CharacterPatternMap[] patterns, char c) {
        for (CharacterPatternMap entry : patterns) {
            if (entry.getCharacter() == c) {
                return entry.getPattern();
            }
        }
        return null;
    }
    public static void displayBanner(CharacterPatternMap[] patterns) {
        char[] word = {'O', 'O', 'P', 'S'};

        for (int line = 0; line < 7; line++) {
            StringBuilder sb = new StringBuilder();
            for (char c : word) {
                String[] pattern = getCharacterPattern(patterns, c);
                if (pattern != null) {
                    sb.append(pattern[line]);
                    sb.append("  ");
                }
            }
            System.out.println(sb.toString());
        }
    }
    public static void main(String[] args) {

        CharacterPatternMap oPattern = new CharacterPatternMap('O', getPatternO());
        CharacterPatternMap pPattern = new CharacterPatternMap('P', getPatternP());
        CharacterPatternMap sPattern = new CharacterPatternMap('S', getPatternS());
        CharacterPatternMap[] patterns = { oPattern, pPattern, sPattern };
        displayBanner(patterns);
    }
}