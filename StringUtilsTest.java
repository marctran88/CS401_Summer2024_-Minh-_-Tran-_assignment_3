package assignment3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testConcatenate() {
        assertEquals("helloworld", StringUtils.concatenate("hello", "world"));
        assertEquals("java programming", StringUtils.concatenate("java ", "programming"));
        assertEquals("", StringUtils.concatenate("", ""));
        assertEquals("AB", StringUtils.concatenate("A", "B"));
        assertEquals("123456", StringUtils.concatenate("123", "456"));
    }

    @Test
    public void testReverse() {
        assertEquals("olleh", StringUtils.reverse("hello"));
        assertEquals("avaj", StringUtils.reverse("java"));
        assertEquals("", StringUtils.reverse(""));
        assertEquals("A", StringUtils.reverse("A"));
        assertEquals("321", StringUtils.reverse("123"));
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", StringUtils.toUpperCase("hello"));
        assertEquals("JAVA", StringUtils.toUpperCase("java"));
        assertEquals("", StringUtils.toUpperCase(""));
        assertEquals("A", StringUtils.toUpperCase("A"));
        assertEquals("123", StringUtils.toUpperCase("123"));
    }

    @Test
    public void testTrim() {
        assertEquals("hello", StringUtils.trim("  hello  "));
        assertEquals("java", StringUtils.trim("  java  "));
        assertEquals("", StringUtils.trim("   "));
        assertEquals("A", StringUtils.trim(" A "));
        assertEquals("123", StringUtils.trim(" 123 "));
    }
}
