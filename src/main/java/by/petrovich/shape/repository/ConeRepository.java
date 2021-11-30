package by.petrovich.shape.repository;

import by.petrovich.shape.comparator.ConeComparator;
import by.petrovich.shape.entity.Cone;
import by.petrovich.shape.exception.ConeException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConeRepository {
    private static final ConeRepository instance = new ConeRepository();
    private final List<Cone> coneStorage;

    private ConeRepository() {
        coneStorage = new ArrayList<>();
    }

    public static ConeRepository getInstance() {
        return instance;
    }

    public int size() {
        return coneStorage.size();
    }

    public boolean isEmpty() {
        return coneStorage.isEmpty();
    }

    public List<Cone> sort(ConeComparator coneComparator) {
        return coneStorage.stream()
                .sorted(coneComparator)
                .collect(Collectors.toList());
    }

    public void clear() {
        coneStorage.clear();
    }

    public Cone get(int index) throws ConeException {
        if (index >= coneStorage.size()) {
            throw new ConeException("Index is invalid");
        }
        return coneStorage.get(index);
    }

    public void set(int index, Cone cone) {
        coneStorage.set(index, cone);
    }

    public void add(Cone cone) {
        coneStorage.add(cone);
    }

}
