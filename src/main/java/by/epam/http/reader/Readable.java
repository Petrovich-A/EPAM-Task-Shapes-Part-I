package by.epam.http.reader;

import by.epam.http.exception.ConeException;

import java.util.List;

public interface Readable {
    public List<String> readFile(String pathFile) throws ConeException;
}
