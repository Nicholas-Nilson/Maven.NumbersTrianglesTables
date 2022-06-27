package io.zipcoder.microlabs.mastering_loops;

import java.util.stream.IntStream;

public class TriangleUtilities {

    int width;

    public static String getTriangle(int numberOfRows) {
        String row = "";
        String triangle = "";
        String newLine = "\n";
        char star = '*';

        for (int i = 1; i < numberOfRows; i++) {
            row = row + star;
            triangle = triangle + row + newLine;
        }

        return triangle;
    }

    public static String getRow(int numberOfStars) {
        String row = "";
        char star = '*';
        for (int i =0; i < numberOfStars; i++) {
            row = row + star;
        }
        return row;
//        IntStream.range(0, numberOfStars).forEach(i -> row = row + star); //doesn't work, lambda wants final values.
    }

    public static String getSmallTriangle() {
        int numberOfRows = 4;
        String row = "";
        String triangle = "";
        String newLine = "\n";
        char star = '*';

        for (int i = 1; i <= numberOfRows; i++) {
            row = row + star;
            triangle = triangle + row + newLine;
        }

        return triangle;
    }

    public static String getLargeTriangle() {
        int numberOfRows = 9;
        String row = "";
        String triangle = "";
        String newLine = "\n";
        char star = '*';

        for (int i = 1; i <= numberOfRows; i++) {
            row = row + star;
            triangle = triangle + row + newLine;
        }

        return triangle;
    }
}
