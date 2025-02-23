package util;

import me.num.util.NumberConverter;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToBanglaNumeralTest {

    @Test
    public void testConvertToBanglaNumeral() {
        assertEquals("৯৯৯৯.৯৯৯৯৯", convertToBanglaNumeral("9999.99999"));
        assertEquals("১২৩৪.৫৬", convertToBanglaNumeral("1234.56"));
        assertEquals("০.০", convertToBanglaNumeral("0.0"));
        assertEquals("১.০", convertToBanglaNumeral("1.0"));
        assertEquals("১০০০.০", convertToBanglaNumeral("1000.0"));
        assertEquals("৯৯৯৯৯৯৯৯.০", convertToBanglaNumeral("99999999.0"));
        assertEquals("১০০০০০০০.০", convertToBanglaNumeral("10000000.0"));
        assertEquals("৯৮৭৬৫৪৩২১০.০", convertToBanglaNumeral("9876543210.0"));
        assertEquals("০.০১", convertToBanglaNumeral("0.01"));
        assertEquals("০.০০০০০১", convertToBanglaNumeral("0.000001"));
        assertEquals("০.১০০০", convertToBanglaNumeral("0.1000"));
        assertEquals("৯৯৯৯৯.০০০০১", convertToBanglaNumeral("99999.00001"));
        assertEquals("৯৯৯৯৯৯৯৯৯৯.৯৯৯৯৯৯", convertToBanglaNumeral("9999999999.999999"));
        assertEquals("৯.৯৯৯৯৯৯৯৯E৮", convertToBanglaNumeral("9.99999999E8"));
        assertEquals("১.০E৮", convertToBanglaNumeral("1.0E8"));
//        assertEquals("১০০০০০০০০", convertToBanglaNumeral(1.0E8)); // handle sci/non-sci format
        assertEquals("-১০.০", convertToBanglaNumeral("-10.0"));
        assertEquals("-৯৯৯৯.০", convertToBanglaNumeral("-9999.0"));
        assertEquals("-০.০০১", convertToBanglaNumeral("-0.001"));
        assertEquals("১.০০০০০০০০", convertToBanglaNumeral("1.00000000"));
        assertEquals("৯৯৯৯৯৯৯৯৯৯.০", convertToBanglaNumeral("9999999999.0"));
    }


    @Test
    public void testConvertToBanglaWords() {
        // Regular cases
        assertEquals("নয় হাজার নয় শত নিরানব্বই দশমিক নয় নয় নয় নয় নয়", convertToBanglaWords(9999.99999));
        assertEquals("এক হাজার দুই শত চৌত্রিশ দশমিক পাঁচ ছয়", convertToBanglaWords(1234.56));
        assertEquals("শূন্য", convertToBanglaWords(0.0));
        assertEquals("এক", convertToBanglaWords(1.0));
        assertEquals("এক হাজার", convertToBanglaWords(1000.0));

        // Edge cases
        assertEquals("নয়", convertToBanglaWords(9.0));
        assertEquals("দশ", convertToBanglaWords(10.0));
        assertEquals("এক লক্ষ", convertToBanglaWords(100000.0));
        assertEquals("এক দশমিক শূন্য শূন্য শূন্য শূন্য শূন্য শূন্য এক", convertToBanglaWords(1.0000001));
        assertEquals("নিরানব্বই কোটি নিরানব্বই লক্ষ নিরানব্বই হাজার নয় শত নিরানব্বই", convertToBanglaWords(999999999.0));
//        assertEquals("নব্বই কোটি নিরানব্বই লক্ষ নিরানব্বই হাজার নিরানব্বই", convertToBanglaWords(999999999.0));
//        assertEquals("শূন্য দশমিক শূন্য শূন্য শূন্য শূন্য শূন্য এক", convertToBanglaWords(0.0000001));
//        assertEquals("একশো তেইশ কোটি চারশো পঞ্চান্ন লক্ষ সাতানব্বই হাজার আটশো নব্বই", convertToBanglaWords(1234557890.0));
//        assertEquals("নব্বই কোটি নিরানব্বই লক্ষ নিরানব্বই হাজার নিরানব্বই দশমিক নয় নয় নয়", convertToBanglaWords(999999999.999));
        assertEquals("এক", convertToBanglaWords(1.000));

        // Negative numbers
//        assertEquals("ঋণাত্মক এক", convertToBanglaWords(-1.0));
//        assertEquals("ঋণাত্মক একশো", convertToBanglaWords(-100.0));
//        assertEquals("ঋণাত্মক নিরানব্বই দশমিক নয় নয়", convertToBanglaWords(-99.99));
    }

    private static String convertToBanglaNumeral(String num) {
        return NumberConverter.convertToBanglaNumerals(num);
    }

    private static String convertToBanglaWords(Double num) {
        return NumberConverter.convertToBanglaWords(num);
    }
}
