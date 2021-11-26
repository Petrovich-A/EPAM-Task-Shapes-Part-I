package by.epam.http.entity;

import by.epam.http.exception.ConeException;
import by.epam.http.observer.ConeEvent;
import by.epam.http.observer.ConeObservable;
import by.epam.http.observer.ConeObserver;
import by.epam.http.util.ConeIdGenerator;

import java.util.ArrayList;
import java.util.List;

public class Cone implements ConeObservable {
    private final String coneId;
    private Point2D firstPoint;
    private Point2D secondPoint;
    private double radius;
    private double height;
    List<ConeObserver> observers = new ArrayList<>();

    public Cone(Point2D firstPoint, Point2D secondPoint, double radius, double height) throws ConeException {

        this.coneId = ConeIdGenerator.generateId();
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.radius = radius;
        this.height = height;
    }

    public Cone(Point2D firstPoint2D, Point2D secondPoint2D) {
        this.coneId = ConeIdGenerator.generateId();
    }

    public String getConeId() {
        return coneId;
    }

    public Point2D getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point2D firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Point2D getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point2D secondPoint) {
        this.secondPoint = secondPoint;
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

    @Override
    public void attach(ConeObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(ConeObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ConeObserver observer : observers) {
            if (observer != null) {
                ConeEvent coneEvent = new ConeEvent(this);
                observer.updateParameters(coneEvent);
            }
        }

    }
}
