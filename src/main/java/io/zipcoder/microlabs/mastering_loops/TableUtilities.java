package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
//        String table = new String();
        StringBuilder rowBuilder = new StringBuilder();
        for (int row = 1; row <= tableSize; row++) {

            for (int column = 1; column <=tableSize +1 ; column++) {
                if (column < tableSize) {
                    rowBuilder.append(String.format("%3d |", row * column));
//                table = rowBuilder.toString();
            } else if (column == tableSize) {
                    rowBuilder.append(String.format("%3d |", row * column));
                }
            }
            rowBuilder.append("\n");
        }
        String table = rowBuilder.toString();
        return table;
    }
}
