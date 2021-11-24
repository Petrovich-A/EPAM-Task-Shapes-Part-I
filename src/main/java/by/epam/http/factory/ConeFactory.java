package by.epam.http.factory;

import by.epam.http.entity.Cone;
import by.epam.http.entity.Point;

import java.util.List;

public class ConeFactory {
    private static final ConeFactory instance = new ConeFactory();
    private static final int COORDINATES_NUMBER = 4;

    private ConeFactory() {
    }

    public Cone getCone(List<Double> numbersFromLine) {
        Point point = new Point(numbersFromLine.get(0), numbersFromLine.get(1));
        Point secondPoint = new Point(numbersFromLine.get(2), numbersFromLine.get(3));
        Cone cone = new Cone(point.getX(), point.getY(), numbersFromLine.get(2), numbersFromLine.get(3));
        return cone;
    }

    public static ConeFactory getInstance() {
        return instance;
    }

}
