package by.petrovich.shape.service;

import by.petrovich.shape.entity.Cone;
import by.petrovich.shape.exception.ConeException;

public interface ConeService {
    double calculateTotalSurfaceArea(Cone cone) throws ConeException;

    double calculateLateralSurfaceArea(Cone cone) throws ConeException;
}
