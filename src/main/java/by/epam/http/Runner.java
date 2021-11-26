package by.epam.http;

import by.epam.http.entity.Cone;
import by.epam.http.entity.Point2D;
import by.epam.http.exception.ConeException;
import by.epam.http.parser.DataFromFileParser;
import by.epam.http.reader.impl.ReaderFilePoints;
import by.epam.http.service.impl.ConeServiceImpl;
import by.epam.http.validator.impl.ConeValidatorImpl;
import by.epam.http.validator.impl.FileValidatorImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Runner
 */
public class Runner {
    public static void main(String[] args) throws ConeException {
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
        Point2D point2D = new Point2D(list1.get(0), list1.get(1));
        System.out.println("point: " + point2D);

        Cone cone = new Cone(point2D, point2D);
        System.out.println("cone: " + cone);


        ConeValidatorImpl coneValidator = new ConeValidatorImpl();
        System.out.println("isConeValid: " + coneValidator.isConeValid(cone));

        ConeServiceImpl coneService = new ConeServiceImpl();
        System.out.println("calculateLateralSurfaceArea: " + coneService.calculateLateralSurfaceArea(cone));
        System.out.println("calculateTotalSurfaceArea: " + coneService.calculateTotalSurfaceArea(cone));



    }
}
