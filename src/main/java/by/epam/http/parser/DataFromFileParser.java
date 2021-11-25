package by.epam.http.parser;

import by.epam.http.exception.ConeException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataFromFileParser {
    static Logger logger = LogManager.getLogger();
    private final String LINE_PARSE_REGEX = "\\s+";

    public List<Double> parseLine(String lineFromFile) throws ConeException {
        if (lineFromFile == null || lineFromFile.isEmpty()) {
            throw new ConeException("Line from file is empty");
        }
        List<Double> numbersFromLine;
        try {
            numbersFromLine = Arrays.stream(lineFromFile.split(LINE_PARSE_REGEX))
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());
        } catch (NumberFormatException e) {
            throw new ConeException("Coordanates are invalided");
        }
        logger.log(Level.INFO, "Lines are parsed successfully");
        return numbersFromLine;
    }

}
