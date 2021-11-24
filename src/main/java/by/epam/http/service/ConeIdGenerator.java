package by.epam.http.service;

import java.util.UUID;

public class ConeIdGenerator {
    private final String ID = "coneID";

    public String createId(){
        return UUID.randomUUID().toString();
    }

    public ConeIdGenerator() {
    }
}
