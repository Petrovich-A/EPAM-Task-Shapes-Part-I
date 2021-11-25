package by.epam.http.service;

import by.epam.http.entity.Cone;
import by.epam.http.exception.ConeException;

public interface ConeService {

    public double calculateTotalSurfaceArea(Cone cone) throws ConeException;

    public double calculateLateralSurfaceArea(Cone cone) throws ConeException;
}
