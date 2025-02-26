# 📜 BanglaNumeralUtil 🔢

**BanglaNumeralUtil** is a Java utility library that converts numbers into **Bangla numerals**. This lightweight and easy-to-use library helps developers seamlessly integrate Bangla numeral conversions into their applications.

---

## 📦 Installation

To use **BanglaNumeralUtil**, add the following **Maven repository** to your `pom.xml`:

```xml
<distributionManagement>
    <repository>
        <id>github</id>
        <url>https://maven.pkg.github.com/Acesif/NumbersToBanglaNumeral</url>
    </repository>
</distributionManagement>
```

### 🔗 Dependency

Add the following dependency in your pom.xml:

```xml
<dependency>
    <groupId>com.acesif</groupId>
    <artifactId>banglanumeralutil</artifactId>
    <version>1.0.3</version>
</dependency>
```

### 🚀 Usage

Convert Numbers to Bangla Numerals

```java
import com.acesif.BanglaNumeralConverter;

public class Main {
    public static void main(String[] args) {
        String banglaNumberInWords = BanglaNumeralConverter.convertNumberToBanglaWords("1234.56");
        System.out.println("In Words: " + banglaNumberInWords);  // Output: এক হাজার দুই শত চৌত্রিশ দশমিক পাঁচ ছয়
        
        String englishTobanglaNumberInWords = BanglaNumeralConverter.convertEnglishWordsToBanglaWords("Two hundred fifty six");
        System.out.println("In Words: " + banglaNumberInWords);  // Output: দুই শত ছাপ্পান্ন

        String banglaNumber = BanglaNumeralConverter.convertNumberToBanglaNumerals("1234.56");
        System.out.println("In Numerals: " + banglaNumber);  // Output: ১২৩৪.৫৬
        
        String englishTobanglaNumbers = BanglaNumeralConverter.convertEnglishWordsToBanglaNumerals("Nine thousand nine hundred ninety nine");
        System.out.println("In Numerals: " + banglaNumber);  // Output: ৯৯৯৯
    }
}
```

### Acknowledgements
Made use of a [`word-to-numbers`](https://github.com/jgraham0325/words-to-numbers) utility class made by [James Graham](https://github.com/jgraham0325)

