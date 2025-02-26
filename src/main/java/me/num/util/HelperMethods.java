package me.num.util;

import static me.num.util.NumberMap.NUMERIC_WORDS;
import static me.num.util.NumberMap.UNITS;

public class HelperMethods {

    public static String getIntegerInWords(int number) {
        if (number < 100) {
            return NUMERIC_WORDS.get(number);
        }

        StringBuilder sb = new StringBuilder();

        if (number < 1000) {
            int hundreds = number / 100;
            int remainder = number % 100;
            sb.append(getIntegerInWords(hundreds)).append(" ").append(UNITS[1]);
            if (remainder > 0) {
                sb.append(" ").append(getIntegerInWords(remainder));
            }
            return sb.toString();
        }

        if (number < 100000) {
            int thousands = number / 1000;
            int remainder = number % 1000;
            sb.append(getIntegerInWords(thousands)).append(" ").append(UNITS[2]);
            if (remainder > 0) {
                sb.append(" ").append(getIntegerInWords(remainder));
            }
            return sb.toString();
        }

        if (number < 10000000) {
            int lakhs = number / 100000;
            int remainder = number % 100000;
            sb.append(getIntegerInWords(lakhs)).append(" ").append(UNITS[3]);
            if (remainder > 0) {
                sb.append(" ").append(getIntegerInWords(remainder));
            }
            return sb.toString();
        }

        int crores = number / 10000000;
        int remainder = number % 10000000;
        sb.append(getIntegerInWords(crores)).append(" ").append(UNITS[4]);
        if (remainder > 0) {
            sb.append(" ").append(getIntegerInWords(remainder));
        }
        return sb.toString();
    }

    private static boolean isNumeric(String str) {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }
        try {
            new java.math.BigDecimal(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String convertEnglishWordsToNumericString(String input) {
        if (isNumeric(input)) {
            System.err.println("Illegal argument for \"" + input + "\": Input is numeric");
            return null;
        }

        String intermediate = EnWordsToNumbersUtil.convertTextualNumbersInDocument(input);

        if (!isNumeric(intermediate)) {
            System.err.println("Illegal argument for \"" + input + "\": Could not parse numerical value from the passed string");
            return null;
        }

        return intermediate;
    }
}
