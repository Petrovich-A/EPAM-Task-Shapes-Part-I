package by.petrovich.shape.observer;

public interface ConeObservable {
    void attach(ConeObserver observer);

    void detach(ConeObserver observer);

    void notifyObservers();
}
