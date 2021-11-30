package by.epam.http.service.impl;

import by.epam.http.entity.Cone;
import by.epam.http.entity.Point2D;
import by.epam.http.exception.ConeException;
import junit.framework.TestCase;

public class ConeServiceImplTest extends TestCase {
    ConeServiceImpl coneService = new ConeServiceImpl();

    public void testCalculateTotalSurfaceArea() throws ConeException {
        double result = 235.61944901923448;
        Cone cone = new Cone(new Point2D(0,0), 5, 10);
        assertEquals(result, coneService.calculateTotalSurfaceArea(cone));
    }

    public void testCalculateLateralSurfaceArea() {
    }
}