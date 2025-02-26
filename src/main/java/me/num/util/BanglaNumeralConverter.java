package me.num.util;

import java.awt.*;
import java.math.BigDecimal;
import static me.num.util.HelperMethods.*;
import static me.num.util.NumberMap.*;

public class BanglaNumeralConverter {

    public static String convertNumberToBanglaWords(String number) throws IllegalArgumentException {

        if (number == null) {
            System.err.println("Illegal argument: Null number passed");
            return null;
        }

        if (number.isEmpty()) {
            System.err.println("Illegal argument: Empty number passed");
            return "";
        }

        int dotIndex = number.indexOf('.');
        String integerPartStr = (dotIndex >= 0) ? number.substring(0, dotIndex) : number;

        if (integerPartStr.startsWith("+")) {
            integerPartStr = integerPartStr.substring(1);
        }

        if (Math.abs(Long.parseLong(integerPartStr)) > 1999999999L) {
            throw new IllegalArgumentException("Cannot accept numbers greater than 1999999999");
        }

        BigDecimal bigDecimal;
        try {
            bigDecimal = new BigDecimal(number);
        } catch (NumberFormatException e) {
            System.err.println("Illegal argument: Unable to parse number "+ e);
            throw e;
        }

        if (bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
            return NUMERIC_WORDS.get(0);
        }

        boolean isNegative = bigDecimal.compareTo(BigDecimal.ZERO) < 0;
        if (isNegative) {
            bigDecimal = bigDecimal.abs();
        }

        BigDecimal[] parts = bigDecimal.divideAndRemainder(BigDecimal.ONE);
        int integerPart = parts[0].intValue();
        String fractionalPart = "";
        if (parts[1].compareTo(BigDecimal.ZERO) > 0) {
            fractionalPart = parts[1].stripTrailingZeros().toPlainString().replaceFirst("0\\.", "");
        }

        StringBuilder result = new StringBuilder();
        result.append(getIntegerInWords(integerPart));

        if (!fractionalPart.isEmpty()) {
            result.append(" দশমিক");
            for (char digit : fractionalPart.toCharArray()) {
                result.append(" ").append(NUMERIC_WORDS.get(Character.getNumericValue(digit)));
            }
        }

        String finalResult = result.toString().trim();
        if (isNegative) {
            finalResult = "ঋণাত্মক " + finalResult;
        }
        return finalResult;
    }

    public static String convertNumberToBanglaNumerals(String number) {
        BigDecimal bd;
        try {
            bd = new BigDecimal(number);
        } catch(NumberFormatException ex) {
            bd = null;
        }
        String plain = (bd != null) ? bd.toPlainString() : number;

        StringBuilder banglaNumber = new StringBuilder();
        if (plain.contains(".")) {
            String[] parts = plain.split("\\.");
            for (char digit : parts[0].toCharArray()) {
                if (Character.isDigit(digit)) {
                    banglaNumber.append(BANGLA_DIGITS.get(Character.getNumericValue(digit)));
                } else {
                    banglaNumber.append(digit);
                }
            }
            banglaNumber.append(".");
            for (char digit : parts[1].toCharArray()) {
                if (Character.isDigit(digit)) {
                    banglaNumber.append(BANGLA_DIGITS.get(Character.getNumericValue(digit)));
                } else {
                    banglaNumber.append(digit);
                }
            }
        } else {
            for (char digit : plain.toCharArray()) {
                if (Character.isDigit(digit)) {
                    banglaNumber.append(BANGLA_DIGITS.get(Character.getNumericValue(digit)));
                } else {
                    banglaNumber.append(digit);
                }
            }
        }
        return banglaNumber.toString();
    }

    public static String convertEnglishWordsToBanglaWords(String input) {
        String numericValue = convertEnglishWordsToNumericString(input);
        return numericValue != null ? convertNumberToBanglaWords(numericValue) : input;
    }

    public static String convertEnglishWordsToBanglaNumerals(String input) {
        String numericValue = convertEnglishWordsToNumericString(input);
        return numericValue != null ? convertNumberToBanglaNumerals(numericValue) : input;
    }
}
