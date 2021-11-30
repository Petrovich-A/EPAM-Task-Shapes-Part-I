package by.petrovich.shape;

import by.petrovich.shape.entity.Cone;
import by.petrovich.shape.entity.Point2D;
import by.petrovich.shape.exception.ConeException;
import by.petrovich.shape.parser.DataFromFileParser1;
import by.petrovich.shape.reader.impl.FileReader;
import by.petrovich.shape.service.impl.ConeServiceImpl;
import by.petrovich.shape.validator.impl.ConeValidatorImpl;
import by.petrovich.shape.validator.impl.FileValidatorImpl;

import java.util.List;
/**
 * Runner
 */
public class Runner {
    public static void main(String[] args) throws ConeException {
        FileReader fileReader = new FileReader();
        List<String> list;
        list = fileReader.readFile("src/main/resources/points.txt");
        System.out.println("list: " + list);
        FileValidatorImpl fileLineValidator = new FileValidatorImpl();
        boolean isValid = fileLineValidator.isFileLineValid(list.get(0));
        System.out.println("isValid: " + isValid + ", line: " + list.get(0));

        DataFromFileParser1 dataFromFileParser1 = new DataFromFileParser1();
        List<Double> list1 = dataFromFileParser1.parseLine(list.get(0));
        System.out.println("list1: " + list1);
        Point2D point2D = new Point2D(list1.get(0), list1.get(1));
        System.out.println("point: " + point2D);

        Cone cone = new Cone(new Point2D(0d, 0d), 5, 10);
        System.out.println("cone: " + cone);

        ConeValidatorImpl coneValidator = new ConeValidatorImpl();
        System.out.println("isConeValid: " + coneValidator.isConeValid(cone));

        ConeServiceImpl coneService = new ConeServiceImpl();
        System.out.println("calculateLateralSurfaceArea: " + coneService.calculateLateralSurfaceArea(cone));
        System.out.println("calculateTotalSurfaceArea: " + coneService.calculateTotalSurfaceArea(cone));

    }
}
