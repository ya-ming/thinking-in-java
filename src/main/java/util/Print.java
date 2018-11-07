package util;

import java.io.PrintStream;

public class Print {
    // Print with a newline;
    public static void print(Object obj) {
        System.out.println(obj);
    }

    // Print with a newline by itself;
    public static void print() {
        System.out.println();
    }

    // Print with no line break;
    public static void printnb(Object obj) {
        System.out.print(obj);
    }

    // Print with C style;
    public static PrintStream print(String format, Object...args) {
        return System.out.printf(format, args);
    }
}
