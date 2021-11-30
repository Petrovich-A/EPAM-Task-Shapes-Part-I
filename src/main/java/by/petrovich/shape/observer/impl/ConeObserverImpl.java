package by.petrovich.shape.observer.impl;

import by.petrovich.shape.entity.Cone;
import by.petrovich.shape.exception.ConeException;
import by.petrovich.shape.observer.ConeEvent;
import by.petrovich.shape.observer.ConeObserver;
import by.petrovich.shape.service.impl.ConeServiceImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConeObserverImpl implements ConeObserver {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void updateParameters(ConeEvent event) {
        Cone cone = event.getSource();
        int coneId = cone.getConeId();
//      Warehouse
        ConeServiceImpl coneService = new ConeServiceImpl();
        try {
            double lateralSurfaceArea = coneService.calculateLateralSurfaceArea(cone);
            double totalSurfaceArea = coneService.calculateTotalSurfaceArea(cone);
        } catch (ConeException e) {
            LOGGER.log(Level.ERROR, "Warehouse change error ", e);
        }

    }
}
