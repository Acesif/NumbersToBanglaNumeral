package me.num.util;

public class ToBanglaNumeral {

    public static String convertToBanglaNumeral(Double num) {
        return NumberConverter.convertToBanglaNumerals(num);
    }

    public static String convertToBanglaWords(Double num) {
        return NumberConverter.convertToBanglaWords(num);
    }

    public static void main(String[] args) {
        System.out.println(convertToBanglaNumeral(9999.99999));
    }
}
