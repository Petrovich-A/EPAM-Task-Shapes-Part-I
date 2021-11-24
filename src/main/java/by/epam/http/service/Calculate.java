package by.epam.http.service;

import by.epam.http.entity.Cone;

public class Calculate {
    private double totalSurfaceArea;
    private double lateralSurfaceArea;

    public Calculate() {
    }

    public double calculateTotalSurfaceArea(Cone cone) {
        double lateralSurfaceArea = calculateLateralSurfaceArea(cone);
        double totalSurfaceArea = lateralSurfaceArea + Math.PI * Math.pow(cone.getRadius(), 2);
        return totalSurfaceArea;
    }

    public double calculateLateralSurfaceArea(Cone cone) {
        double lateralSurfaceArea = Math.PI * cone.getRadius() * cone.getHeight();
        return lateralSurfaceArea;
    }

}
