package by.petrovich.shape.reader.impl;

import by.petrovich.shape.exception.ConeException;
import by.petrovich.shape.reader.Readable;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ReaderFilePoints implements Readable {
    static final Logger LOGGER = LogManager.getLogger();

    @Override
    public List<String> readFile(String pathFile) throws ConeException {
        List<String> linesFromFiles;
        Path path = Paths.get(pathFile);

        try {
            linesFromFiles = Files.lines(path, StandardCharsets.UTF_8).collect(Collectors.toList());
        } catch (IOException e) {
            throw new ConeException("Error file reading", e);
        }
        LOGGER.log(Level.INFO, "LinesFromFiles: {}", linesFromFiles);
        return linesFromFiles;
    }

}
