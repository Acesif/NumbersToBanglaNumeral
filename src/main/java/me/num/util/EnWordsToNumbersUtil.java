package me.num.util;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static me.num.util.NumberMap.allowedStrings;

public class EnWordsToNumbersUtil {

    public static String convertTextualNumbersInDocument(String inputText) {
        List<String> words = new LinkedList<>(cleanAndTokenizeText(inputText));
        return wordListToString(replaceTextualNumbers(words));
    }

    private static List<String> replaceTextualNumbers(List<String> words) {
        List<String> processingList = new LinkedList<>();

        int i = 0;
        while (i < words.size() || !processingList.isEmpty()) {

            String word = "";
            if (i < words.size()) {
                word = words.get(i);
            }

            String wordStripped = word.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();

            if (allowedStrings.contains(wordStripped) && !(processingList.isEmpty() && wordStripped.equals("and"))) {
                words.remove(i);
                processingList.add(word);
            } else if (!processingList.isEmpty()) {

                String lastProcessedWord = processingList.getLast();
                if (lastProcessedWord.equals("and")) {
                    words.add(i, "and");
                    processingList.removeLast();
                }

                String wordAsDigits = String.valueOf(convertWordsToNum(processingList));

                wordAsDigits = retainPunctuation(processingList, wordAsDigits);
                words.add(i, String.valueOf(wordAsDigits));

                processingList.clear();
                i += 2;
            } else {
                i++;
            }
        }

        return words;
    }

    private static String retainPunctuation(List<String> processingList, String wordAsDigits) {

        String lastWord = processingList.getLast();
        char lastChar = lastWord.trim().charAt(lastWord.length() - 1);
        if (!Character.isLetter(lastChar)) {
            wordAsDigits += lastChar;
        }

        String firstWord = processingList.getFirst();
        char firstChar = firstWord.trim().charAt(0);
        if (!Character.isLetter(firstChar)) {
            wordAsDigits = firstChar + wordAsDigits;
        }

        return wordAsDigits;
    }

    private static List<String> cleanAndTokenizeText(String sentence) {
        List<String> words = new LinkedList<>(Arrays.asList(sentence.split(" ")));

        for (int i = 0; i < words.size(); i++) {
            String str = words.get(i);
            if (str.contains("-")) {
                List<String> splitWords = Arrays.asList(str.split("-"));
                if (splitWords.size() > 1 && allowedStrings.contains(splitWords.getFirst())) {
//                    words.remove(i);
                    words.addAll(i, splitWords);
                }
            }

        }

        return words;
    }

    private static String wordListToString(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (i == 0 && str != null) {
                result.append(list.get(i));
            } else if (str != null) {
                result.append(" ").append(list.get(i));
            }
        }

