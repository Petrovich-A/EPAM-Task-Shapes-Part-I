package by.epam.http;

import by.epam.http.entity.Cone;
import by.epam.http.entity.Point;
import by.epam.http.parser.DataFromFileParser;
import by.epam.http.reader.impl.ReaderFilePoints;
import by.epam.http.service.Calculate;
import by.epam.http.validator.impl.ConeValidatorImpl;
import by.epam.http.validator.impl.FileValidatorImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Runner
 */
public class Runner {
    public static void main(String[] args) {
        ReaderFilePoints readerFilePoints = new ReaderFilePoints();
        List<String> list = new ArrayList<>();
        list = readerFilePoints.readFile("src/main/resources/points.txt");
        System.out.println("list: " + list);
        FileValidatorImpl fileLineValidator = new FileValidatorImpl();
        boolean isValid = fileLineValidator.isFileLineValid(list.get(0));
        System.out.println("isValid: " + isValid + ", line: " + list.get(0));

        DataFromFileParser dataFromFileParser = new DataFromFileParser();
        List<Double> list1 = dataFromFileParser.parseLine(list.get(0));
        System.out.println("list1: " + list1);
        Point point = new Point(list1.get(0), list1.get(1));
        System.out.println("point: " + point);

        Cone cone = new Cone(list1.get(0), list1.get(1), list1.get(2), list1.get(3));
        System.out.println("cone: " + cone);

        ConeValidatorImpl coneValidator = new ConeValidatorImpl();
        System.out.println("isConeValid: " + coneValidator.isConeValid(cone));

        Calculate calculate = new Calculate();
        System.out.println("calculateLateralSurfaceArea: " + calculate.calculateLateralSurfaceArea(cone));
        System.out.println("calculateTotalSurfaceArea: " + calculate.calculateTotalSurfaceArea(cone));



    }
}
