package by.petrovich.shape.validator.impl;

import by.petrovich.shape.entity.Cone;
import by.petrovich.shape.validator.ConeValidatable;

public class ConeValidatorImpl implements ConeValidatable {
    private final double MAX_VALUE_POINT = 1000;

    @Override
    public boolean isConeValid(Cone cone) {
        if (Math.abs(cone.getPoint().getX()) > MAX_VALUE_POINT || Math.abs(cone.getPoint().getY()) > MAX_VALUE_POINT
                || cone.getRadius() <= 0 || cone.getSlantHeight() <= 0) {
            return false;
        }
        return true;
    }
}
