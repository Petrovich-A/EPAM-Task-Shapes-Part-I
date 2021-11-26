package by.epam.http.util;

import java.util.UUID;

public final class ConeIdGenerator {

    public ConeIdGenerator() {
    }

    public static String generateId() {
        return UUID.randomUUID().toString();
    }
}
