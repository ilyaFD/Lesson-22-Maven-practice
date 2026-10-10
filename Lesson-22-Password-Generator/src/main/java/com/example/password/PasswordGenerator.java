package com.example.password;
import java.security.SecureRandom;
public class PasswordGenerator {
    private static final String CHARACTERS =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                    + "abcdefghijklmnopqrstuvwxyz"
                    + "0123456789"
                    + "!@#$%^&*";

    private final SecureRandom random = new SecureRandom();

    public String generatePassword (int length) {
        if (length <= 0) {
            throw new IllegalArgumentException(
                    "Password length must be greater than zero"
            );
        }

        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(index));
        }

        return password.toString();
    }
}
