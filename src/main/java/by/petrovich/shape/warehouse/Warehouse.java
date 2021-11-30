package by.petrovich.shape.warehouse;

import by.petrovich.shape.exception.ConeException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final Warehouse instance = new Warehouse();
    private final Map<String, ConeParameters> parametrsStorage = new HashMap<String, ConeParameters>();

    private Warehouse() {
    }

    public static Warehouse getInstance() {
        return instance;
    }

    public void putParameters(String id, double lateralSurfaceArea, double totalSurfaceArea) {
        ConeParameters coneParameters = new ConeParameters(lateralSurfaceArea, totalSurfaceArea);
        parametrsStorage.putIfAbsent(id, coneParameters);
        LOGGER.log(Level.INFO, "Parameters are added successfully");
    }

    public ConeParameters receiveParameters(String id) throws ConeException {
        ConeParameters coneParameters = parametrsStorage.get(id);
        if (coneParameters == null) {
            throw new ConeException("There is no cone with such id");
        }
        return coneParameters;
    }

    public void updateParameters(String id, double lateralSurfaceArea, double totalSurfaceArea) throws ConeException {
        ConeParameters coneParameters = parametrsStorage.get(id);
        if (coneParameters == null) {
            throw new ConeException("There is no ellipse with such id");
        }
        coneParameters.setLateralSurfaceArea(lateralSurfaceArea);
        coneParameters.setTotalSurfaceArea(totalSurfaceArea);
        LOGGER.log(Level.INFO, "Parameters are updated successfully");
    }

    public boolean containsCone(String id) {
        return parametrsStorage.containsKey(id);
    }
}
