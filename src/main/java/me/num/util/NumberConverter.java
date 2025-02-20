package me.num.util;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumberConverter {

    private static final Map<Integer, String> NUMERIC_WORDS = new LinkedHashMap<>();

    static {
        NUMERIC_WORDS.put(0, "শূন্য");
        NUMERIC_WORDS.put(1, "এক");
        NUMERIC_WORDS.put(2, "দুই");
        NUMERIC_WORDS.put(3, "তিন");
        NUMERIC_WORDS.put(4, "চার");
        NUMERIC_WORDS.put(5, "পাঁচ");
        NUMERIC_WORDS.put(6, "ছয়");
        NUMERIC_WORDS.put(7, "সাত");
        NUMERIC_WORDS.put(8, "আট");
        NUMERIC_WORDS.put(9, "নয়");
        NUMERIC_WORDS.put(10, "দশ");
        NUMERIC_WORDS.put(11, "এগারো");
        NUMERIC_WORDS.put(12, "বার");
        NUMERIC_WORDS.put(13, "তেরো");
        NUMERIC_WORDS.put(14, "চৌদ্দ");
        NUMERIC_WORDS.put(15, "পনেরো");
        NUMERIC_WORDS.put(16, "ষোল");
        NUMERIC_WORDS.put(17, "সতেরো");
        NUMERIC_WORDS.put(18, "আঠারো");
        NUMERIC_WORDS.put(19, "উনিশ");
        NUMERIC_WORDS.put(20, "বিশ");
        NUMERIC_WORDS.put(21, "একুশ");
        NUMERIC_WORDS.put(22, "বাইশ");
        NUMERIC_WORDS.put(23, "তেইশ");
        NUMERIC_WORDS.put(24, "চব্বিশ");
        NUMERIC_WORDS.put(25, "পঁচিশ");
        NUMERIC_WORDS.put(26, "ছাব্বিশ");
        NUMERIC_WORDS.put(27, "সাতাশ");
        NUMERIC_WORDS.put(28, "আঠাশ");
        NUMERIC_WORDS.put(29, "উনত্রিশ");
        NUMERIC_WORDS.put(30, "ত্রিশ");
        NUMERIC_WORDS.put(31, "একত্রিশ");
        NUMERIC_WORDS.put(32, "বত্রিশ");
        NUMERIC_WORDS.put(33, "তেত্রিশ");
        NUMERIC_WORDS.put(34, "চৌত্রিশ");
        NUMERIC_WORDS.put(35, "পঁয়ত্রিশ");
        NUMERIC_WORDS.put(36, "ছত্রিশ");
        NUMERIC_WORDS.put(37, "সাঁইত্রিশ");
        NUMERIC_WORDS.put(38, "আটত্রিশ");
        NUMERIC_WORDS.put(39, "উনচল্লিশ");
        NUMERIC_WORDS.put(40, "চল্লিশ");
        NUMERIC_WORDS.put(41, "একচল্লিশ");
        NUMERIC_WORDS.put(42, "বিয়াল্লিশ");
        NUMERIC_WORDS.put(43, "তেতাল্লিশ");
        NUMERIC_WORDS.put(44, "চুয়াল্লিশ");
        NUMERIC_WORDS.put(45, "পঁয়তাল্লিশ");
        NUMERIC_WORDS.put(46, "ছেচল্লিশ");
        NUMERIC_WORDS.put(47, "সাতচল্লিশ");
        NUMERIC_WORDS.put(48, "আটচল্লিশ");
        NUMERIC_WORDS.put(49, "উনপঞ্চাশ");
        NUMERIC_WORDS.put(50, "পঞ্চাশ");
        NUMERIC_WORDS.put(51, "একান্ন");
        NUMERIC_WORDS.put(52, "বায়ান্ন");
        NUMERIC_WORDS.put(53, "তিপ্পান্ন");
        NUMERIC_WORDS.put(54, "চুয়ান্ন");
        NUMERIC_WORDS.put(55, "পঞ্চান্ন");
        NUMERIC_WORDS.put(56, "ছাপ্পান্ন");
        NUMERIC_WORDS.put(57, "সাতান্ন");
        NUMERIC_WORDS.put(58, "আটান্ন");
        NUMERIC_WORDS.put(59, "উনষাট");
        NUMERIC_WORDS.put(60, "ষাট");
        NUMERIC_WORDS.put(61, "একষট্টি");
        NUMERIC_WORDS.put(62, "বাষট্টি");
        NUMERIC_WORDS.put(63, "তেষট্টি");
        NUMERIC_WORDS.put(64, "চৌষট্টি");
        NUMERIC_WORDS.put(65, "পঁয়ষট্টি");
        NUMERIC_WORDS.put(66, "ছেষট্টি");
        NUMERIC_WORDS.put(67, "সাতষট্টি");
        NUMERIC_WORDS.put(68, "আটষট্টি");
        NUMERIC_WORDS.put(69, "উনসত্তর");
        NUMERIC_WORDS.put(70, "সত্তর");
        NUMERIC_WORDS.put(71, "একাত্তর");
        NUMERIC_WORDS.put(72, "বাহাত্তর");
        NUMERIC_WORDS.put(73, "তিয়াত্তর");
        NUMERIC_WORDS.put(74, "চুয়াত্তর");
        NUMERIC_WORDS.put(75, "পঁচাত্তর");
        NUMERIC_WORDS.put(76, "ছিয়াত্তর");
        NUMERIC_WORDS.put(77, "সাতাত্তর");
        NUMERIC_WORDS.put(78, "আটাত্তর");
        NUMERIC_WORDS.put(79, "উনআশি");
        NUMERIC_WORDS.put(80, "আশি");
        NUMERIC_WORDS.put(81, "একাশি");
        NUMERIC_WORDS.put(82, "বিরাশি");
        NUMERIC_WORDS.put(83, "তিরাশি");
        NUMERIC_WORDS.put(84, "চুরাশি");
        NUMERIC_WORDS.put(85, "পঁচাশি");
        NUMERIC_WORDS.put(86, "ছিয়াশি");
        NUMERIC_WORDS.put(87, "সাতাশি");
        NUMERIC_WORDS.put(88, "আটাশি");
        NUMERIC_WORDS.put(89, "উননব্বই");
        NUMERIC_WORDS.put(90, "নব্বই");
        NUMERIC_WORDS.put(91, "একানব্বই");
        NUMERIC_WORDS.put(92, "বিরানব্বই");
        NUMERIC_WORDS.put(93, "তিরানব্বই");
        NUMERIC_WORDS.put(94, "চুরানব্বই");
        NUMERIC_WORDS.put(95, "পঁচানব্বই");
        NUMERIC_WORDS.put(96, "ছিয়ানব্বই");
        NUMERIC_WORDS.put(97, "সাতানব্বই");
        NUMERIC_WORDS.put(98, "আটানব্বই");
        NUMERIC_WORDS.put(99, "নিরানব্বই");
        NUMERIC_WORDS.put(100, "একশত");
    }

    private static final String[] UNITS = {"", "শত", "হাজার", "লক্ষ", "কোটি"};
    private static final char[] BANGLA_DIGITS = {'০', '১', '২', '৩', '৪', '৫', '৬', '৭', '৮', '৯'};

    public static String convertToBanglaWords(Double number) {
        if (number == 0) {
            return NUMERIC_WORDS.get(0);
        }

        String[] numberParts = String.valueOf(number).split("\\.");
        int integerPart = Integer.parseInt(numberParts[0]);
        String fractionalPart = numberParts.length > 1 ? numberParts[1] : "";

        StringBuilder result = new StringBuilder();

        int[] parts = {
                integerPart % 100,
                (integerPart / 100) % 10,
                (integerPart / 1000) % 100,
                (integerPart / 100000) % 100,
                integerPart / 10000000
        };

        for (int i = parts.length - 1; i >= 0; i--) {
            if (parts[i] > 0) {
                result.append(NUMERIC_WORDS.getOrDefault(parts[i], getNumberInWords(parts[i]))).append(" ");
                result.append(UNITS[i]).append(" ");
            }
        }

        if (!fractionalPart.isEmpty()) {
            result.append("দশমিক ");
            for (char digit : fractionalPart.toCharArray()) {
                result.append(NUMERIC_WORDS.get(Character.getNumericValue(digit))).append(" ");
            }
        }

        return result.toString().trim();
    }

    private static String getNumberInWords(int number) {
        if (NUMERIC_WORDS.containsKey(number)) {
            return NUMERIC_WORDS.get(number);
        } else if (number < 100) {
            return NUMERIC_WORDS.get(number - (number % 10)) + " " + NUMERIC_WORDS.get(number % 10);
        }
        return "";
    }

    public static String convertToBanglaNumerals(double number) {
        String numberStr = String.valueOf(number);
        StringBuilder banglaNumber = new StringBuilder();

        for (char digit : numberStr.toCharArray()) {
            if (Character.isDigit(digit)) {
                banglaNumber.append(BANGLA_DIGITS[digit - '0']);
            } else banglaNumber.append(digit);
        }
        return banglaNumber.toString();
    }
}
