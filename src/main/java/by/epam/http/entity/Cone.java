package by.epam.http.entity;

import by.epam.http.service.ConeIdGenerator;

import java.util.Objects;

public class Cone extends Point{
    private final String Id;
    private double radius;
    private double height;

    ConeIdGenerator coneIdGenerator = new ConeIdGenerator();

    public Cone(double x, double y, double radius, double height) {
        super(x, y);
        this.Id = coneIdGenerator.createId();
        this.radius = radius;
        this.height = height;
    }

    public String getId() {
        return Id;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public ConeIdGenerator getConeIdGenerator() {
        return coneIdGenerator;
    }

    public void setConeIdGenerator(ConeIdGenerator coneIdGenerator) {
        this.coneIdGenerator = coneIdGenerator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cone cone = (Cone) o;
        return Double.compare(cone.radius, radius) == 0 && Double.compare(cone.height, height) == 0 && Id.equals(cone.Id) && coneIdGenerator.equals(cone.coneIdGenerator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Id, radius, height, coneIdGenerator);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cone{");
        sb.append("ID='").append(Id).append('\'');
        sb.append(", radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append(", coneIdGenerator=").append(coneIdGenerator);
        sb.append('}');
        return sb.toString();
    }
}
