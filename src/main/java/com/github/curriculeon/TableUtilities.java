package com.github.curriculeon;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(20);
    }

    public static String getMultiplicationTable(int tableSize) {

        String table = "";

        for (int i = 1; i < tableSize + 1; i++) {
            for (int j = 1; j < tableSize +1; j++) {

            }
            table += " " + i + " |";

        }

        return table;
    }
}
