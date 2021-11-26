package by.epam.http.warehouse;

public class ConeParameters {
    private double totalSurfaceArea;
    private double lateralSurfaceArea;

    public ConeParameters(double totalSurfaceArea, double lateralSurfaceArea) {
        this.totalSurfaceArea = totalSurfaceArea;
        this.lateralSurfaceArea = lateralSurfaceArea;
    }

    public double getTotalSurfaceArea() {
        return totalSurfaceArea;
    }

    public void setTotalSurfaceArea(double totalSurfaceArea) {
        this.totalSurfaceArea = totalSurfaceArea;
    }

    public double getLateralSurfaceArea() {
        return lateralSurfaceArea;
    }

    public void setLateralSurfaceArea(double lateralSurfaceArea) {
        this.lateralSurfaceArea = lateralSurfaceArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConeParameters)) return false;

        ConeParameters that = (ConeParameters) o;

        if (Double.compare(that.getTotalSurfaceArea(), getTotalSurfaceArea()) != 0) return false;
        return Double.compare(that.getLateralSurfaceArea(), getLateralSurfaceArea()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getTotalSurfaceArea());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getLateralSurfaceArea());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ConeParameters{");
        sb.append("totalSurfaceArea=").append(totalSurfaceArea);
        sb.append(", lateralSurfaceArea=").append(lateralSurfaceArea);
        sb.append('}');
        return sb.toString();
    }
}
