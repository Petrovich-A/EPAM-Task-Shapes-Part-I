package by.epam.http.observer.impl;

import by.epam.http.entity.Cone;
import by.epam.http.exception.ConeException;
import by.epam.http.observer.ConeEvent;
import by.epam.http.observer.ConeObserver;
import by.epam.http.service.impl.ConeServiceImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConeObserverImpl implements ConeObserver {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void updateParameters(ConeEvent event) {
        Cone cone = event.getSource();
        int coneId = cone.getConeId();
//        Warehouse
        ConeServiceImpl coneService = new ConeServiceImpl();
        try{
            double lateralSurfaceArea = coneService.calculateLateralSurfaceArea(cone);
            double totalSurfaceArea = coneService.calculateTotalSurfaceArea(cone);
        }catch (ConeException e){
            LOGGER.log(Level.ERROR, "Warehouse change arror ", e);
        }

    }
}
