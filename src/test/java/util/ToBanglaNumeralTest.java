package util;

import me.num.util.BanglaNumeralConverter;
import org.junit.jupiter.api.Test;

import static me.num.util.BanglaNumeralConverter.convertEnglishWordsToBanglaNumerals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ToBanglaNumeralTest {

    @Test
    public void testConvertToBanglaNumerals() {
        assertEquals("৯৯৯৯.৯৯৯৯৯", BanglaNumeralConverter.convertNumberToBanglaNumerals("9999.99999"));
        assertEquals("১২৩৪.৫৬", BanglaNumeralConverter.convertNumberToBanglaNumerals("1234.56"));
        assertEquals("০.০", BanglaNumeralConverter.convertNumberToBanglaNumerals("0.0"));
        assertEquals("১.০", BanglaNumeralConverter.convertNumberToBanglaNumerals("1.0"));
        assertEquals("১০০০.০", BanglaNumeralConverter.convertNumberToBanglaNumerals("1000.0"));
        assertEquals("৯৯৯৯৯৯৯৯.০", BanglaNumeralConverter.convertNumberToBanglaNumerals("99999999.0"));
        assertEquals("১০০০০০০০.০", BanglaNumeralConverter.convertNumberToBanglaNumerals("10000000.0"));
        assertEquals("৯৮৭৬৫৪৩২১০.০", BanglaNumeralConverter.convertNumberToBanglaNumerals("9876543210.0"));
        assertEquals("০.০১", BanglaNumeralConverter.convertNumberToBanglaNumerals("0.01"));
        assertEquals("০.০০০০০১", BanglaNumeralConverter.convertNumberToBanglaNumerals("0.000001"));
        assertEquals("০.১০০০", BanglaNumeralConverter.convertNumberToBanglaNumerals("0.1000"));
        assertEquals("৯৯৯৯৯.০০০০১", BanglaNumeralConverter.convertNumberToBanglaNumerals("99999.00001"));
        assertEquals("৯৯৯৯৯৯৯৯৯৯.৯৯৯৯৯৯", BanglaNumeralConverter.convertNumberToBanglaNumerals("9999999999.999999"));
        assertEquals("৯৯৯৯৯৯৯৯৯", BanglaNumeralConverter.convertNumberToBanglaNumerals("9.99999999E8"));
        assertEquals("১০০০০০০০০", BanglaNumeralConverter.convertNumberToBanglaNumerals("1.0E8"));
        assertEquals("-১০.০", BanglaNumeralConverter.convertNumberToBanglaNumerals("-10.0"));
        assertEquals("-৯৯৯৯.০", BanglaNumeralConverter.convertNumberToBanglaNumerals("-9999.0"));
        assertEquals("-০.০০১", BanglaNumeralConverter.convertNumberToBanglaNumerals("-0.001"));
        assertEquals("১.০০০০০০০০", BanglaNumeralConverter.convertNumberToBanglaNumerals("1.00000000"));
        assertEquals("৯৯৯৯৯৯৯৯৯৯.০", BanglaNumeralConverter.convertNumberToBanglaNumerals("9999999999.0"));
        assertEquals("০.০০০১০", BanglaNumeralConverter.convertNumberToBanglaNumerals("0.00010"));
        assertEquals("১০০০০০০০০০০০", BanglaNumeralConverter.convertNumberToBanglaNumerals("1E11"));
        assertEquals("৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯৯.০", BanglaNumeralConverter.convertNumberToBanglaNumerals("9999999999999999999999999999999999999999.0"));
    }

    @Test
    public void testConvertToBanglaWords() {
        assertEquals("নয় হাজার নয় শত নিরানব্বই দশমিক নয় নয় নয় নয় নয়", BanglaNumeralConverter.convertNumberToBanglaWords("9999.99999"));
        assertEquals("এক হাজার দুই শত চৌত্রিশ দশমিক পাঁচ ছয়", BanglaNumeralConverter.convertNumberToBanglaWords("1234.56"));
        assertEquals("শূন্য", BanglaNumeralConverter.convertNumberToBanglaWords("0.0"));
        assertEquals("এক", BanglaNumeralConverter.convertNumberToBanglaWords("1.0"));
        assertEquals("এক হাজার", BanglaNumeralConverter.convertNumberToBanglaWords("1000.0"));
        assertEquals("নয়", BanglaNumeralConverter.convertNumberToBanglaWords("9.0"));
        assertEquals("দশ", BanglaNumeralConverter.convertNumberToBanglaWords("10.0"));
        assertEquals("এক লক্ষ", BanglaNumeralConverter.convertNumberToBanglaWords("100000.0"));
        assertEquals("এক দশমিক শূন্য শূন্য শূন্য শূন্য শূন্য শূন্য এক", BanglaNumeralConverter.convertNumberToBanglaWords("1.0000001"));
        assertEquals("নিরানব্বই কোটি নিরানব্বই লক্ষ নিরানব্বই হাজার নয় শত নিরানব্বই", BanglaNumeralConverter.convertNumberToBanglaWords("999999999.0"));
        assertEquals("শূন্য দশমিক শূন্য শূন্য শূন্য শূন্য শূন্য শূন্য এক", BanglaNumeralConverter.convertNumberToBanglaWords("0.0000001"));
        assertEquals("এক শত তেইশ কোটি পঁয়তাল্লিশ লক্ষ সাতান্ন হাজার আট শত নব্বই", BanglaNumeralConverter.convertNumberToBanglaWords("1234557890.0"));
        assertEquals("এক শত নিরানব্বই কোটি নিরানব্বই লক্ষ নিরানব্বই হাজার নয় শত নিরানব্বই দশমিক নয় নয় নয়", BanglaNumeralConverter.convertNumberToBanglaWords("1999999999.999"));
        assertEquals("এক শত নিরানব্বই কোটি নিরানব্বই লক্ষ নিরানব্বই হাজার নয় শত নিরানব্বই", BanglaNumeralConverter.convertNumberToBanglaWords("1999999999"));
        assertEquals("এক", BanglaNumeralConverter.convertNumberToBanglaWords("1.000"));
        assertEquals("ঋণাত্মক এক", BanglaNumeralConverter.convertNumberToBanglaWords("-1.0"));
        assertEquals("ঋণাত্মক এক শত", BanglaNumeralConverter.convertNumberToBanglaWords("-100.0"));
        assertEquals("ঋণাত্মক নিরানব্বই দশমিক নয় নয়", BanglaNumeralConverter.convertNumberToBanglaWords("-99.99"));
        assertEquals("এগারো লক্ষ এগারো হাজার এক শত এগারো", BanglaNumeralConverter.convertNumberToBanglaWords("1111111.0"));
        assertEquals("শূন্য", BanglaNumeralConverter.convertNumberToBanglaWords("-0.0"));
        assertEquals("দশ", BanglaNumeralConverter.convertNumberToBanglaWords("10.00"));
        assertEquals("", BanglaNumeralConverter.convertNumberToBanglaWords(""));
        assertNull(BanglaNumeralConverter.convertNumberToBanglaWords(null));
    }

    @Test
    public void testConvertWordsToBanglaWords() {
        assertEquals("দুই শত ছাপ্পান্ন", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("Two hundred fifty six"));
        assertEquals("নয় হাজার নয় শত নিরানব্বই", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("Nine thousand nine hundred ninety nine"));
        assertEquals("দশ লক্ষ", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("One million"));
        assertEquals("এক শত কোটি", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("One billion"));
        assertEquals("random text", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("random text"));
        assertEquals("", BanglaNumeralConverter.convertEnglishWordsToBanglaWords(""));
        assertEquals("12345", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("12345"));
        assertEquals("শূন্য দশমিক পাঁচ", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("Zero point five"));
        assertEquals("তিন দশমিক এক চার", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("Three point one four"));
        assertEquals("এক শত দুই দশমিক শূন্য পাঁচ", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("One hundred two point zero five"));
        assertEquals("নয় হাজার নয় শত নব্বই দশমিক নয়", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("Nine thousand nine hundred ninety point nine"));
        assertEquals("দশ লক্ষ দশমিক এক", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("One million point one"));
        assertEquals("এক দশমিক দুই তিন চার পাঁচ", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("One point two three four five"));
        assertEquals("ঋণাত্মক পাঁচ", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("Negative five"));
        assertEquals("ঋণাত্মক দুই দশমিক সাত", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("Negative two point seven"));
        assertEquals("ঋণাত্মক এক হাজার দুই শত পঁচিশ দশমিক শূন্য এক", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("Negative one thousand two hundred twenty five point zero one"));
        assertEquals("দশ কোটি", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("One hundred million"));
        assertEquals("এক লক্ষ", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("One hundred thousand"));
        assertEquals("দশ লক্ষ", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("One million"));
        assertEquals("এক কোটি", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("Ten million"));
        assertEquals("এক", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("One"));
        assertEquals("random 12 text", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("random 12 text"));
        assertEquals("ঋণাত্মক দশ লক্ষ", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("Negative ten hundred thousand"));
        assertEquals("শূন্য", BanglaNumeralConverter.convertEnglishWordsToBanglaWords("Zero"));
    }

    @Test
    void testConvertEnglishWordsToBanglaNumerals() {
        assertEquals("৯", convertEnglishWordsToBanglaNumerals("Nine"));
        assertEquals("১০", convertEnglishWordsToBanglaNumerals("Ten"));
        assertEquals("৫০", convertEnglishWordsToBanglaNumerals("Fifty"));
        assertEquals("১০০", convertEnglishWordsToBanglaNumerals("One hundred"));
        assertEquals("৯৯৯", convertEnglishWordsToBanglaNumerals("Nine hundred ninety nine"));
        assertEquals("১০০০", convertEnglishWordsToBanglaNumerals("One thousand"));
        assertEquals("৯৯৯৯", convertEnglishWordsToBanglaNumerals("Nine thousand nine hundred ninety nine"));
        assertEquals("১০০০০", convertEnglishWordsToBanglaNumerals("Ten thousand"));
        assertEquals("১০০০০০", convertEnglishWordsToBanglaNumerals("One hundred thousand"));
        assertEquals("১০০০০০০", convertEnglishWordsToBanglaNumerals("One million"));
        assertEquals("৯.৯", convertEnglishWordsToBanglaNumerals("Nine point nine"));
        assertEquals("১০.৫", convertEnglishWordsToBanglaNumerals("Ten point five zero"));
        assertEquals("৯৯৯৯.৯৯", convertEnglishWordsToBanglaNumerals("Nine thousand nine hundred ninety nine point nine nine"));
        assertEquals("১.২৩৪", convertEnglishWordsToBanglaNumerals("One point two three four"));
        assertEquals("১২৩.৪৫", convertEnglishWordsToBanglaNumerals("One hundred twenty three point four five"));
        assertEquals("-৯", convertEnglishWordsToBanglaNumerals("Negative nine"));
        assertEquals("-১০", convertEnglishWordsToBanglaNumerals("Negative ten"));
        assertEquals("-৯৯৯৯", convertEnglishWordsToBanglaNumerals("Negative nine thousand nine hundred ninety nine"));
        assertEquals("-১.২৩", convertEnglishWordsToBanglaNumerals("Negative one point two three"));
        assertEquals("১০০০০০০", convertEnglishWordsToBanglaNumerals("One million"));
        assertEquals("১০০০০০০০০০", convertEnglishWordsToBanglaNumerals("One billion"));
        assertEquals("১০০০০০০০০০০০০", convertEnglishWordsToBanglaNumerals("One trillion"));
        assertEquals("৯৯৯৯৯৯৯৯৯৯৯৯", convertEnglishWordsToBanglaNumerals("Nine hundred ninety nine billion nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine"));
    }
}
