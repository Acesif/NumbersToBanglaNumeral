package me.num.util;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberMap {

    public static final List<String> allowedStrings = Arrays.asList(
            "negative","and", "point", "zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
            "ninety", "hundred", "thousand", "million", "billion", "trillion"
    );

    public static final String[] UNITS = {"", "শত", "হাজার", "লক্ষ", "কোটি"};
    public static final Map<Integer, String> BANGLA_DIGITS = Map.of(
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

    public static Map<Integer, String> NUMERIC_WORDS;

    static {
        String[] words = {
                "শূন্য", "এক", "দুই", "তিন", "চার", "পাঁচ", "ছয়", "সাত", "আট", "নয়", "দশ",
                "এগারো", "বার", "তেরো", "চৌদ্দ", "পনেরো", "ষোল", "সতেরো", "আঠারো", "উনিশ", "বিশ",
                "একুশ", "বাইশ", "তেইশ", "চব্বিশ", "পঁচিশ", "ছাব্বিশ", "সাতাশ", "আঠাশ", "উনত্রিশ", "ত্রিশ",
                "একত্রিশ", "বত্রিশ", "তেত্রিশ", "চৌত্রিশ", "পঁয়ত্রিশ", "ছত্রিশ", "সাঁইত্রিশ", "আটত্রিশ", "উনচল্লিশ", "চল্লিশ",
                "একচল্লিশ", "বিয়াল্লিশ", "তেতাল্লিশ", "চুয়াল্লিশ", "পঁয়তাল্লিশ", "ছেচল্লিশ", "সাতচল্লিশ", "আটচল্লিশ", "উনপঞ্চাশ", "পঞ্চাশ",
                "একান্ন", "বায়ান্ন", "তিপ্পান্ন", "চুয়ান্ন", "পঞ্চান্ন", "ছাপ্পান্ন", "সাতান্ন", "আটান্ন", "উনষাট", "ষাট",
                "একষট্টি", "বাষট্টি", "তেষট্টি", "চৌষট্টি", "পঁয়ষট্টি", "ছেষট্টি", "সাতষট্টি", "আটষট্টি", "উনসত্তর", "সত্তর",
                "একাত্তর", "বাহাত্তর", "তিয়াত্তর", "চুয়াত্তর", "পঁচাত্তর", "ছিয়াত্তর", "সাতাত্তর", "আটাত্তর", "উনআশি", "আশি",
                "একাশি", "বিরাশি", "তিরাশি", "চুরাশি", "পঁচাশি", "ছিয়াশি", "সাতাশি", "আটাশি", "উননব্বই", "নব্বই",
                "একানব্বই", "বিরানব্বই", "তিরানব্বই", "চুরানব্বই", "পঁচানব্বই", "ছিয়ানব্বই", "সাতানব্বই", "আটানব্বই", "নিরানব্বই", "একশত"
        };

        NUMERIC_WORDS = IntStream.range(0, words.length)
                .boxed()
                .collect(Collectors.toMap(
                        i -> i,
                        i -> words[i],
                        (a, _) -> a,
                        LinkedHashMap::new
                ));
    }

    public static final Map<String, String> numberMap = new HashMap<>();

    static {
        numberMap.put("negative", "ঋণাত্মক");
        numberMap.put("zero", "শূন্য");
        numberMap.put("one", "এক");
        numberMap.put("two", "দুই");
        numberMap.put("three", "তিন");
        numberMap.put("four", "চার");
        numberMap.put("five", "পাঁচ");
        numberMap.put("six", "ছয়");
        numberMap.put("seven", "সাত");
        numberMap.put("eight", "আট");
        numberMap.put("nine", "নয়");
        numberMap.put("ten", "দশ");
        numberMap.put("eleven", "এগারো");
        numberMap.put("twelve", "বারো");
        numberMap.put("thirteen", "তেরো");
        numberMap.put("fourteen", "চৌদ্দ");
        numberMap.put("fifteen", "পনেরো");
        numberMap.put("sixteen", "ষোলো");
        numberMap.put("seventeen", "সতেরো");
        numberMap.put("eighteen", "আঠারো");
        numberMap.put("nineteen", "ঊনিশ");
        numberMap.put("twenty", "বিশ");
        numberMap.put("thirty", "ত্রিশ");
        numberMap.put("forty", "চল্লিশ");
        numberMap.put("fifty", "পঞ্চাশ");
        numberMap.put("sixty", "ষাট");
        numberMap.put("seventy", "সত্তর");
        numberMap.put("eighty", "আশি");
        numberMap.put("ninety", "নব্বই");
        numberMap.put("hundred", "শত");
        numberMap.put("thousand", "হাজার");
        numberMap.put("million", "মিলিয়ন");
        numberMap.put("billion", "বিলিয়ন");
        numberMap.put("point", "দশমিক");
    }
}
