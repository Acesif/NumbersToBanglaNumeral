package me.num.util;

import java.math.BigDecimal;

public class ToBanglaNumeral {

    public static String convertToBanglaNumeral(Double num) {
        return NumberConverter.convertToBanglaNumerals(num);
    }

    public static String convertToBanglaWords(Double num) {
        return NumberConverter.convertToBanglaWords(num);
    }
}
