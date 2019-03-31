package kyu6;

public class CamelCase {
    public static String camelCase(String str) {

        if (str.equals("")) return "";
        str = str.replaceAll("[  ]+", " ");
        String[] strArr = str.trim().split(" ");
        String result = "";
        for (String s : strArr) {
            result += s.substring(0, 1).toUpperCase() + s.substring(1);
        }
        return result;
    }
}
