package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int index = 0; index < postfix.length; index++) {
            if (word[word.length - postfix.length + index] != postfix[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
