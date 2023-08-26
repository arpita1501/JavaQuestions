import java.util.Arrays;

public class longestcommon {

    public static String longestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }
        Arrays.sort(strings);
        String firstString = strings[0];
        String lastString = strings[strings.length - 1];

        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < Math.min(firstString.length(), lastString.length()); i++) {
            if (firstString.charAt(i) == lastString.charAt(i)) {
                commonPrefix.append(firstString.charAt(i));
            } else {
                break;
            }
        }

        return commonPrefix.toString();
    }

    public static void main(String[] args) {
        String[] inputStrings = {"flower", "flour", "flight","fo"};
        String result = longestCommonPrefix(inputStrings);
        System.out.println("Longest common prefix: " + result);  
    }
}


