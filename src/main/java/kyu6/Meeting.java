package kyu6;

// https://www.codewars.com/kata/meeting

//import java.util.Arrays;
//

//public class Meeting {
//
//    public static String meeting(String s) {
//        String[] names = s.toUpperCase().split(";");
//
//        for (int i = 0; i < names.length; i++) {
//            String name = names[i];
//            int index = name.indexOf(':');
//            names[i] = name.substring(index + 1) + ", " + name.substring(0, index);
//        }
//        Arrays.sort(names);
//
//        return "(" + String.join(")(", names) + ")";
//    }
//}
import java.util.Arrays;
import java.util.stream.Collectors;

public class Meeting {

    public static String meeting(String s) {
        return Arrays.stream(s.toUpperCase().split(";"))
                .map(guest -> guest.replaceAll("(\\w+):(\\w+)", "($2, $1)"))
                .sorted()
                .collect(Collectors.joining(""));
    }
}