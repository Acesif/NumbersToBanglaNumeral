package util;

import me.num.util.NumberConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToBanglaNumeralTest {

    @Test
    public void testConvertToBanglaNumerals() {
        assertEquals("৯৯৯৯.৯৯৯৯৯", NumberConverter.convertNumberToBanglaNumerals("9999.99999"));
        assertEquals("১২৩৪.৫৬", NumberConverter.convertNumberToBanglaNumerals("1234.56"));
        assertEquals("০.০", NumberConverter.convertNumberToBanglaNumerals("0.0"));
        assertEquals("১.০", NumberConverter.convertNumberToBanglaNumerals("1.0"));
        assertEquals("১০০০.০", NumberConverter.convertNumberToBanglaNumerals("1000.0"));
        assertEquals("৯৯৯৯৯৯৯৯.০", NumberConverter.convertNumberToBanglaNumerals("99999999.0"));
        assertEquals("১০০০০০০০.০", NumberConverter.convertNumberToBanglaNumerals("10000000.0"));
        assertEquals("৯৮৭৬৫৪৩২১০.০", NumberConverter.convertNumberToBanglaNumerals("9876543210.0"));
        assertEquals("০.০১", NumberConverter.convertNumberToBanglaNumerals("0.01"));
        assertEquals("০.০০০০০১", NumberConverter.convertNumberToBanglaNumerals("0.000001"));
        assertEquals("০.১০০০", NumberConverter.convertNumberToBanglaNumerals("0.1000"));
        assertEquals("৯৯৯৯৯.০০০০১", NumberConverter.convertNumberToBanglaNumerals("99999.00001"));
        assertEquals("৯৯৯৯৯৯৯৯৯৯.৯৯৯৯৯৯", NumberConverter.convertNumberToBanglaNumerals("9999999999.999999"));
        assertEquals("৯৯৯৯৯৯৯৯৯", NumberConverter.convertNumberToBanglaNumerals("9.99999999E8"));
        assertEquals("১০০০০০০০০", NumberConverter.convertNumberToBanglaNumerals("1.0E8"));
        assertEquals("-১০.০", NumberConverter.convertNumberToBanglaNumerals("-10.0"));
        assertEquals("-৯৯৯৯.০", NumberConverter.convertNumberToBanglaNumerals("-9999.0"));
        assertEquals("-০.০০১", NumberConverter.convertNumberToBanglaNumerals("-0.001"));
        assertEquals("১.০০০০০০০০", NumberConverter.convertNumberToBanglaNumerals("1.00000000"));
        assertEquals("৯৯৯৯৯৯৯৯৯৯.০", NumberConverter.convertNumberToBanglaNumerals("9999999999.0"));
        assertEquals("০.০০০১০", NumberConverter.convertNumberToBanglaNumerals("0.00010"));
        assertEquals("১০০০০০০০০০০০", NumberConverter.convertNumberToBanglaNumerals("1E11"));
    }

    @Test
    public void testConvertToBanglaWords() {
        assertEquals("নয় হাজার নয় শত নিরানব্বই দশমিক নয় নয় নয় নয় নয়", NumberConverter.convertNumberToBanglaWords("9999.99999"));
        assertEquals("এক হাজার দুই শত চৌত্রিশ দশমিক পাঁচ ছয়", NumberConverter.convertNumberToBanglaWords("1234.56"));
        assertEquals("শূন্য", NumberConverter.convertNumberToBanglaWords("0.0"));
        assertEquals("এক", NumberConverter.convertNumberToBanglaWords("1.0"));
        assertEquals("এক হাজার", NumberConverter.convertNumberToBanglaWords("1000.0"));
        assertEquals("নয়", NumberConverter.convertNumberToBanglaWords("9.0"));
        assertEquals("দশ", NumberConverter.convertNumberToBanglaWords("10.0"));
        assertEquals("এক লক্ষ", NumberConverter.convertNumberToBanglaWords("100000.0"));
        assertEquals("এক দশমিক শূন্য শূন্য শূন্য শূন্য শূন্য শূন্য এক", NumberConverter.convertNumberToBanglaWords("1.0000001"));
        assertEquals("নিরানব্বই কোটি নিরানব্বই লক্ষ নিরানব্বই হাজার নয় শত নিরানব্বই", NumberConverter.convertNumberToBanglaWords("999999999.0"));
        assertEquals("শূন্য দশমিক শূন্য শূন্য শূন্য শূন্য শূন্য শূন্য এক", NumberConverter.convertNumberToBanglaWords("0.0000001"));
        assertEquals("এক শত তেইশ কোটি পঁয়তাল্লিশ লক্ষ সাতান্ন হাজার আট শত নব্বই", NumberConverter.convertNumberToBanglaWords("1234557890.0"));
        assertEquals("নিরানব্বই কোটি নিরানব্বই লক্ষ নিরানব্বই হাজার নয় শত নিরানব্বই দশমিক নয় নয় নয়", NumberConverter.convertNumberToBanglaWords("999999999.999"));
        assertEquals("এক", NumberConverter.convertNumberToBanglaWords("1.000"));
        assertEquals("ঋণাত্মক এক", NumberConverter.convertNumberToBanglaWords("-1.0"));
        assertEquals("ঋণাত্মক এক শত", NumberConverter.convertNumberToBanglaWords("-100.0"));
        assertEquals("ঋণাত্মক নিরানব্বই দশমিক নয় নয়", NumberConverter.convertNumberToBanglaWords("-99.99"));
        assertEquals("এগারো লক্ষ এগারো হাজার এক শত এগারো", NumberConverter.convertNumberToBanglaWords("1111111.0"));
        assertEquals("শূন্য", NumberConverter.convertNumberToBanglaWords("-0.0"));
        assertEquals("দশ", NumberConverter.convertNumberToBanglaWords("10.00"));
    }
}
