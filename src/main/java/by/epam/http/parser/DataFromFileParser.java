package by.epam.http.parser;

import by.epam.http.entity.Point;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataFromFileParser {

    private final String LINE_PARSE_REGEX = "\\s+";
    private Point point;
    private double radius;
    private double height;

    public List<Double> parseLine(String lineFromFile) {
        List<Double> numbersFromLine;
        numbersFromLine = Arrays.stream(lineFromFile.split(LINE_PARSE_REGEX))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        return numbersFromLine;
    }

}
