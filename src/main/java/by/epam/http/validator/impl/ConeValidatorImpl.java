package by.epam.http.validator.impl;

import by.epam.http.entity.Cone;
import by.epam.http.validator.ConeValidatable;

public class ConeValidatorImpl implements ConeValidatable {
    private final double MAX_VALUE_POINT = 1000;

    @Override
    public boolean isConeValid(Cone cone) {
        if (Math.abs(cone.getFirstPoint()) > MAX_VALUE_POINT || Math.abs(cone.getSecondPoint()) > MAX_VALUE_POINT
                || cone.getRadius() <= 0 || cone.getHeight() <= 0) {
            return false;
        }
        return true;
    }
}
