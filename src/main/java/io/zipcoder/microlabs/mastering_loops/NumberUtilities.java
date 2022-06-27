package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder str = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                str.append(i);
            }
        }
        String result = str.toString();
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder str = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                str.append(i);
            }
        }
        String result = str.toString();
        return result;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return null;
    }

    public static String getRange(int stop) {
        return NumberUtilities.getRange (1, stop);

//        String result = "";
//        int numToPrint = 0;
//        for (int i = 0; i < stop; i++) {
//            result += numToPrint;
//            numToPrint++;
//        }
//
//        return result;
    }

    public static String getRange(int start, int stop) {
        String result = "";
        int numToPrint = start;
        for (int i = start; i < stop; i++) {
            result += numToPrint;
            numToPrint++;
        }
        return result;
    }


    public static String getRange(int start, int stop, int step) {
//        String result = "";
//        int numToPrint = start;
//        for (int i = start; i < stop; i += step) {
//            result += numToPrint;
//            numToPrint += step;
//        }
//        return result;

        //String builder method
        StringBuilder str = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            str.append(i);
        }
        String result = str.toString();
        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
