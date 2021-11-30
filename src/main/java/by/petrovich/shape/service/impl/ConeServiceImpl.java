package by.petrovich.shape.service.impl;

import by.petrovich.shape.entity.Cone;
import by.petrovich.shape.exception.ConeException;
import by.petrovich.shape.service.ConeService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ConeServiceImpl implements ConeService {
    static final Logger LOGGER = LogManager.getLogger();

    @Override
    public double calculateTotalSurfaceArea(Cone cone) throws ConeException {
        if (cone == null) {
            throw new ConeException("cone is invalided");
        }
        double lateralSurfaceArea = calculateLateralSurfaceArea(cone);
        double totalSurfaceArea = lateralSurfaceArea + Math.PI * Math.pow(cone.getRadius(), 2);
        LOGGER.log(Level.INFO, "Calculate totalSurfaceArea: {}", totalSurfaceArea);
        return totalSurfaceArea;
    }

    @Override
    public double calculateLateralSurfaceArea(Cone cone) throws ConeException {
        if (cone == null) {
            throw new ConeException("cone is invalided");
        }
        double lateralSurfaceArea = Math.PI * cone.getRadius() * cone.getSlantHeight();
        LOGGER.log(Level.INFO, "Calculate lateralSurfaceArea: {}", lateralSurfaceArea);
        return lateralSurfaceArea;
    }
}