        return result.toString();
    }

    private static Number convertWordsToNum(List<String> words) {
        long finalResult = 0;
        long intermediateResult = 0;
        StringBuilder decimalPart = new StringBuilder();
        boolean isDecimal = false;
        boolean isNegative = false; // Flag for negative numbers

        for (String word : words) {
            String str = word.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");

            if (str.equalsIgnoreCase("negative")) {
                isNegative = true; // Mark the number as negative
                continue;
            }

            if (str.equalsIgnoreCase("point")) {
                isDecimal = true;
                continue;
            }

            if (isDecimal) {
                // Process decimal digits individually after "point"
                if (str.equalsIgnoreCase("zero")) {
                    decimalPart.append("0");
                } else if (str.equalsIgnoreCase("one")) {
                    decimalPart.append("1");
                } else if (str.equalsIgnoreCase("two")) {
                    decimalPart.append("2");
                } else if (str.equalsIgnoreCase("three")) {
                    decimalPart.append("3");
                } else if (str.equalsIgnoreCase("four")) {
                    decimalPart.append("4");
                } else if (str.equalsIgnoreCase("five")) {
                    decimalPart.append("5");
                } else if (str.equalsIgnoreCase("six")) {
                    decimalPart.append("6");
                } else if (str.equalsIgnoreCase("seven")) {
                    decimalPart.append("7");
                } else if (str.equalsIgnoreCase("eight")) {
                    decimalPart.append("8");
                } else if (str.equalsIgnoreCase("nine")) {
                    decimalPart.append("9");
                }
                continue;
            }

            if (str.equalsIgnoreCase("zero")) {
                intermediateResult += 0;
            } else if (str.equalsIgnoreCase("one")) {
                intermediateResult += 1;
            } else if (str.equalsIgnoreCase("two")) {
                intermediateResult += 2;
            } else if (str.equalsIgnoreCase("three")) {
                intermediateResult += 3;
            } else if (str.equalsIgnoreCase("four")) {
                intermediateResult += 4;
            } else if (str.equalsIgnoreCase("five")) {
                intermediateResult += 5;
            } else if (str.equalsIgnoreCase("six")) {
                intermediateResult += 6;
            } else if (str.equalsIgnoreCase("seven")) {
                intermediateResult += 7;
            } else if (str.equalsIgnoreCase("eight")) {
                intermediateResult += 8;
            } else if (str.equalsIgnoreCase("nine")) {
                intermediateResult += 9;
            } else if (str.equalsIgnoreCase("ten")) {
                intermediateResult += 10;
            } else if (str.equalsIgnoreCase("eleven")) {
                intermediateResult += 11;
            } else if (str.equalsIgnoreCase("twelve")) {
                intermediateResult += 12;
            } else if (str.equalsIgnoreCase("thirteen")) {
                intermediateResult += 13;
            } else if (str.equalsIgnoreCase("fourteen")) {
                intermediateResult += 14;
            } else if (str.equalsIgnoreCase("fifteen")) {
                intermediateResult += 15;
            } else if (str.equalsIgnoreCase("sixteen")) {
                intermediateResult += 16;
            } else if (str.equalsIgnoreCase("seventeen")) {
                intermediateResult += 17;
            } else if (str.equalsIgnoreCase("eighteen")) {
                intermediateResult += 18;
            } else if (str.equalsIgnoreCase("nineteen")) {
                intermediateResult += 19;
            } else if (str.equalsIgnoreCase("twenty")) {
                intermediateResult += 20;
            } else if (str.equalsIgnoreCase("thirty")) {
                intermediateResult += 30;
            } else if (str.equalsIgnoreCase("forty")) {
                intermediateResult += 40;
            } else if (str.equalsIgnoreCase("fifty")) {
                intermediateResult += 50;
            } else if (str.equalsIgnoreCase("sixty")) {
                intermediateResult += 60;
            } else if (str.equalsIgnoreCase("seventy")) {
                intermediateResult += 70;
            } else if (str.equalsIgnoreCase("eighty")) {
                intermediateResult += 80;
            } else if (str.equalsIgnoreCase("ninety")) {
                intermediateResult += 90;
            } else if (str.equalsIgnoreCase("hundred")) {
                intermediateResult *= 100;
            } else if (str.equalsIgnoreCase("thousand")) {
                intermediateResult *= 1000;
                finalResult += intermediateResult;
                intermediateResult = 0;
            } else if (str.equalsIgnoreCase("million")) {
                intermediateResult *= 1000000;
                finalResult += intermediateResult;
                intermediateResult = 0;
            } else if (str.equalsIgnoreCase("billion")) {
                intermediateResult *= 1000000000;
                finalResult += intermediateResult;
                intermediateResult = 0;
            } else if (str.equalsIgnoreCase("trillion")) {
                intermediateResult *= 1000000000000L;
                finalResult += intermediateResult;
                intermediateResult = 0;
            }
        }

        finalResult += intermediateResult;

        // If there is a decimal part, return as Double
        if (isDecimal && !decimalPart.isEmpty()) {
            return isNegative ? -Double.parseDouble(finalResult + "." + decimalPart) : Double.parseDouble(finalResult + "." + decimalPart);
        }

        // Return as Long if no decimal is present
        return isNegative ? -finalResult : finalResult;
    }
}
