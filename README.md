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
    <version>1.0</version>
</dependency>
```

### 🚀 Usage

Convert Numbers to Bangla Numerals

```java
import com.acesif.BanglaNumeralUtil;

public class Main {
    public static void main(String[] args) {
        String banglaNumber = BanglaNumeralUtil.convertToBangla(12345);
        System.out.println("Bangla Numeral: " + banglaNumber);  // Output: ১২৩৪৫
    }
}
```

