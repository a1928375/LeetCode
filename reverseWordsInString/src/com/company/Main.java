package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(reverse("the sky", 0, 6));
        System.out.println(reverseWords("the sky is blue"));
    }

    private static String reverse(String str, int start, int end) {

        char[] collection = str.toCharArray();

        for (int i = start, j = end; i < j; i++, j--) {
            char temp = collection[i];
            collection[i] = collection[j];
            collection[j] = temp;
        }
        return String.valueOf(collection);
    }

    public static String reverseWords(String s) {

        String temp = reverse(s, 0, s.length() - 1);
        boolean flag = false;

        if (!Character.isWhitespace(temp.charAt(s.length() - 1))) {
            temp = temp + " ";
            flag = true;
        }

        int record = 0;

        for (int i = 0; i < temp.length(); i++) {
            if (Character.isWhitespace(temp.charAt(i))) {
                temp = reverse(temp, record, i - 1);
                record = i + 1;
            }
        }

        if (flag == true) {
            temp = temp.substring(0, temp.length() - 1);
        }

        return temp;
    }
}
