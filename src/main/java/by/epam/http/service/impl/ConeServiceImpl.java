package by.epam.http.service.impl;

import by.epam.http.entity.Cone;
import by.epam.http.exception.ConeException;
import by.epam.http.service.ConeService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class ConeServiceImpl implements ConeService {
    private static final String ERROR_MESSAGE = "cone is invalided";
    static final Logger LOGGER = (Logger) LogManager.getLogger();

    @Override
    public double calculateTotalSurfaceArea(Cone cone) throws ConeException {
        if (cone == null) {
            throw new ConeException(ERROR_MESSAGE);
        }
        double lateralSurfaceArea = calculateLateralSurfaceArea(cone);
        double totalSurfaceArea = lateralSurfaceArea + Math.PI * Math.pow(cone.getRadius(), 2);
        LOGGER.log(Level.INFO, "Calculate totalSurfaceArea: {}", totalSurfaceArea);
        return totalSurfaceArea;
    }

    @Override
    public double calculateLateralSurfaceArea(Cone cone) throws ConeException {
        if (cone == null) {
            throw new ConeException(ERROR_MESSAGE);
        }
        double lateralSurfaceArea = Math.PI * cone.getRadius() * cone.getHeight();
        LOGGER.log(Level.INFO, "Calculate lateralSurfaceArea: {}", lateralSurfaceArea);
        return lateralSurfaceArea;
    }
}
