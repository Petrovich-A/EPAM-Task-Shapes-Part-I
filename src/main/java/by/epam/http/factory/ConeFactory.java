package by.epam.http.factory;

import by.epam.http.entity.Cone;
import by.epam.http.entity.Point2D;
import by.epam.http.exception.ConeException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.List;

public class ConeFactory {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final ConeFactory instance = new ConeFactory();
    private static final int COORDINATES_NUMBER = 4;

    private ConeFactory() {
    }

    public Cone getCone(List<Double> numbersFromLine) throws ConeException {
        if (numbersFromLine.size() != COORDINATES_NUMBER){
            throw new ConeException("Invalid numbers: " + numbersFromLine);
        }
        Point2D firstPoint2D = new Point2D(numbersFromLine.get(0), numbersFromLine.get(1));
        Point2D secondPoint2D = new Point2D(numbersFromLine.get(2), numbersFromLine.get(3));
        Cone cone = new Cone(firstPoint2D, secondPoint2D);
        LOGGER.log(Level.INFO, "Cone are created");
        return cone;
    }

    public static ConeFactory getInstance() {
        return instance;
    }

}
