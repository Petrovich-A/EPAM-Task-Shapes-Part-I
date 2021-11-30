package by.petrovich.shape.reader;

import by.petrovich.shape.exception.ConeException;

import java.util.List;

public interface Readable {
    List<String> readFile(String pathFile) throws ConeException;
}
