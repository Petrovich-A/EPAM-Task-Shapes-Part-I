package by.epam.http.service;

import by.epam.http.entity.Cone;
import by.epam.http.exception.ConeException;
import by.epam.http.factory.ConeFactory;
import by.epam.http.validator.impl.ConeValidatorImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ConeServiceImplTest {
    private final ConeFactory coneFactory = ConeFactory.getInstance();
    private final ConeValidatorImpl coneValidatorImpl = new ConeValidatorImpl();
    private final String expectedMessage = "Cone is invalid";

    @Test
    public void ifCalculateLateralSurfaceAreaReturnsValidValue() throws ConeException {
        List<Double> pointsCoordinates = new ArrayList<>();
        pointsCoordinates.add(10.2);
        pointsCoordinates.add(-4554.544);
        pointsCoordinates.add(545.5);
        pointsCoordinates.add(20.2);
        Cone cone = coneFactory.getCone(pointsCoordinates);
        Assert.assertTrue("cone validation", coneValidatorImpl.isConeValid(cone));

    }
}
