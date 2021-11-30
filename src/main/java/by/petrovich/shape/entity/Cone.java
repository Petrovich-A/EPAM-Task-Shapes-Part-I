package by.petrovich.shape.entity;

import by.petrovich.shape.observer.ConeEvent;
import by.petrovich.shape.observer.ConeObservable;
import by.petrovich.shape.observer.ConeObserver;
import by.petrovich.shape.util.ConeIdGenerator;

import java.util.ArrayList;
import java.util.List;

public class Cone implements ConeObservable {
    private final int coneId;
    private Point2D point;
    private double radius;
    private double slantHeight;
    List<ConeObserver> observers = new ArrayList<>();

    public Cone(Point2D point, double radius, double slantHeight) {
        this.coneId = ConeIdGenerator.generateId();
        this.point = new Point2D(point.getX(), point.getY());
        this.radius = radius;
        this.slantHeight = slantHeight;
    }

    public int getConeId() {
        return coneId;
    }

    public Point2D getPoint() {
        return point;
    }

    public void setPoint(Point2D point) {
        this.point = point;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSlantHeight() {
        return slantHeight;
    }

    public void setSlantHeight(double slantHeight) {
        this.slantHeight = slantHeight;
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
