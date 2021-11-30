package by.epam.http.comparator;

import by.epam.http.entity.Cone;
import by.epam.http.exception.ConeException;
import by.epam.http.service.impl.ConeServiceImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;

public enum ConeComparator implements Comparator<Cone> {
    ID {
        @Override
        public int compare(Cone o1, Cone o2) {
            return o1.getConeId() - o2.getConeId();
        }
    },

    AREA {
        @Override
        public int compare(Cone o1, Cone o2) {
            double area1 = 0;
            double area2 = 0;
            try {
                ConeServiceImpl coneService = new ConeServiceImpl();
                area1 = coneService.calculateTotalSurfaceArea(o1);
                area2 = coneService.calculateTotalSurfaceArea(o2);
            } catch (ConeException e) {
                logger.log(Level.ERROR, e.toString());
            }
            return (int) (area1 - area2);
        }

    };

    private static final Logger logger = LogManager.getLogger();
}
