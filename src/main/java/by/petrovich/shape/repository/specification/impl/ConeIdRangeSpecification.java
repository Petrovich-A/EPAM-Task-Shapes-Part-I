package by.petrovich.shape.repository.specification.impl;

import by.petrovich.shape.entity.Cone;
import by.petrovich.shape.repository.specification.ConeSpecification;

public class ConeIdRangeSpecification implements ConeSpecification {
    private final int toId;
    private final int fromId;

    public ConeIdRangeSpecification(int toId, int fromId) {
        this.toId = toId;
        this.fromId = fromId;
    }

    @Override
    public boolean specify(Cone cone) {
        return fromId <= cone.getConeId() && toId > cone.getConeId();
    }
}
