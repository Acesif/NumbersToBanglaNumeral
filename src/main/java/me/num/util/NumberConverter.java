package me.num.util;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class NumberConverter {

    private static final Map<Integer, String> NUMERIC_WORDS = new LinkedHashMap<>();
    private static final String[] UNITS = {"", "শত", "হাজার", "লক্ষ", "কোটি"};
    private static final Map<Integer, String> BANGLA_DIGITS = Map.of(
            0, "০",
            1, "১",
            2, "২",
            3, "৩",
            4, "৪",
            5, "৫",
            6, "৬",
            7, "৭",
            8, "৮",
            9, "৯"
    );


    static {
        String[] words = {"শূন্য", "এক", "দুই", "তিন", "চার", "পাঁচ", "ছয়", "সাত", "আট", "নয়", "দশ",
                "এগারো", "বার", "তেরো", "চৌদ্দ", "পনেরো", "ষোল", "সতেরো", "আঠারো", "উনিশ", "বিশ",
                "একুশ", "বাইশ", "তেইশ", "চব্বিশ", "পঁচিশ", "ছাব্বিশ", "সাতাশ", "আঠাশ", "উনত্রিশ", "ত্রিশ",
                "একত্রিশ", "বত্রিশ", "তেত্রিশ", "চৌত্রিশ", "পঁয়ত্রিশ", "ছত্রিশ", "সাঁইত্রিশ", "আটত্রিশ", "উনচল্লিশ", "চল্লিশ",
                "একচল্লিশ", "বিয়াল্লিশ", "তেতাল্লিশ", "চুয়াল্লিশ", "পঁয়তাল্লিশ", "ছেচল্লিশ", "সাতচল্লিশ", "আটচল্লিশ", "উনপঞ্চাশ", "পঞ্চাশ",
                "একান্ন", "বায়ান্ন", "তিপ্পান্ন", "চুয়ান্ন", "পঞ্চান্ন", "ছাপ্পান্ন", "সাতান্ন", "আটান্ন", "উনষাট", "ষাট",
                "একষট্টি", "বাষট্টি", "তেষট্টি", "চৌষট্টি", "পঁয়ষট্টি", "ছেষট্টি", "সাতষট্টি", "আটষট্টি", "উনসত্তর", "সত্তর",
                "একাত্তর", "বাহাত্তর", "তিয়াত্তর", "চুয়াত্তর", "পঁচাত্তর", "ছিয়াত্তর", "সাতাত্তর", "আটাত্তর", "উনআশি", "আশি",
                "একাশি", "বিরাশি", "তিরাশি", "চুরাশি", "পঁচাশি", "ছিয়াশি", "সাতাশি", "আটাশি", "উননব্বই", "নব্বই",
                "একানব্বই", "বিরানব্বই", "তিরানব্বই", "চুরানব্বই", "পঁচানব্বই", "ছিয়ানব্বই", "সাতানব্বই", "আটানব্বই", "নিরানব্বই", "একশত"};

        for (int i = 0; i <= 100; i++) {
            NUMERIC_WORDS.put(i, words[i]);
        }
    }

    public static String convertToBanglaWords(double number) {
        if (number == 0) return NUMERIC_WORDS.get(0);

        BigDecimal bigDecimal = new BigDecimal(String.valueOf(number));
        BigDecimal[] parts = bigDecimal.divideAndRemainder(BigDecimal.ONE);
        int integerPart = parts[0].intValue();
        String fractionalPart = parts[1].compareTo(BigDecimal.ZERO) > 0 ? parts[1].toPlainString().substring(2) : "";

        StringBuilder result = new StringBuilder();
        result.append(getIntegerInWords(integerPart));

        if (!fractionalPart.isEmpty()) {
            result.append(" দশমিক");
            for (char digit : fractionalPart.toCharArray()) {
                result.append(" ").append(NUMERIC_WORDS.get(Character.getNumericValue(digit)));
            }
        }

        return result.toString().trim();
    }

    private static String getIntegerInWords(int number) {
        if (NUMERIC_WORDS.containsKey(number)) return NUMERIC_WORDS.get(number);

        int[] parts = {
                number % 100,
                (number / 100) % 10,
                (number / 1000) % 100,
                (number / 100000) % 100,
                number / 10000000
        };

        StringBuilder result = new StringBuilder();
        boolean firstPartAdded = false;

        for (int i = parts.length - 1; i >= 0; i--) {
            if (parts[i] > 0) {
                if (firstPartAdded) {
                    result.append(" ");
                }
                result.append(NUMERIC_WORDS.getOrDefault(parts[i], getFallbackNumberWords(parts[i])));
                if (!UNITS[i].isEmpty()) {
                    result.append(" ").append(UNITS[i]);
                }
                firstPartAdded = true;
            }
        }

        return result.toString().trim();
    }

    private static String getFallbackNumberWords(int number) {
        if (NUMERIC_WORDS.containsKey(number)) {
            return NUMERIC_WORDS.get(number);
        } else if (number < 100) {
            return NUMERIC_WORDS.get(number - (number % 10)) + " " + NUMERIC_WORDS.get(number % 10);
        }
        return "";
    }

    public static String convertToBanglaNumerals(Double number) {
        String numberStr = new BigDecimal(String.valueOf(number)).stripTrailingZeros().toPlainString();
        return convertToBanglaNumerals(numberStr);
    }

    public static String convertToBanglaNumerals(String number) {
        StringBuilder banglaNumber = new StringBuilder();
        if (number.contains(".")){

        }
        for (char digit : number.toCharArray()) {
            if (Character.isDigit(digit)) {
                banglaNumber.append(BANGLA_DIGITS.get(Integer.parseInt(String.valueOf(digit))));
            } else banglaNumber.append(digit);
        }
        return banglaNumber.toString();

    }
}
