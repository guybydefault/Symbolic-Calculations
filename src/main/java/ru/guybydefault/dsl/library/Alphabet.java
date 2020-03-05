package ru.guybydefault.dsl.library;

import ru.guybydefault.domain.StringSymbol;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class Alphabet {
    public static StringSymbol x = new StringSymbol("x'");
    public static StringSymbol y = new StringSymbol("y'");
    public static StringSymbol n = new StringSymbol("n'");
    public static StringSymbol expr = new StringSymbol("expr'");
    public static StringSymbol list = new StringSymbol("list'");
    public static StringSymbol list2 = new StringSymbol("list2'");
    public static StringSymbol tuple = new StringSymbol("tuple'");
    public static StringSymbol f = new StringSymbol("f'");
    public static StringSymbol acc = new StringSymbol("acc'");
    public static StringSymbol pred = new StringSymbol("pred'");
    public static StringSymbol body = new StringSymbol("body'");

    private static final List<StringSymbol> symbols = asList(x, y, n, expr, list, list2, tuple, f, acc, pred, body);

    public static boolean isFromAlphabet(StringSymbol symbol) {
        return symbols.contains(symbol);
    }

    public static List<StringSymbol> getAlphabet() {
        return Arrays.asList(x, y, n, expr, list, list2, tuple, f, acc, pred, body);
    }
}