package by.epam.http.util;

public class ShapeIdGenerator {
    private static long counter;

    public ShapeIdGenerator() {
    }

    public static long generateId() {
        return counter++;
    }
}
