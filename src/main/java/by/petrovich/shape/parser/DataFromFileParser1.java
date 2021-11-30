package by.petrovich.shape.parser;

import by.petrovich.shape.exception.ConeException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataFromFileParser1 {
    private final Logger logger = LogManager.getLogger();
    private final String DELIMITER_REGEX = "\\s+";

    public List<Double> parseLine(String lineFromFile) throws ConeException {
        if (lineFromFile == null || lineFromFile.isEmpty()) {
            throw new ConeException("Line from file is empty");
        }
        List<Double> numbersFromLine;
        try {
            numbersFromLine = Arrays.stream(lineFromFile.split(DELIMITER_REGEX))
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());
        } catch (NumberFormatException e) {
            throw new ConeException("Coordanates are invalided");
        }
        logger.log(Level.INFO, "Lines are parsed successfully");
        return numbersFromLine;
    }

}
