package kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ShortestWord {

    public static int findShort(String s) {
//
//        String[] arr = s.split(" ");
//        String  min = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].length() < min.length()) {
//                min = arr[i];
//            }
//        }
//        return min.length();
    return Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }

}
