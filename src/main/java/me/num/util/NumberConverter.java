package me.num.util;

import java.math.BigDecimal;

import static me.num.util.NumberMap.*;

public class NumberConverter {

    public static String convertNumberToBanglaWords(String number) {
        Double numberDouble = Double.parseDouble(number);
        if (numberDouble == 0) return NUMERIC_WORDS.get(0);

        boolean isNegative = numberDouble < 0;
        if (isNegative) {
            numberDouble = Math.abs(numberDouble);
        }

        BigDecimal bigDecimal = new BigDecimal(String.valueOf(numberDouble));
        BigDecimal[] parts = bigDecimal.divideAndRemainder(BigDecimal.ONE);
        int integerPart = parts[0].intValue();
        String fractionalPart = parts[1].compareTo(BigDecimal.ZERO) > 0
                ? parts[1].stripTrailingZeros().toPlainString().replaceFirst("0\\.", "")
                : "";

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

    private static String getIntegerInWords(int number) {
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
}
