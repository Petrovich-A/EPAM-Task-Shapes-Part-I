package by.petrovich.shape.util;

import java.util.UUID;

public final class ConeIdGenerator {
    private static int id = 0;

    private ConeIdGenerator() {
    }

    public static int generateId() {
        return id++;
    }
}
