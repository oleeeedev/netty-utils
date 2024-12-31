package dev.ole.lib.utility;

import lombok.NonNull;

import java.security.SecureRandom;
import java.util.Random;

public class StringUtil {

    private static final Random SECURE_RANDOM = new SecureRandom();
    private static final char[] DEFAULT_ALPHABET_UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

    private StringUtil() {
        throw new UnsupportedOperationException();
    }

    /**
     * Generates a random string consisting of uppercase characters and digits with the provided length.
     *
     * @param length the length the generated string should have.
     * @return the randomly generated string.
     * @throws IllegalArgumentException if the given string length is zero or negative.
     */
    public static @NonNull String generateRandomString(int length) {

        var buffer = new StringBuilder(length);
        for (var i = 0; i < length; i++) {
            var nextCharIdx = SECURE_RANDOM.nextInt(DEFAULT_ALPHABET_UPPERCASE.length);
            buffer.append(DEFAULT_ALPHABET_UPPERCASE[nextCharIdx]);
        }

        // convert to string
        return buffer.toString();
    }

    /**
     * Checks if the given string ends with the given suffix ignoring the string casing.
     *
     * @param string the string to check for the given suffix.
     * @param suffix the suffix to validate the string ends with.
     * @return true if the given string ends with the given suffix, false otherwise.
     * @throws NullPointerException if the given string or suffix is null.
     */
    public static boolean endsWithIgnoreCase(@NonNull String string, @NonNull String suffix) {
        var suffixLength = suffix.length();
        return string.regionMatches(true, string.length() - suffixLength, suffix, 0, suffixLength);
    }

    /**
     * Checks if the given string starts with the given prefix ignoring the string casing.
     *
     * @param string the string to check for the given prefix.
     * @param prefix the prefix to validate the string starts with.
     * @return true if the given string starts with the given prefix, false otherwise.
     * @throws NullPointerException if the given string or prefix is null.
     */
    public static boolean startsWithIgnoreCase(@NonNull String string, @NonNull String prefix) {
        return string.regionMatches(true, 0, prefix, 0, prefix.length());
    }
}