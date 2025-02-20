package util;

import me.num.util.NumberConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToBanglaNumeralTest {

    @Test
    public void testConvertToBanglaNumeral() {
        assertEquals("৯৯৯৯.৯৯৯৯৯", convertToBanglaNumeral(9999.99999));
        assertEquals("১২৩৪.৫৬", convertToBanglaNumeral(1234.56));
        assertEquals("০", convertToBanglaNumeral(0.0));
        assertEquals("১", convertToBanglaNumeral(1.0));
        assertEquals("১০০০", convertToBanglaNumeral(1000.0));
    }

    @Test
    public void testConvertToBanglaWords() {
        assertEquals("নয় হাজার নয় শত নিরানব্বই দশমিক নয় নয় নয় নয় নয়", convertToBanglaWords(9999.99999));
        assertEquals("এক হাজার দুই শত চৌত্রিশ দশমিক পাঁচ ছয়", convertToBanglaWords(1234.56));
        assertEquals("শূন্য", convertToBanglaWords(0.0));
        assertEquals("এক", convertToBanglaWords(1.0));
        assertEquals("এক হাজার", convertToBanglaWords(1000.0));
    }

    private static String convertToBanglaNumeral(Double num) {
        return NumberConverter.convertToBanglaNumerals(num);
    }

    private static String convertToBanglaWords(Double num) {
        return NumberConverter.convertToBanglaWords(num);
    }
}
