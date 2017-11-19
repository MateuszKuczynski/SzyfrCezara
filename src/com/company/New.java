package com.company;

public class New {
    private static int ALPHABET_SIZE = 'z' - 'a' + 1;

    public static String encode(String text, int numbers) {

        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            char a;

            if (Character.isLowerCase(c)) {
                a = 'a';
            } else if (Character.isUpperCase(c)) {
                a = 'A';
            } else {
                continue;
            }

            c -= a;
            c += numbers;
            c %= ALPHABET_SIZE;
            c += a;
            chars[i] = c;
        }
        return String.valueOf(chars);
    }

    public static String decode(String text, int numbers) {

        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            char a;

            if (Character.isLowerCase(c)) {
                a = 'a';
            } else if (Character.isUpperCase(c)) {
                a = 'A';
            } else {
                continue;
            }

            c -= a;
//            Pierwsze rozwiaznaie
//            c += ALPHABET_SIZE;
//            c -= numbers % ALPHABET_SIZE;
//            Drugie rozwiazanie
//            c += ALPHABET_SIZE * (numbers / ALPHABET_SIZE + 1);
//            c -= numbers;
            c %= ALPHABET_SIZE;
            c += a;
            chars[i] = c;
        }
        return String.valueOf(chars);

    }
}